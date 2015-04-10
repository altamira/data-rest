package br.com.altamira.data.rest;

import java.io.IOException;
import java.util.HashMap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
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
public class PermissionInerceptor implements ContainerRequestFilter{
	
	/**
	 * 
	 */
	private static final String AUTH_URL = "http://localhost:8080/security-oauth2-0.2.0-SNAPSHOT/authz/permission";
	
	/**
	 * 
	 */
	private static final String RESOURCE = "BOM";
	
	@Context
	private ResourceInfo resourceInfo;
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {

		if(requestContext.getUriInfo().getQueryParameters().get("token")!=null)
		{
			String token = requestContext.getUriInfo().getQueryParameters().get("token").get(0);
			System.out.println(token);

			//TODO - Retrieve the @Path value for the method & pass it as RESOURCE_NAME
			/*Method method = resourceInfo.getResourceMethod();
			
			Annotation[] annotations = method.getDeclaredAnnotations();
			for(Annotation an : annotations)
			{
				System.out.println(an.toString());
			}*/
			
			Response authResponse = checkAuth(token);
			if(authResponse.getStatus() != 200)
			{
				String message = authResponse.readEntity(HashMap.class).get("message").toString();
				requestContext.abortWith(Response.status(authResponse.getStatus()).entity(message).build());
			}

		}
		else
		{
			Response response = Response.status(Response.Status.UNAUTHORIZED).entity("Token required").build();
			requestContext.abortWith(response);
		}
		
	}
	
	/**
	 * Check the Auth Token
	 * @param Token String
	 * @return Response
	 */
	public Response checkAuth(String token) {
		Response response = null;

		try {
			String url = AUTH_URL + "?token=" + token + "&resource=" + RESOURCE + "&permission=READ";
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(url);
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			return invocationBuilder.get();
		} catch (Exception e) {            
			System.out.println(e.getMessage());

		}
		return response;
	}

}
