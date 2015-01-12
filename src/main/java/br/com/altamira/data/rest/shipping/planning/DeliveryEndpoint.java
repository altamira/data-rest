/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.planning;

import br.com.altamira.data.dao.shipping.planning.DeliveryDao;
import br.com.altamira.data.model.shipping.planning.Delivery;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ID_VALIDATION;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/shipping/planning/{bom:[0-9]*}/item/{item:[0-9]*}/component/{parentId:[0-9]*}/delivery")
public class DeliveryEndpoint extends BaseEndpoint<Delivery> {

    /**
     *
     * @param entities
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path("/join")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response join(
            @NotNull List<Delivery> entities)
            throws JsonProcessingException {

        return createEntityResponse(
                ((DeliveryDao) dao).join(entities)).build();

    }

    /**
     *
     * @param id
     * @param entities
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path("/{id:[0-9]*}/split")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response split(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull List<Delivery> entities)
            throws JsonProcessingException {

        Delivery entity = ((DeliveryDao) dao).find(id);

        return createEntityResponse(
                ((DeliveryDao) dao).split(entity, entities)).build();

    }

    @OPTIONS
    @Path("/join")
    public Response corsPreflightForJoinPath(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }

    @OPTIONS
    @Path("/{id:[0-9]*}/split")
    public Response corsPreflightForSplitPath(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }
}
