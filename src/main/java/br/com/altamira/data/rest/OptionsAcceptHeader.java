/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import java.io.IOException;

import java.util.Collections;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Alessandro
 */
@Provider
public class OptionsAcceptHeader implements ContainerResponseFilter {

  @Override
  public void filter(ContainerRequestContext requestContext,
                     ContainerResponseContext responseContext) throws IOException {

    if ("OPTIONS".equals(requestContext.getMethod())) {
      if (responseContext.getHeaderString("Accept-Patch")==null) {
        responseContext.getHeaders().put(
          "Accept-Patch", Collections.<Object>singletonList("application/json-patch+json"));  
      }
    }
  }
}