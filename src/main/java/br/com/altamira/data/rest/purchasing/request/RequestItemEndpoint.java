package br.com.altamira.data.rest.purchasing.request;


/**
 *
 * @author alessandro.holanda
 */
//@Stateless
//@Path("purchasing/request/{requestId:[0-9]*}")
//public class RequestItemEndpoint extends BaseEndpoint<RequestItem> {
//
//    /**
//     *
//     */
//    public RequestItemEndpoint() {
//        this.type =RequestItemEndpoint.class;
//    }
//
//    @Inject
//    private Logger log;
//
//    @Inject
//    private Validator validator;
//
//    @Inject
//    private RequestDao requestDao;
//
//    @Inject
//    private RequestItemDao requestItemDao;
//
//    /**
//     *
//     * @param requestId
//     * @param startPosition
//     * @param maxResult
//     * @return
//     * @throws IOException
//     */
//    /*@GET
//    @Path("item")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response list(@PathParam("requestId") long requestId,
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        List<RequestItem> list;
//
//        try {
//            list = requestItemDao.list(requestId, startPosition, maxResult);
//        } catch (Exception e) {
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.registerModule(new Hibernate4Module());
//
//        return Response.ok(mapper.writeValueAsString(list)).build();
//    }*/
//
//    /**
//     *
//     * @param requestId
//     * @param id
//     * @return
//     * @throws IOException
//     */
//    @GET
//    @Path("{id:[0-9]*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response findById(@PathParam("requestId") long requestId, @PathParam("id") long id) throws IOException {
//        RequestItem entity = null;
//
//        try {
//            entity = requestItemDao.find(id);
//        } catch (Exception e) {
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//
//        if (entity == null) {
//            return Response.status(Status.NOT_FOUND).build();
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.registerModule(new Hibernate4Module());
//
//        return Response.ok(mapper.writeValueAsString(entity)).build();
//    }
//
//    /**
//     *
//     * @param requestId
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws JsonProcessingException
//     */
//    @POST
//    @Path("item")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response create(@PathParam("requestId") long requestId, RequestItem entity) throws IllegalArgumentException, UriBuilderException, JsonProcessingException {
//        Request request = null;
//
//        if (entity == null) {
//            return Response.status(Status.BAD_REQUEST).build();
//        }
//
//        if (entity.getId() != null) {
//            return Response.status(Status.BAD_REQUEST)
//                    .entity("expecting empty id")
//                    .build();
//        }
//
//        try {
//            request = requestDao.current();
//        } catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            //return createViolationResponse(ce.getConstraintViolations()).build();
//            return Response.status(Response.Status.BAD_REQUEST).entity(ce.getMessage()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            //Map<String, String> responseObj = new HashMap<String, String>();
//            //responseObj.put("email", "Email taken");
//            return Response.status(Response.Status.CONFLICT).entity(entity).build();
//        } catch (Exception e) {
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//
//        if (request == null) {
//            return Response.status(Status.BAD_REQUEST).build();
//        }
//
//        if (request.getId() == null || request.getId().longValue() != requestId) {
//            return Response.status(Status.CONFLICT)
//                    .entity("entity id doesn't match with resource path id")
//                    .build();
//        }
//
//        try {
//            // Validates member using bean validation
//            validate(entity);
//
//            entity.setRequest(request);
//            requestItemDao.create(entity);
//        } catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//        } catch (Exception e) {
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.registerModule(new Hibernate4Module());
//
//        return Response
//                .created(UriBuilder.fromResource(RequestItemEndpoint.class)
//                        .path(String.valueOf(entity.getId())).build(requestId))
//                .entity(mapper.writeValueAsString(entity)).build();
//    }
//
//    /**
//     *
//     * @param requestId
//     * @param id
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws JsonProcessingException
//     */
//    @PUT
//    @Path("{id:[0-9]*}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response update(@PathParam("requestId") long requestId, @PathParam("id") long id, RequestItem entity) throws IllegalArgumentException, UriBuilderException, JsonProcessingException {
//        Request request = null;
//
//        if (entity == null) {
//            return Response.status(Status.BAD_REQUEST).build();
//        }
//
//        if (entity.getId() == null || entity.getId().longValue() != id) {
//            return Response.status(Status.CONFLICT)
//                    .entity("entity id doesn't match with resource path id")
//                    .build();
//        }
//
//        try {
//            // Validates member using bean validation
//            validate(entity);
//
//            request = requestDao.current();
//        } catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            //return createViolationResponse(ce.getConstraintViolations()).build();
//            return Response.status(Response.Status.BAD_REQUEST).entity(ce.getMessage()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            //Map<String, String> responseObj = new HashMap<String, String>();
//            //responseObj.put("email", "Email taken");
//            return Response.status(Response.Status.CONFLICT).entity(entity).build();
//        } catch (Exception e) {
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//
//        if (request == null) {
//            return Response.status(Status.BAD_REQUEST).build();
//        }
//
//        if (request.getId() == null || request.getId().longValue() != requestId) {
//            return Response.status(Status.CONFLICT)
//                    .entity("entity id doesn't match with resource path id")
//                    .build();
//        }
//
//        try {
//            entity.setRequest(request);
//            entity = requestItemDao.update(entity);
//        } catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//        } catch (Exception e) {
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//        }
//
//        if (entity == null) {
//            return Response.status(Status.NOT_FOUND).build();
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.registerModule(new Hibernate4Module());
//
//        return Response
//                .ok(UriBuilder.fromResource(RequestItemEndpoint.class)
//                        .path(String.valueOf(entity.getId())).build(requestId))
//                .entity(mapper.writeValueAsString(entity)).build();
//    }
//
//    /**
//     *
//     * @param requestId
//     * @param id
//     * @return
//     */
//    /*@DELETE
//    @Path("{id:[0-9]*}")
//    public Response removeById(@PathParam("requestId") long requestId, @PathParam("id") long id) {
//        RequestItem entity = null;
//
//        try {
//            entity = requestItemDao.remove(id);
//        } catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//        } catch (Exception e) {
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//        }
//
//        if (entity == null) {
//            return Response.noContent().status(Status.NOT_FOUND).build();
//        }
//        return Response.noContent().build();
//    }*/
//
//    /**
//     * <p>
//     * Validates the given Member variable and throws validation exceptions
//     * based on the type of error. If the error is standard bean validation
//     * errors then it will throw a ConstraintValidationException with the set of
//     * the constraints violated.
//     * </p>
//     * <p>
//     * If the error is caused because an existing member with the same email is
//     * registered it throws a regular validation exception so that it can be
//     * interpreted separately.
//     * </p>
//     *
//     * @param member Member to be validated
//     * @throws ConstraintViolationException If Bean Validation errors exist
//     * @throws ValidationException If member with the same email already exists
//     */
//    private void validate(RequestItem entity) throws ConstraintViolationException {
//        // Create a bean validator and check for issues.
//        Set<ConstraintViolation<RequestItem>> violations = validator.validate(entity);
//
//        if (!violations.isEmpty()) {
//            throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
//        }
//    }
//
//    /**
//     * Creates a JAX-RS "Bad Request" response including a map of all violation
//     * fields, and their message. This can then be used by clients to show
//     * violations.
//     *
//     * @param violations A set of violations that needs to be reported
//     * @return JAX-RS response containing all violations
//     */
//    private Response.ResponseBuilder createViolationResponse(Set<ConstraintViolation<?>> violations) {
//        log.fine("Validation completed. violations found: " + violations.size());
//
//        Map<String, String> responseObj = new HashMap<String, String>();
//
//        for (ConstraintViolation<?> violation : violations) {
//            responseObj.put(violation.getPropertyPath().toString(), violation.getMessage());
//        }
//
//        return Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
//    }
//
//}
