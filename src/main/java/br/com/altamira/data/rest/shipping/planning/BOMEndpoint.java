/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.planning;

import br.com.altamira.data.dao.shipping.planning.BOMDao;
import br.com.altamira.data.model.shipping.planning.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ID_VALIDATION;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * Bill of Material rest services
 */
@RequestScoped
@Path("/shipping/planning")
public class BOMEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

    @OPTIONS
    @Path("/{id:[0-9]*}/delivery")
    public Response corsPreflightForReplaceDeliveryDates(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }

    /**
     * Replace delivery dates in batch
     *
     * @param id BOM id
     * @param dates
     * @return
     * @throws JsonProcessingException
     */
    @PUT
    @Path("/{id:[0-9]*}/delivery")
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response replaceDeliveryDates(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull List<Date> dates)
            throws JsonProcessingException {

        //((BOMDao) dao).replaceRemainingDeliveryDates(id, dates);
        return createEntityResponse(((BOMDao) dao).replaceRemainingDeliveryDates(id, dates)).build();
    }

    @OPTIONS
    @Path("/remaining")
    public Response corsPreflightForlistRemaining(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
    }
    
    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    @GET
    @Path("/remaining")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listRemaining(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        return createListResponse(
                ((BOMDao) dao).listRemaining(map, startPosition, maxResult)).build();
    }
}
