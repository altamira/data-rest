/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.bom;

import br.com.altamira.data.model.manufacturing.bom.BOMItem;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacturing/bom/{parentId:[0-9]*}/item")
public class BOMItemEndpoint extends BaseEndpoint<BOMItem> {

    /*@EJB
    private BOMItemDao bomItemDao;*/
    
    /**
     *
     */
    /*public BOMItemEndpoint() {
        this.type = BOMItemEndpoint.class;
    }*/

    /**
     *
     * @param bomId
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("bom") long bomId,
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        return createListResponse(
                bomItemDao.list(bomId, startPosition, maxResult)).build();
    }*/

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
                bomItemDao.find(id)).build();
    }*/

    /**
     *
     * @param bomId
     * @param entity
     * @return
     * @throws IllegalArgumentException
     * @throws UriBuilderException
     * @throws JsonProcessingException
     */
    /*@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("bom") long bomId,
            @NotNull(message = ENTITY_VALIDATION) BOMItem entity)
            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {

        return createCreatedResponse(
                bomItemDao.create(bomId, entity)).build();
    }*/

    /**
     *
     * @param bomId
     * @param id
     * @param entity
     * @return
     * @throws JsonProcessingException
     */
    /*@PUT
    @Path(value = "{id:[0-9]*}")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response update(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("bom") long bomId,
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
            @NotNull(message = ENTITY_VALIDATION) BOMItem entity)
            throws JsonProcessingException {

        return createEntityResponse(
                bomItemDao.update(bomId, entity)).build();
    }*/

    /**
     *
     * @param id
     * @return
     * @throws JsonProcessingException
     */
    /*@DELETE
    @Path("/{id:[0-9]*}")
    @Override
    public Response delete(
            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
            throws JsonProcessingException {

        bomItemDao.remove(id);

        return createNoContentResponse().build();
    }*/

}
