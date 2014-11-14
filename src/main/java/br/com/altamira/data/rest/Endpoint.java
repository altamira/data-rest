/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import br.com.altamira.data.model.Entity;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilderException;

/**
 * Endpoint interface
 * 
 * TODO enable interface for all Endpoint services when this issue have a patch
 * See https://issues.jboss.org/browse/WFLY-2724
 * 
 * @param <T>
 */
public interface Endpoint<T extends Entity> {

    /**
     *
     */
    public static final String NOT_FOUND = "Entity not found.";

    /**
     *
     */
    public static final String START_PAGE_VALIDATION = "Invalid start page number, must be greater than 0.";

    /**
     *
     */
    public static final String PAGE_SIZE_VALIDATION = "Invalid page size, must be greater than 0.";

    /**
     *
     */
    public static final String ID_VALIDATION = "Invalid id, must be greater than zero.";

    /**
     *
     */
    public static final String ENTITY_VALIDATION = "Entity can't be null.";

    /**
     *
     */
    public static final String ID_NULL_VALIDATION = "Entity id must be null or zero.";

    /**
     *
     */
    public static final String ID_NOT_NULL_VALIDATION = "Entity id can't be null or zero.";

    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response list(
            @DefaultValue(value = "0") @QueryParam(value = "start") Integer startPosition,
            @DefaultValue(value = "10") @QueryParam(value = "max") Integer maxResult)
            throws IOException;

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path(value = "{id:[0-9]*}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response find(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException;

    /**
     *
     * @param startPosition
     * @param maxResult
     * @param searchCriteria
     * @return
     * @throws IOException
     */
    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult,
            @Size(min = 2) @QueryParam("search") String searchCriteria)
            throws IOException;
    
    /**
     *
     * @param entity
     * @return
     * @throws IllegalArgumentException
     * @throws UriBuilderException
     * @throws JsonProcessingException
     */
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response create(
            @NotNull(message = ENTITY_VALIDATION) T entity)
            throws IllegalArgumentException, UriBuilderException, JsonProcessingException;

    /**
     *
     * @param id
     * @param entity
     * @param headers
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path(value = "/{id:[0-9]*}")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response update(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) T entity)
            throws JsonProcessingException;

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @DELETE
    @Path(value = "{id:[0-9]*}")
    public Response delete(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException;
    /**
     *
     * @param id
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    @DELETE
    @Path(value = "{id:[0-9]*}")
    public Response delete(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) T entity)
            throws JsonProcessingException;

}
