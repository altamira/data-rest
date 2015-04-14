/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Alessandro
 */
@Provider
public class CORSFilter implements ContainerResponseFilter {
    
    @Context
    HttpHeaders headers;
    
    @Context
    UriInfo uriInfo;
    
    /*
    @Context
    private ResourceInfo resourceInfo;
    */
    
    @Override
    public void filter(final ContainerRequestContext requestContext,
            final ContainerResponseContext responseContext) throws IOException {
        if (!headers.getRequestHeader("Origin").isEmpty()) {
            responseContext.getHeaders().add("Access-Control-Allow-Origin", headers.getRequestHeader("Origin").get(0));
            responseContext.getHeaders().add("Access-Control-Allow-Headers", "Access-Control-Allow-Origin, Origin, Content-Type, Content-Length, Accept, Authorization, X-Requested-With");
            responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
            responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
            responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
        }
    }

}
