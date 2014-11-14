/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * 
 * @author Alessandro
 */
@Provider
public class ConstraintViolationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

    @Inject
    private Logger log;

    @Context
    HttpHeaders headers;
    
    /**
     *
     * @param exception
     * @return
     */
    @Override
    public Response toResponse(ConstraintViolationException exception) {
        Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();
        
        log.log(Level.FINE, "Validation completed. violations found: {0}", violations.size());

        Map<String, Object> message = new HashMap<>();

        message.put("exception", exception.getClass().toString());

        List<String> sources = new ArrayList<>();
        
        sources.add(exception.toString());
        
        message.put("source", sources);
        
        List<String> causes = new ArrayList<>();
        
        causes.add(exception.getMessage());
        
        message.put("message", causes);
        
        message.put("trace", Arrays.toString(exception.getStackTrace()));

        violations.stream().forEach((violation) -> {
            message.put(violation.getPropertyPath().toString(), violation.getMessage());
        });

        Response.ResponseBuilder responseBuilder = 
                Response.status(Response.Status.BAD_REQUEST).entity(message);

        if (headers.getHeaderString("Origin") != null && !headers.getHeaderString("Origin").isEmpty()) {
            responseBuilder
                    .header("Access-Control-Allow-Credentials", "true")
                    .header("Access-Control-Allow-Origin", headers.getHeaderString("Origin").isEmpty());
        }

        return responseBuilder.build();
    }
    
}
