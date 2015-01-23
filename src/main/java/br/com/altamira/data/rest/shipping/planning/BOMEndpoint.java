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
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * Bill of Material rest services
 */
@RequestScoped
@Path("/shipping/planning")
public class BOMEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

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

        ((BOMDao) dao).replaceDeliveryDates(id, dates);

        return createNoContentResponse().build();
    }

}
