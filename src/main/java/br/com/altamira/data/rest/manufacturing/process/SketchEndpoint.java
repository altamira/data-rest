/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.process;

import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("manufacturing/process/{process:[0-9]*}/operation/{parentId:[0-9]*}/sketch")
public class SketchEndpoint extends BaseEndpoint<br.com.altamira.data.model.manufacturing.process.Sketch> {

//    @EJB
//    private SketchDao sketchDao;
//    
//    /**
//     *
//     */
//    public SketchEndpoint() {
//        this.type = SketchEndpoint.class;
//    }
//
//    /**
//     *
//     * @param operationId
//     * @param startPosition
//     * @param maxResult
//     * @return
//     * @throws IOException
//     */
//    /*@GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("operation") long operationId,
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        return createListResponse(
//                sketchDao.list(operationId)).build();
//    }*/
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    /*@GET
//    @Path("{id:[0-9]*}")
//    @Produces(value = MediaType.APPLICATION_JSON)
//    @Override
//    public Response find(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
//            throws JsonProcessingException {
//
//        return createLobResponse(
//                sketchDao.find(id)).build();
//    }*/
//
//    /**
//     *
//     * @param processId
//     * @param operationId
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws JsonProcessingException
//     */
//    @POST
//    @Consumes(value = MediaType.APPLICATION_JSON)
//    @Produces(value = MediaType.APPLICATION_JSON)
//    public Response create(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("process") long processId,
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("operation") long operationId,
//            @NotNull(message = ENTITY_VALIDATION) Sketch entity)
//            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {
//
//        return createCreatedResponse(
//                sketchDao.create(operationId, entity)).build();
//    }
//
//    /**
//     *
//     * @param operationId
//     * @param id
//     * @param entity
//     * @return
//     * @throws JsonProcessingException
//     */
//    @PUT
//    @Path("{id:[0-9]*}")
//    @Consumes(value = MediaType.APPLICATION_JSON)
//    @Produces(value = MediaType.APPLICATION_JSON)
//    public Response update(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("operation") long operationId,
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id,
//            @NotNull(message = ENTITY_VALIDATION) Sketch entity)
//            throws JsonProcessingException {
//
//        return createEntityResponse(
//                sketchDao.update(operationId, entity)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    @DELETE
//    @Path("{id:[0-9]*}")
//    @Override
//    public Response delete(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam(value = "id") long id)
//            throws JsonProcessingException {
//
//        sketchDao.remove(id);
//
//        return createNoContentResponse().build();
//    }

}
