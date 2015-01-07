/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.process;

import br.com.altamira.data.dao.manufacture.process.OperationDao;
import br.com.altamira.data.dao.manufacture.process.ProduceDao;
import br.com.altamira.data.model.manufacture.process.Produce;
import br.com.altamira.data.model.measurement.Measure;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ID_VALIDATION;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("manufacturing/process/{process:[0-9]*}/operation/{parentId:[0-9]*}/produce")
public class ProduceEndpoint extends BaseEndpoint<Produce> {

    @EJB
    OperationDao operationDao;

    /**
     *
     * @param id
     * @param variables
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path(value = "/{id:[0-9]*}/simulate")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response simulate(
            @Min(value = 0, message = ID_VALIDATION) @PathParam(value = "id") long id,
            Map<String, Measure> variables)
            throws JsonProcessingException {

        Produce produce = dao.find(id);

        return createEntityResponse(
                ((ProduceDao) dao).calcule(operationDao.find(
                                Long.parseLong(info.getPathParameters().get("parentId").get(0))), variables, info.getPathParameters())).build();
    }
}
