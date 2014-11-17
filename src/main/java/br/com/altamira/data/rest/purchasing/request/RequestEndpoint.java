package br.com.altamira.data.rest.purchasing.request;


import javax.ejb.Stateless;
import javax.ws.rs.Path;
import br.com.altamira.data.model.purchasing.Request;
import br.com.altamira.data.rest.BaseEndpoint;

/**
 *
 * @author alessandro.holanda
 */
@Stateless
@Path("purchasing/request")
public class RequestEndpoint extends BaseEndpoint<Request> {

    /**
     *
     */
//    public RequestEndpoint() {
//        this.type =RequestEndpoint.class;
//    }

//    @Inject
//    private Logger log;
//
//    @Inject
//    private Validator validator;
//
//    @Inject
//    private RequestDao requestDao;
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
//    public Response list(
//            @DefaultValue("0") @QueryParam("start") Integer startPosition,
//            @DefaultValue("10") @QueryParam("max") Integer maxResult)
//            throws IOException {
//
//        List<Request> list;
//
//        try {
//            list = requestDao.list(startPosition, maxResult);
//        } catch (Exception e) {
//            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        mapper.registerModule(new Hibernate4Module());
//        mapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
//        ObjectWriter writer = mapper.writerWithView(JSonViews.ListView.class);
//
//        return Response.ok(writer.writeValueAsString(list)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     * @throws IOException
//     */
//    @GET
//    @Path("{id:[0-9]*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response findById(@PathParam("id") long id)
//            throws IOException {
//        Request entity = null;
//
//        try {
//            entity = requestDao.find(id);
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
//        mapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
//        ObjectWriter writer = mapper.writerWithView(JSonViews.EntityView.class);
//
//        return Response.ok(writer.writeValueAsString(entity)).build();
//    }
//
//    /*@POST
//     @Produces(MediaType.APPLICATION_JSON)
//     @Consumes(MediaType.APPLICATION_JSON)
//     public Response create(Request entity) throws IllegalArgumentException,
//     UriBuilderException, IOException {
//		
//     try {
//     // Validates member using bean validation
//     validate(entity);
//            
//     requestDao.create(entity);
//     } catch (ConstraintViolationException ce) {
//     // Handle bean validation issues
//     createViolationResponse(ce.getConstraintViolations()).build();
//     } catch (ValidationException e) {
//     // Handle the unique constrain violation
//     Map<String, String> responseObj = new HashMap<String, String>();
//     responseObj.put("error", e.getMessage());
//     return Response.status(Response.Status.CONFLICT).entity(responseObj).build();
//     } catch (Exception e) {
//     Map<String, String> responseObj = new HashMap<String, String>();
//     responseObj.put("error", e.getMessage());
//     return Response.status(Status.INTERNAL_SERVER_ERROR).entity(responseObj).build();
//     }
//
//     return Response
//     .created(
//     UriBuilder.fromResource(RequestEndpoint.class)
//     .path(String.valueOf(entity.getId())).build())
//     .entity(serialize(entity)).build();
//     }*/
//    /**
//     *
//     * @param id
//     * @param entity
//     * @return
//     * @throws IllegalArgumentException
//     * @throws UriBuilderException
//     * @throws IOException
//     */
//    @PUT
//    @Path("{id:[0-9][0-9]*}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response update(@PathParam("id") long id, Request entity)
//            throws IllegalArgumentException, UriBuilderException,
//            IOException {
//
//        if (entity == null) {
//            return Response.status(Status.BAD_REQUEST).build();
//        }
//
//        if (entity.getId() == null) {
//            return Response.status(Status.CONFLICT)
//                    .entity("Entity id can't be null")
//                    .build();
//        }
//
//        if (entity.getId().longValue() != id) {
//            return Response.status(Status.CONFLICT)
//                    .entity("Entity id doesn't match with resource path id. The result of compare is " + entity.getId().compareTo(id))
//                    .build();
//        }
//
//        if (entity.getId().compareTo(requestDao.current().getId()) != 0) {
//            return Response.status(Status.CONFLICT)
//                    .entity("Entity id doesn't match with current Request")
//                    .build();
//        }
//
//        for (RequestItem item : entity.getItem()) {
//            item.setRequest(entity);
//        }
//
//        try {
//            // Validates member using bean validation
//            validate(entity);
//
//            entity = requestDao.update(entity);
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
//        mapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
//        ObjectWriter writer = mapper.writerWithView(JSonViews.EntityView.class);
//
//        return Response
//                .ok(UriBuilder.fromResource(RequestEndpoint.class)
//                        .path(String.valueOf(entity.getId())).build())
//                .entity(writer.writeValueAsString(entity)).build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     */
//    /*@DELETE
//    @Path("{id:[0-9][0-9]*}")
//    public Response removeById(@PathParam("id") long id) {
//        Request entity = null;
//
//        try {
//            entity = requestDao.remove(id);
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
//
//        return Response.noContent().build();
//    }*/
//
//    /* 
//     * Custom methods 
//     */
//    /**
//     *
//     * @return @throws IOException
//     */
//    @GET
//    @Path("/current")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response current()
//            throws IOException {
//
//        Request entity = null;
//
//        try {
//            entity = requestDao.current();
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
//        mapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
//        ObjectWriter writer = mapper.writerWithView(JSonViews.EntityView.class);
//
//        //return Response.ok(serialize(entity)).build();
//        return Response.ok(UriBuilder.fromResource(RequestEndpoint.class)
//                .path(String.valueOf(entity.getId())).build())
//                .entity(writer.writeValueAsString(entity))
//                .build();
//    }
//
//    /**
//     *
//     * @param id
//     * @return
//     */
////    @GET
////    @Path("{id:[0-9][0-9]*}/report")
////    @Produces("application/pdf")
////    public Response reportInPdf(@PathParam("id") long id) {
////    	Request entity = null;
////    	
////        // generate report
////        JasperPrint jasperPrint = null;
////
////        try {
////        	entity = requestDao.find(id);
////        } catch (Exception e) {
////    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
////    	}
////        
////        if (entity == null) {
////			return Response.status(Status.NOT_FOUND).entity("A Requisição não foi encontrada.").build();
////		}
////        
////        if (entity.getItem().size() == 0) {
////        	return Response.status(Status.BAD_REQUEST).entity("A Requisição não tem itens.").build();
////        }
////        
////        try {
////            //byte[] requestReportJasper = requestDao.getRequestReportJasperFile();
////            //byte[] requestReportAltamiraimage = requestDao.getRequestReportAltamiraImage();
////            byte[] pdf = null;
////
////            //ByteArrayInputStream reportStream = new ByteArrayInputStream(requestReportJasper);
////            InputStream reportStream = Request.class.getResourceAsStream("/request.jasper");
////            
////            if (reportStream == null) {
////            	reportStream = Request.class.getResourceAsStream("request.jasper");
////            }
////            
////            if (reportStream == null) {
////            	reportStream = this.getClass().getResourceAsStream("/request.jasper");
////            }
////            
////            if (reportStream == null) {
////            	reportStream = this.getClass().getResourceAsStream("request.jasper");
////            }
////            
////            if (reportStream == null) {
////            	reportStream = Thread.currentThread().getClass().getResourceAsStream("/request.jasper");
////            }
////            
////            if (reportStream == null) {
////            	reportStream = Thread.currentThread().getClass().getResourceAsStream("request.jasper");
////            }
////           
////            if (reportStream == null) {
////            	return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Não foi possivel carregar o relatorio !").build();
////            }
////            
////            Map<String, Object> parameters = new HashMap<String, Object>();
////
////            //List<Object[]> list = requestDao.selectRequestReportDataById(id);
////
////            //Vector requestReportList = new Vector();
////            ArrayList<RequestReportData> requestReportList = new ArrayList<RequestReportData>();
////            List<Date> dateList = new ArrayList<Date>();
////
////            Long lastMaterialId = new Long(0);
////            int count = 0;
////            BigDecimal sumRequestWeight = new BigDecimal(0);
////            BigDecimal totalWeight = new BigDecimal(0);
////
////            RequestReportData r = new RequestReportData();
////            r.setId(null);
////            r.setLamination(null);
////            r.setLength(null);
////            r.setThickness(null);
////            r.setTreatment(null);
////            r.setWidth(null);
////            r.setArrivalDate(null);
////            r.setWeight(null);
////
////            requestReportList.add(r);
////
////            /* 
////				0 = M.ID
////	            1 = M.LAMINATION
////	            2 = M.TREATMENT
////	            3 = M.THICKNESS
////	            4 = M.WIDTH
////	            5 = M.LENGTH
////	            6 = RT.WEIGHT
////	            7 = RT.ARRIVAL_DATE
////            */
////            for (RequestItem item : entity.getItem()) {
////                RequestReportData rr = new RequestReportData();
////
////                Long currentMaterialId = item.getMaterial().getId();
////
////                if (lastMaterialId.compareTo(currentMaterialId) == 0) {
////                    rr.setWeight(item.getWeight());
////                    rr.setArrivalDate(item.getArrival());
////
////                    // copy REQUEST_DATE into dateList
////                    dateList.add(item.getArrival());
////
////                    totalWeight = totalWeight.add(item.getWeight());
////                    sumRequestWeight = sumRequestWeight.add(item.getWeight());
////                    count++;
////                } else {
////                    rr.setId(entity.getId());
////                    rr.setLamination(item.getMaterial().getLamination());
////                    rr.setTreatment(item.getMaterial().getTreatment());
////                    rr.setThickness(item.getMaterial().getThickness());
////                    rr.setWidth(item.getMaterial().getWidth());
////
////                    if (item.getMaterial().getLength() != null) {
////                        rr.setLength(item.getMaterial().getLength());
////                    }
////
////                    rr.setWeight(item.getWeight());
////                    rr.setArrivalDate(item.getArrival());
////
////                    // copy ARRIVAL_DATE into dateList
////                    dateList.add(item.getArrival());
////
////                    totalWeight = totalWeight.add(item.getWeight());
////                    lastMaterialId = currentMaterialId;
////
////                    if (count != 0) {
////                        RequestReportData addition = new RequestReportData();
////                        addition.setWeight(sumRequestWeight);
////
////                        requestReportList.add(addition);
////                    }
////
////                    sumRequestWeight = item.getWeight();
////                    count = 0;
////                }
////
////                requestReportList.add(rr);
////            }
////
////            if (count > 0) {
////                RequestReportData addition = new RequestReportData();
////                addition.setWeight(sumRequestWeight);
////
////                requestReportList.add(addition);
////            }
////
////            InputStream reportLogo = RequestEndpoint.class.getResourceAsStream("/report-logo.png");
////            
////            BufferedImage imfg = null;
////            try {
////                //InputStream in = new ByteArrayInputStream(requestReportAltamiraimage);
////                imfg = ImageIO.read(reportLogo);
////            } catch (Exception e1) {
////                e1.printStackTrace();
////            }
////
////            Collections.sort(dateList);
////
////            parameters.put("REQUEST_START_DATE", dateList.get(0));
////            parameters.put("REQUEST_END_DATE", dateList.get(dateList.size() - 1));
////            parameters.put("REQUEST_ID", id);
////            parameters.put("TOTAL_WEIGHT", totalWeight);
////            parameters.put("altamira_logo", imfg);
////            //parameters.put("USERNAME", httpRequest.getUserPrincipal() == null ? "" : httpRequest.getUserPrincipal().getName());
////
////            Locale locale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
////            parameters.put("REPORT_LOCALE", locale);
////
////            JRDataSource dataSource = new JRBeanCollectionDataSource(requestReportList, false);
////
////            jasperPrint = JasperFillManager.fillReport(reportStream, parameters, dataSource);
////
////            pdf = JasperExportManager.exportReportToPdf(jasperPrint);
////
////            ByteArrayInputStream pdfStream = new ByteArrayInputStream(pdf);
////
////            Response.ResponseBuilder response = Response.ok(pdfStream);
////            response.header("Content-Disposition", "inline; filename=Request Report.pdf");
////
////            return response.build();
////
////        } catch (Exception e) {
////    		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
////        } finally {
////            try {
////                /*if (jasperPrint != null) {
////                    // store generated report in database
////                    requestDao.insertGeneratedRequestReport(jasperPrint);
////                }*/
////            } catch (Exception e) {
////                e.printStackTrace();
////                System.out.println("Could not insert generated report in database.");
////            }
////        }
////    }
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
//    private void validate(Request entity) throws ConstraintViolationException {
//        // Create a bean validator and check for issues.
//        Set<ConstraintViolation<Request>> violations = validator.validate(entity);
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
}
