package br.com.altamira.data.rest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class PermissionInterceptor implements ContainerRequestFilter {

    /**
     *
     */
    private static final String AUTH_URL = "http://data.altamira.com.br/security-oauth2-0.2.0-SNAPSHOT/authz/permission";

    /**
     *
     */
    private static final String PERMISSION_GET = "READ";

    /**
     *
     */
    private static final String PERMISSION_POST = "CREATE";

    /**
     *
     */
    private static final String PERMISSION_PUT = "UPDATE";

    /**
     *
     */
    private static final String PERMISSION_DELETE = "DELETE";

    @Context
    private ResourceInfo resourceInfo;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {

        if (requestContext.getUriInfo().getQueryParameters().get("token") != null) {
            String token = requestContext.getUriInfo().getQueryParameters().get("token").get(0);
            System.out.println(token);

            Method method = resourceInfo.getResourceMethod();

            StringBuilder resource = new StringBuilder();

            // Retrieve resource from Resource Annontation
            resource.append(resourceInfo.getResourceClass().getAnnotation(Resource.class).name());

            // Retrieve class' @Path value
            if (resource.length() == 0) {
                if (resourceInfo.getResourceClass().isAnnotationPresent(Path.class)) {
                    resource.append(resourceInfo.getResourceClass().getAnnotation(Path.class).value());
                }

                // Retrieve method's @Path value
                if (method.isAnnotationPresent(Path.class)) {
                    String methodPath = method.getAnnotation(Path.class).value();

                    if (methodPath.startsWith("/")) {
                        resource.append(methodPath);
                    } else {
                        resource.append("/").append(methodPath);
                    }
                }
            }

            // To opt out for Endpoint class-name as resource, use below:
            if (resource.length() == 0) {
                resource.append(resourceInfo.getResourceClass().getName());
            }

            // Retrieve permission type
            String permission = null;

            if (method.isAnnotationPresent(Permission.class)) {
                permission = method.getAnnotation(Permission.class).name();
            } else if (method.isAnnotationPresent(GET.class)) {
                permission = PERMISSION_GET;
            } else if (method.isAnnotationPresent(POST.class)) {
                permission = PERMISSION_POST;
            } else if (method.isAnnotationPresent(PUT.class)) {
                permission = PERMISSION_PUT;
            } else if (method.isAnnotationPresent(DELETE.class)) {
                permission = PERMISSION_DELETE;
            }

            Response authResponse = checkAuth(token, resource.toString(), permission);

            if (authResponse.getStatus() != 200) {
                String message = authResponse.readEntity(HashMap.class).get("message").toString();
                requestContext.abortWith(Response.status(authResponse.getStatus()).entity(message).build());
            }

        } else {
            Response response = Response.status(Response.Status.UNAUTHORIZED).entity("Token required").build();
            requestContext.abortWith(response);
        }

    }

    /**
     * Check the Auth Token
     *
     * @param token
     * @param resource
     * @param permission
     * @return Response
     */
    public Response checkAuth(String token, String resource, String permission) {
        Response response = null;

        try {
            String url = AUTH_URL + "?token=" + token + "&permission=" + permission;
            Client client = ClientBuilder.newClient();
            WebTarget webTarget = client.target(url);
            Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

            HashMap<String, String> map = new HashMap<>();
            map.put("resource", resource);

            return invocationBuilder.post(Entity.json(map));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return response;
    }

}
