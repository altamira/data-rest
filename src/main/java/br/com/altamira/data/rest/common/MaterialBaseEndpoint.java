/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.common;

import br.com.altamira.data.dao.common.MaterialBaseDao;
import br.com.altamira.data.rest.BaseEndpoint;
import java.io.IOException;
import javax.inject.Inject;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * @author Alessandro
 * @param <T>
 */
public abstract class MaterialBaseEndpoint<T extends br.com.altamira.data.model.common.Material> extends BaseEndpoint<T> {

    /**
     *
     */
    @Inject
    protected MaterialBaseDao<T> dao;

    /**
     *
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        MultivaluedMap<String, String> map = info.getPathParameters();

        map.putAll(info.getQueryParameters());

        if (map.get("code") != null && !map.get("code").isEmpty()) {
            String code = map.get("code").get(0);
            
            return createEntityResponse(dao.find(code)).build();
        }
        
        return createListResponse(
                dao.list(map, startPosition, maxResult)).build();
    }

}
