package br.com.altamira.data.rest.manufacturing.process;

import javax.ws.rs.Path;
import br.com.altamira.data.model.manufacturing.process.Operation;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("manufacturing/process/{parentId:[0-9]*}/operation")
public class OperationEndpoint extends BaseEndpoint<Operation> {

//    @EJB
//    private OperationDao operationDao;
//    
//    public OperationEndpoint() {
//        this.type = OperationEndpoint.class;
//    }
//
//    /**
//     *
//     * @param processId
//     * @param startPosition
//     * @param maxResult
//     * @return
//     * @throws IOException
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("process") long processId,
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        return createListResponse(
//                operationDao.list(processId, startPosition, maxResult)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws JsonProcessingException
//     */
//    /*@GET
//    @Path("{id:[0-9]*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    @Override
//    public Response find(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("id") long id)
//            throws JsonProcessingException {
//
//        return createEntityResponse(
//                operationDao.find(id)).build();
//    }*/
//
//    /**
//     *
//     * @param processId
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws JsonProcessingException
//     */
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response create(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("process") long processId,
//            @NotNull(message = ENTITY_VALIDATION) Operation entity)
//            throws IllegalArgumentException, UriBuilderException, JsonProcessingException {
//
//        return createCreatedResponse(
//                operationDao.create(processId, entity)).build();
//    }
//
//    /**
//     *
//     * @param processId
//     * @param id
//     * @param entity
//     * @return
//     * @throws JsonProcessingException
//     */
//    @PUT
//    @Path("{id:[0-9]*}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response update(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("process") long processId,
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("id") long id,
//            @NotNull(message = ENTITY_VALIDATION) Operation entity)
//            throws JsonProcessingException {
//
//        return createEntityResponse(
//                operationDao.update(processId, entity)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws com.fasterxml.jackson.core.JsonProcessingException
//     */
//    @DELETE
//    @Path("{id:[0-9]*}")
//    @Override
//    public Response delete(
//            @Min(value = 1, message = ID_VALIDATION) @PathParam("id") long id)
//            throws JsonProcessingException {
//
//        operationDao.remove(id);
//
//        return createNoContentResponse().build();
//    }

}
