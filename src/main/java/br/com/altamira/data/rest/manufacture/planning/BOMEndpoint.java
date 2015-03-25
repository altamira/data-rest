/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.planning;

import br.com.altamira.data.dao.manufacture.planning.BOMDao;
import br.com.altamira.data.model.manufacture.planning.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import com.fasterxml.jackson.core.JsonProcessingException;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * Bill of Material rest services
 */
@RequestScoped
@Path("/manufacture/planning/{id:[0-9]*}/bom")
public class BOMEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

    @OPTIONS
    public Response corsPreflightForListBOM(@HeaderParam("Origin") String origin, @PathParam("id") long id) {
        return getCORSHeaders(origin);
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
    @Consumes(value = MediaType.APPLICATION_JSON)
    public Response ListBOM(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws JsonProcessingException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());
        
        //((BOMDao) dao).replaceRemainingDeliveryDates(id, dates);
        return createListResponse(((BOMDao) dao).list(map, startPosition, maxResult)).build();
    }
}
