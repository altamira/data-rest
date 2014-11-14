/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.bom;

import br.com.altamira.data.dao.manufacturing.bom.BOMItemPartDao;
import br.com.altamira.data.model.manufacturing.bom.BOMItemPart;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ENTITY_VALIDATION;
import static br.com.altamira.data.rest.BaseEndpoint.ID_VALIDATION;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilderException;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacturing/bom/{bom:[0-9]*}/item/{item:[0-9]*}/part")
public class BOMItemPartEndpoint extends BaseEndpoint<BOMItemPart> {

    @EJB
    private BOMItemPartDao bomItemPartDao;
    
    /**
     *
     */
    public BOMItemPartEndpoint() {
        this.type = BOMItemPartEndpoint.class;
    }

    /**
     *
     * @param itemId
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("item") long itemId,
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        return createListResponse(
                bomItemPartDao.list(itemId, startPosition, maxResult)).build();
    }

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    /*@GET
    @Path("/{id:[0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response find(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        return createEntityResponse(
                bomItemPartDao.find(id)).build();
    }*/

    /**
     *
     * @param bomId
     * @param itemId
     * @param entity
     * @return
     * @throws IllegalArgumentException
     * @throws UriBuilderException
     * @throws JsonProcessingException
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("bom") long bomId,
            @Min(value = 1, message = ID_VALIDATION) @PathParam("item") long itemId,
            @NotNull(message = ENTITY_VALIDATION) BOMItemPart entity)
            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {

        return createCreatedResponse(
                bomItemPartDao.create(itemId, entity)).build();
    }

    /**
     *
     * @param bomId
     * @param itemId
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
            @Min(value = 1, message = ID_VALIDATION) @PathParam("bom") long bomId,
            @Min(value = 1, message = ID_VALIDATION) @PathParam("item") long itemId,
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) BOMItemPart entity)
            throws JsonProcessingException {

        return createEntityResponse(
                bomItemPartDao.update(itemId, entity)).build();
    }

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @DELETE
    @Path("/{id:[0-9]*}")
    @Override
    public Response delete(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        bomItemPartDao.remove(id);

        return createNoContentResponse().build();
    }

}
