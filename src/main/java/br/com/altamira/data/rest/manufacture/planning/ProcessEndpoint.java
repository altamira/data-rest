/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.planning;

import br.com.altamira.data.dao.manufacture.planning.ProcessDao;
import br.com.altamira.data.dao.manufacture.planning.ProduceDao;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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
@Resource(name = "MANUFACTURE_PLANNING")
@Path("/manufacture/planning/process")
public class ProcessEndpoint extends BaseEndpoint<br.com.altamira.data.model.manufacture.planning.Process> {

    @Inject
    private ProduceDao produceDao;

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

        return createListResponse(((ProcessDao) dao).listBOM(map, startPosition, maxResult)).build();
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
    public Response ListBOMItem(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(((ProcessDao) dao).listBOMItem(map, startPosition, maxResult)).build();
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
    public Response ListBOMItemComponent(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(((ProcessDao) dao).listBOMItemComponent(map, startPosition, maxResult)).build();
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

        return createListResponse(((ProcessDao) dao).listSummary(map, startPosition, maxResult)).build();
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
    @Path("/{id:[0-9]*}/component")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response ListComponent(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(((ProcessDao) dao).listComponent(map, startPosition, maxResult)).build();
    }

    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component/{id:[0-9]*}/produce")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response ListProduce(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(((ProcessDao) dao).listProduce(map, startPosition, maxResult)).build();
    }

    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws JsonProcessingException
     */
    @GET
    @Path("/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component/{id:[0-9]*}/produce/{id:[0-9]*}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getProduceById()
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createEntityResponse(((ProcessDao) dao).getProduceById(map)).build();
    }

    /*@PUT
     @Path(value = "/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component/{id:[0-9]*}/produce/{id:[0-9]*}")
     public Response updateProduce(@PathParam(value = "id") long id, Produce entity)
     throws JsonProcessingException {

     return createEntityResponse(
     produceDao.update(entity, info.getPathParameters())).build();
     }

     @POST
     @Path(value = "/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component/{id:[0-9]*}/produce")
     @Consumes(value = MediaType.APPLICATION_JSON)
     @Produces(value = MediaType.APPLICATION_JSON)
     public Response createProduce(
     @NotNull(message = ENTITY_VALIDATION) Produce entity)
     throws IllegalArgumentException, UriBuilderException,
     JsonProcessingException {

     return createEntityResponse(produceDao.create(entity, info.getPathParameters())).build();
     }

     @DELETE
     @Path(value = "/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component/{id:[0-9]*}/produce/{id:[0-9]*}")
     public Response deleteProduce(
     @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
     throws JsonProcessingException {

     produceDao.remove(id);

     return createNoContentResponse().build();
     }*/
}
