/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.bom;

import br.com.altamira.data.dao.manufacturing.bom.BOMDao;
import br.com.altamira.data.model.manufacturing.bom.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
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
 * Bill of Material rest services
 */
@RequestScoped
@Path("/manufacturing/bom")
public class BOMEndpoint
        extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

    @EJB
    private BOMDao bomDao;

    /**
     *
     */
    public BOMEndpoint() {
        this.type = BOMEndpoint.class;
    }
    
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

        return createListResponse(
                bomDao.listUnchecked(startPosition, maxResult)).build();
    }

    /**
     *
     * @param startPosition
     * @param maxResult
     * @param search
     * @return
     * @throws IOException
     */
    @GET
    @Path("/search")
    @Produces(MediaType.APPLICATION_JSON)
    public Response search(
            @Size(min = 2) @QueryParam("search") String search,
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        return createListResponse(
                bomDao.search(search, startPosition, maxResult)).build();
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
    public Response find(
            @Min(1) @PathParam("id") long id)
            throws JsonProcessingException {

        return createEntityResponse(bomDao.find(id)).build();
    }*/

    /**
     *
     * @param entity
     * @return
     * @throws IllegalArgumentException
     * @throws UriBuilderException
     * @throws JsonProcessingException
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response create(
            @NotNull(message = ENTITY_VALIDATION) BOM entity)
            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {

        return createCreatedResponse(bomDao.create(entity)).build();
    }

    /**
     *
     * @param id
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path("/{id:[0-9]*}")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Override
    public Response update(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) BOM entity)
            throws JsonProcessingException {

        return createEntityResponse(
                bomDao.update(entity)).build();
    }

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path("/{id:[0-9]*}/checked")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response updateToChecked(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        return createEntityResponse(
                bomDao.updateToChecked(id)).build();
    }

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path("/{id:[0-9]*}/unchecked")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response updateToUnchecked(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        return createEntityResponse(
                bomDao.updateToUnchecked(id)).build();
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

        bomDao.remove(id);

        return createNoContentResponse().build();
    }

    @OPTIONS
    @Path("/{id:[0-9]*}/checked")
    public Response corsPreflightForCheckedPath(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }

    @OPTIONS
    @Path("/{id:[0-9]*}/unchecked")
    public Response corsPreflightForUncheckedPath(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }
}
