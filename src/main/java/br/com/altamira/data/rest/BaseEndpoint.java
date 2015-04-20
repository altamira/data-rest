/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import br.com.altamira.data.dao.BaseDao;
import br.com.altamira.data.model.serialize.JSonViews;
import br.com.altamira.data.model.serialize.NullProvider;
import br.com.altamira.data.model.serialize.NullValueSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriBuilderException;
import javax.ws.rs.core.UriInfo;

/**
 *
 * Base rest services
 *
 * @param <T>
 */
public abstract class BaseEndpoint<T extends br.com.altamira.data.model.Entity> /* implements Endpoint<T> */ {

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
     */
    @Inject
    protected Logger log;

    /**
     *
     */
    @Context
    protected HttpHeaders headers;

    @Inject
    protected BaseDao<T> dao;

    @Context
    protected UriInfo info;

    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(
                dao.list(map, startPosition, maxResult)).build();
    }

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
            @Min(value = 0, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        return createEntityResponse(
                dao.find(id)).build();
    }

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
            throws IllegalArgumentException, UriBuilderException,
            JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());
        
        return createCreatedResponse(dao.create(entity, map)).build();
    }

    /**
     *
     * @param id
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path(value = "{id:[0-9]*}")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response update(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) T entity)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());
        
        return createEntityResponse(
                dao.update(entity, map)).build();
    }

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
            throws JsonProcessingException {

        dao.remove(id);

        return createNoContentResponse().build();
    }

    /**
     *
     * @param entity
     * @param objectWriter
     * @return
     * @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createOkResponse(Object entity, ObjectWriter objectWriter)
            throws JsonProcessingException {

        ResponseBuilder responseBuilder;

        responseBuilder = Response.ok();

        responseBuilder.header("Location", info.getRequestUri());

        responseBuilder.entity(objectWriter.writeValueAsString(entity));

        return responseBuilder;
    }

    /**
     *
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createCreatedResponse(T entity)
            throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Hibernate4Module hibernateModule = new Hibernate4Module();
        hibernateModule.configure(Hibernate4Module.Feature.FORCE_LAZY_LOADING, false);
        hibernateModule.disable(Hibernate4Module.Feature.USE_TRANSIENT_ANNOTATION);
        objectMapper.registerModule(hibernateModule);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        ObjectWriter writer = objectMapper.writerWithView(JSonViews.EntityView.class);

        ResponseBuilder responseBuilder = Response.created(UriBuilder.fromUri(info.getRequestUri()).path(String.valueOf(entity.getId())).build());

        responseBuilder.entity(writer.writeValueAsString(entity));

        return responseBuilder;
    }

    /**
     *
     * @return @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createNoContentResponse()
            throws JsonProcessingException {

        ResponseBuilder responseBuilder = Response.noContent();

        responseBuilder.header("Location", info.getRequestUri());

        return responseBuilder;
    }

    /**
     *
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createListResponse(Object entity)
            throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Hibernate4Module hibernateModule = new Hibernate4Module();
        hibernateModule.configure(Hibernate4Module.Feature.FORCE_LAZY_LOADING, false);
        hibernateModule.disable(Hibernate4Module.Feature.USE_TRANSIENT_ANNOTATION);
        objectMapper.registerModule(hibernateModule);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        ObjectWriter writer = objectMapper.writerWithView(JSonViews.ListView.class);

        return createOkResponse(entity, writer);
    }

    /**
     *
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createEntityResponse(Object entity)
            throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Hibernate4Module hibernateModule = new Hibernate4Module();
        hibernateModule.configure(Hibernate4Module.Feature.FORCE_LAZY_LOADING, false);
        hibernateModule.disable(Hibernate4Module.Feature.USE_TRANSIENT_ANNOTATION);
        hibernateModule.configure(Hibernate4Module.Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS, true);
        objectMapper.registerModule(hibernateModule);

        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        ObjectWriter writer = objectMapper.writerWithView(JSonViews.EntityView.class);

        objectMapper.setSerializerProvider(new NullProvider());

        return createOkResponse(entity, writer);
    }

    /**
     *
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    protected Response.ResponseBuilder createLobResponse(Object entity)
            throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        Hibernate4Module hibernateModule = new Hibernate4Module();
        hibernateModule.configure(Hibernate4Module.Feature.FORCE_LAZY_LOADING, true);
        hibernateModule.disable(Hibernate4Module.Feature.USE_TRANSIENT_ANNOTATION);
        objectMapper.registerModule(hibernateModule);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        ObjectWriter writer = objectMapper.writerWithView(JSonViews.LobView.class);

        return createOkResponse(entity, writer);
    }

    /**
     *
     * @return
     */
    protected Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }

}
