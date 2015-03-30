/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.planning;

import br.com.altamira.data.dao.manufacture.planning.OperationDao;
import br.com.altamira.data.model.manufacture.planning.Operation;
import br.com.altamira.data.rest.BaseEndpoint;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacture/planning/operation")
public class OperationEndpoint extends BaseEndpoint<Operation> {

    @OPTIONS
    @Path("/{id:[0-9]*}/bom")
    public Response corsPreflightForListBOM(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }

    /**
     * Replace delivery dates in batch
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/{id:[0-9]*}/bom")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response ListBOM(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());
        
        //((BOMDao) dao).replaceRemainingDeliveryDates(id, dates);
        return createListResponse(((OperationDao) dao).listBOM(map, startPosition, maxResult)).build();
    }    
    
    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/{id:[0-9]*}/bom/{id:[0-9]*}/item")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response ListItem(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());
        
        return createListResponse(((OperationDao) dao).listBOMItem(map, startPosition, maxResult)).build();
    }
    
    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response ListComponent(
    		@DefaultValue("0") @QueryParam("start") Integer startPosition,
    		@DefaultValue("10") @QueryParam("max") Integer maxResult)
    				throws JsonProcessingException {

    	MultivaluedMap<String, String> map = info.getPathParameters();

    	map.putAll(info.getQueryParameters());

    	return createListResponse(((OperationDao) dao).listBOMItemComponent(map, startPosition, maxResult)).build();
    }
    
    /**
     * Replace delivery dates in batch
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/summary")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response ListSummary(
    		@DefaultValue("0") @QueryParam("start") Integer startPosition,
    		@DefaultValue("10") @QueryParam("max") Integer maxResult)
    				throws JsonProcessingException {

    	MultivaluedMap<String, String> map = info.getPathParameters();

    	map.putAll(info.getQueryParameters());

    	return createListResponse(((OperationDao) dao).listSummary(map, startPosition, maxResult)).build();
    }
}
