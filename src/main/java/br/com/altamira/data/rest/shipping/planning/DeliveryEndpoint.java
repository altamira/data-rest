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
import br.com.altamira.data.rest.Resource;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
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
@Resource(name = "SHIPPING_PLANNING")
@Path("/shipping/planning/{bom:[0-9]*}/item/{item:[0-9]*}/component/{parentId:[0-9]*}/delivery")
public class DeliveryEndpoint extends BaseEndpoint<Delivery> {

    /**
     *
     * @param delivery
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path("/join")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response join(
            @NotNull List<Delivery> delivery)
            throws JsonProcessingException {

        return createEntityResponse(
                ((DeliveryDao) dao).join(delivery)).build();

    }

    /**
     *
     * @param id
     * @param delivery
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path("/{id:[0-9]*}/divide")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response split(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull List<Delivery> delivery)
            throws JsonProcessingException {

        Delivery entity = ((DeliveryDao) dao).find(id);

        return createEntityResponse(
                ((DeliveryDao) dao).divide(entity, delivery)).build();

    }

}
