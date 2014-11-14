/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.validation.ConstraintDeclarationException;
import javax.validation.ConstraintDefinitionException;
import javax.validation.GroupDefinitionException;

import javax.validation.ValidationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import org.jboss.resteasy.api.validation.ResteasyViolationException;
import org.jboss.resteasy.api.validation.ViolationReport;


/**
 *
 * @author Alessandro
 */
@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {

    @Inject
    private Logger log;

    @Context
    HttpHeaders headers;
    
//    @Override
//    public Response toResponse(ValidationException exception) {
//        log.log(Level.FINE, "Validation completed. violations found: {0}", exception.getMessage());
//
//        Map<String, Object> message = new HashMap<>();
//
//        message.put("exception", exception.getClass().toString());
//        
//        List<String> sources = new ArrayList<>();
//        
//        sources.add(exception.toString());
//        
//        message.put("source", sources);
//        
//        List<String> causes = new ArrayList<>();
//        
//        causes.add(exception.getMessage());
//        
//        message.put("message", causes);
//        
//        message.put("trace", Arrays.toString(exception.getStackTrace()));
//        
//        Response.ResponseBuilder responseBuilder = Response.status(Response.Status.CONFLICT).entity(message);
//
//        if (headers.getHeaderString("Origin") != null && !headers.getHeaderString("Origin").isEmpty()) {
//            responseBuilder
//                    .header("Access-Control-Allow-Credentials", "true")
//                    .header("Access-Control-Allow-Origin", headers.getHeaderString("Origin").isEmpty());
//        }
//
//        return responseBuilder.build();
//
//    }
    
    /**
     *
     * @param exception
     * @return
     */
        
    @Override
    public Response toResponse(ValidationException exception) {
        if (exception instanceof ConstraintDefinitionException) {
            return buildResponse(unwrapException(exception), MediaType.TEXT_PLAIN, Status.INTERNAL_SERVER_ERROR);
        }
        if (exception instanceof ConstraintDeclarationException) {
            return buildResponse(unwrapException(exception), MediaType.TEXT_PLAIN, Status.INTERNAL_SERVER_ERROR);
        }
        if (exception instanceof GroupDefinitionException) {
            return buildResponse(unwrapException(exception), MediaType.TEXT_PLAIN, Status.INTERNAL_SERVER_ERROR);
        }
        if (exception instanceof ResteasyViolationException) {
            ResteasyViolationException resteasyViolationException = ResteasyViolationException.class.cast(exception);
            Exception e = resteasyViolationException.getException();
            if (e != null) {
                return buildResponse(unwrapException(e), MediaType.TEXT_PLAIN, Status.INTERNAL_SERVER_ERROR);
            /*} else if (resteasyViolationException.getReturnValueViolations().size() == 0) {
                return buildViolationReportResponse(resteasyViolationException, Status.BAD_REQUEST);*/
            } else {
                return buildViolationReportResponse(resteasyViolationException, Status.INTERNAL_SERVER_ERROR);
            }
        }
        return buildResponse(unwrapException(exception), MediaType.TEXT_PLAIN, Status.INTERNAL_SERVER_ERROR);
    }
 
    /**
     *
     * @param entity
     * @param mediaType
     * @param status
     * @return
     */
    protected Response buildResponse(Object entity, String mediaType, Status status) {
        ResponseBuilder builder = Response.status(status).entity(entity);
        builder.type(MediaType.TEXT_PLAIN);
        //builder.header(Validation.VALIDATION_HEADER, "true");
        return builder.build();
    }
 
    /**
     *
     * @param exception
     * @param status
     * @return
     */
    protected Response buildViolationReportResponse(ResteasyViolationException exception, Status status) {
        ResponseBuilder builder = Response.status(status);
        //builder.header(Validation.VALIDATION_HEADER, "true");
 
        // Check standard media types.
        MediaType mediaType = getAcceptMediaType(exception.getAccept());
        if (mediaType != null) {
            builder.type(mediaType);
            builder.entity(new ViolationReport(exception));
            return builder.build();
        }
 
        // Default media type.
        builder.type(MediaType.TEXT_PLAIN);
        builder.entity(exception.toString());
        return builder.build();
    }
 
    /**
     *
     * @param t
     * @return
     */
    protected String unwrapException(Throwable t) {
        StringBuffer sb = new StringBuffer();
        doUnwrapException(sb, t);
        return sb.toString();
    }
 
    private void doUnwrapException(StringBuffer sb, Throwable t) {
        if (t == null) {
            return;
        }
        sb.append(t.toString());
        if (t.getCause() != null && t != t.getCause()) {
            sb.append('[');
            doUnwrapException(sb, t.getCause());
            sb.append(']');
        }
    }
 
    private MediaType getAcceptMediaType(List<MediaType> accept) {
        Iterator<MediaType> it = accept.iterator();
        while (it.hasNext()) {
            MediaType mt = it.next();
            /*
             * application/xml media type causes an exception:
             * org.jboss.resteasy.core.NoMessageBodyWriterFoundFailure: Could not find MessageBodyWriter for response
             * object of type: org.jboss.resteasy.api.validation.ViolationReport of media type: application/xml
             */
            /*if (MediaType.APPLICATION_XML_TYPE.getType().equals(mt.getType())
                    && MediaType.APPLICATION_XML_TYPE.getSubtype().equals(mt.getSubtype())) {
                return MediaType.APPLICATION_XML_TYPE;
            }*/
            if (MediaType.APPLICATION_JSON_TYPE.getType().equals(mt.getType())
                    && MediaType.APPLICATION_JSON_TYPE.getSubtype().equals(mt.getSubtype())) {
                return MediaType.APPLICATION_JSON_TYPE;
            }
        }
        return null;
    }
}
