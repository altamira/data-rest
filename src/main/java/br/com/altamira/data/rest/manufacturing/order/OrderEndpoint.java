/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.order;

import br.com.altamira.data.model.manufacturing.bom.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.ws.rs.Path;

/**
 *
 * Bill of Material rest services
 */
@Path("/manufacturing/bom")
public class OrderEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

//    @EJB
//    private BOMDao bomDao;
//
//    /**
//     *
//     */
//    public OrderEndpoint() {
//    	this.type = OrderEndpoint.class;
//    }
//    
//    /**
//     *
//     * @param startPosition
//     * @param maxResult
//     * @return
//     * @throws IOException
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Override
//    public Response list(
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        return createListResponse(
//                bomDao.listUnchecked(startPosition, maxResult)).build();
//    }
//
//    /**
//     *
//     * @param startPosition
//     * @param maxResult
//     * @param search
//     * @return
//     * @throws IOException
//     */
//    @GET
//    @Path("/search")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response search(
//            @Size(min = 2) @QueryParam("search") String search,
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        return createListResponse(
//                bomDao.search(search, startPosition, maxResult)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    /*@GET
//    @Path("/{id:[0-9]*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Override
//    public Response find(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
//            throws JsonProcessingException {
//
//        return createEntityResponse(bomDao.find(id)).build();
//    }*/
//
//    /**
//     *
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws JsonProcessingException
//     */
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    @Override
//    public Response create(
//            @NotNull(message = ENTITY_VALIDATION) BOM entity)
//            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {
//
//        return createCreatedResponse(bomDao.create(entity)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @param entity
//     * @return
//     * @throws JsonProcessingException
//     */
//    @PUT
//    @Path(value = "{id:[0-9]*}")
//    @Consumes(value = MediaType.APPLICATION_JSON)
//    @Produces(value = MediaType.APPLICATION_JSON)
//    @Override
//    public Response update(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
//            @NotNull(message = ENTITY_VALIDATION) BOM entity)
//            throws JsonProcessingException {
//
//        bomDao.update(entity);
//        
//        return createNoContentResponse().build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    @PUT
//    @Path(value = "{id:[0-9]*}/checked")
//    @Consumes(value = MediaType.APPLICATION_JSON)
//    @Produces(value = MediaType.APPLICATION_JSON)
//    public Response update(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
//            throws JsonProcessingException {
//        
//        BOM entity = bomDao.find(id);
//
//        // Add the current date to checked field
//        Date date = new Date();
//        entity.setChecked(date);
//
//        bomDao.update(entity);
//                
//        return createNoContentResponse().build();
//    }
//    
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    @DELETE
//    @Path("/{id:[0-9]*}")
//    @Override
//    public Response delete(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
//            throws JsonProcessingException {
//
//        bomDao.remove(id);
//
//        return createNoContentResponse().build();
//    }

}
