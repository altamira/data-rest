package br.com.altamira.data.rest.purchasing;


import javax.ejb.Stateless;
import javax.ws.rs.Path;
import br.com.altamira.data.model.purchasing.Material;
import br.com.altamira.data.rest.BaseEndpoint;

/**
 *
 * @author alessandro.holanda
 */
@Stateless
@Path("purchasing/material")
public class MaterialEndpoint  extends BaseEndpoint<Material> {

    /**
     *
     */
//    public MaterialEndpoint() {
//        this.type = MaterialEndpoint.class;
//    }
	
//    @Inject
//    private Logger log;
//
//    @Inject
//    private Validator validator;
//    
//    @Inject 
//    private MaterialDao materialDao;
//
//    /**
//     *
//     * @param startPosition
//     * @param maxResult
//     * @return
//     * @throws IOException
//     */
//    @GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response list(
//			@DefaultValue("0") @QueryParam("start") Integer startPosition,
//			@DefaultValue("10") @QueryParam("max") Integer maxResult)
//			throws IOException {
//
//		List<Material> list;
//		
//		try {
//			list = materialDao.list(startPosition, maxResult);
//		} catch (Exception e) {
//    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//    	}
//		
//		return Response.ok(list).build();
//	}
//	
//    /**
//     *
//     * @param id
//     * @return
//     */
//    @GET
//    @Path("/{id:[1-9]*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response findById(@PathParam("id") long id) {
//    	Material entity = null;
//    	
//    	try {
//    		entity = materialDao.find(id);
//    	} catch (Exception e) {
//    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//    	}
//
//		if (entity == null) {
//			return Response.status(Status.NOT_FOUND).build();
//		}
//		
//        return Response.ok(entity).build();
//    }
//
//    /**
//     *
//     * @param entity
//     * @return
//     */
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response create(Material entity) {
//
//    	try {
//    		// Validates member using bean validation
//            validate(entity);
//            
//    		entity = materialDao.create(entity);
//    	} catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//        } catch (Exception e) {
//        	Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//    	}
//
//		return Response.created(
//		        UriBuilder.fromResource(MaterialEndpoint.class)
//		        .path(String.valueOf(entity.getId())).build())
//		        .entity(entity)
//		        .build();
//    }
//
//    /**
//     *
//     * @param id
//     * @param entity
//     * @return
//     */
//    @PUT
//    @Path("/{id:[0-9][0-9]*}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response update(@PathParam("id") long id, Material entity) {
//    	
//    	if (entity.getId() != id) {
//			return Response.status(Status.CONFLICT)
//					.entity("entity id doesn't match with resource path id")
//					.build();
//		}
//    	
//    	try {
//    		// Validates member using bean validation
//            validate(entity);
//            
//    		entity = materialDao.update(entity);
//    	} catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            return createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(entity).build();
//        } catch (Exception e) {
//        	Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//    	}
//
//		if (entity == null) {
//			return Response.status(Status.NOT_FOUND).build();
//		}
//
//		return Response
//				.ok(UriBuilder.fromResource(MaterialEndpoint.class)
//						.path(String.valueOf(entity.getId())).build())
//				.entity(entity).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     */
//    /*@DELETE
//    @Path("/{id:[0-9][0-9]*}")
//    public Response deleteById(@PathParam("id") long id) {
//    	Material entity = null;
//    	try {
//    		entity = materialDao.remove(id);
//    	} catch (ConstraintViolationException ce) {
//            // Handle bean validation issues
//            return createViolationResponse(ce.getConstraintViolations()).build();
//        } catch (ValidationException e) {
//            // Handle the unique constrain violation
//            Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//            return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//        } catch (Exception e) {
//        	Map<String, String> responseObj = new HashMap<String, String>();
//            responseObj.put("error", e.getMessage());
//    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//    	}
//    	
//		if (entity == null) {
//			return Response.noContent().status(Status.NOT_FOUND).build();
//		}
//		return Response.noContent().build();
//    }*/
//
//    /**
//     * <p>
//     * Validates the given Member variable and throws validation exceptions based on the type of error. If the error is standard
//     * bean validation errors then it will throw a ConstraintValidationException with the set of the constraints violated.
//     * </p>
//     * <p>
//     * If the error is caused because an existing member with the same email is registered it throws a regular validation
//     * exception so that it can be interpreted separately.
//     * </p>
//     * 
//     * @param member Member to be validated
//     * @throws ConstraintViolationException If Bean Validation errors exist
//     * @throws ValidationException If member with the same email already exists
//     */
//    private void validate(Material entity) throws ConstraintViolationException {
//        // Create a bean validator and check for issues.
//        Set<ConstraintViolation<Material>> violations = validator.validate(entity);
//
//        if (!violations.isEmpty()) {
//            throw new ConstraintViolationException(new HashSet<ConstraintViolation<?>>(violations));
//        }
//    }
//
//    /**
//     * Creates a JAX-RS "Bad Request" response including a map of all violation fields, and their message. This can then be used
//     * by clients to show violations.
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
}
