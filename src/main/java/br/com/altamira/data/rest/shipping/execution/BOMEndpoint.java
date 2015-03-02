/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.execution;

import br.com.altamira.data.dao.shipping.execution.BOMDao;
import br.com.altamira.data.model.shipping.execution.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import java.io.IOException;
import javax.enterprise.context.RequestScoped;
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
 * Bill of Material rest services
 */
@RequestScoped
@Path("/shipping/execution")
public class BOMEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

    @OPTIONS
    @Path("/remaining")
    public Response corsPreflightForListRemaining(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
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
