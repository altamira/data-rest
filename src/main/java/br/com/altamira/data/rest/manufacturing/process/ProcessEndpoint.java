package br.com.altamira.data.rest.manufacturing.process;

import java.io.IOException;
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

import br.com.altamira.data.model.manufacturing.process.Process;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.altamira.data.dao.manufacturing.process.ProcessDao;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.persistence.NoResultException;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author Alessandro
 */
@Path("manufacturing/process")
@RequestScoped
public class ProcessEndpoint extends BaseEndpoint<Process> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

    @EJB
    private ProcessDao processDao;
    
    public ProcessEndpoint() {
        this.type = ProcessEndpoint.class;
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
                processDao.list(startPosition, maxResult)).build();
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
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult,
            @Size(min = 2) @QueryParam("search") String search)
            throws IOException {

        return createListResponse(
                processDao.search(search, startPosition, maxResult)).build();
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
            throws JsonProcessingException, NoResultException {

        return createEntityResponse(
                processDao.find(id)).build();
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
            @NotNull(message = ENTITY_VALIDATION) Process entity)
            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {

        return createCreatedResponse(
                processDao.create(entity)).build();
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
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Response update(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("id") long id,
            @NotNull(message = ENTITY_VALIDATION) Process entity)
            throws JsonProcessingException {

        return createEntityResponse(
                processDao.update(entity)).build();
    }

    /**
     *
     * @param id
     * @return
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    @DELETE
    @Path("/{id:[0-9]*}")
    @Override
    public Response delete(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("id") long id)
            throws JsonProcessingException {

        processDao.remove(id);

        return createNoContentResponse().build();
    }

}
