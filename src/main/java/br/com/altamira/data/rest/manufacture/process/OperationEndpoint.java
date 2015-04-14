package br.com.altamira.data.rest.manufacture.process;

import br.com.altamira.data.dao.manufacture.process.OperationDao;
import javax.ws.rs.Path;
import br.com.altamira.data.model.manufacture.process.Operation;
import br.com.altamira.data.model.measurement.Measure;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ID_VALIDATION;
import br.com.altamira.data.rest.Resource;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Resource(name = "MANUFACTURE_PROCESS")
@Path("manufacture/process/{parentId:[0-9]*}/operation")
public class OperationEndpoint extends BaseEndpoint<Operation> {

    /**
     *
     * @param id
     * @param variable
     * @return
     * @throws JsonProcessingException
     */
    @POST
    @Path(value = "/{id:[0-9]*}/calcule")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response calcule(
            @Min(value = 0, message = ID_VALIDATION) @PathParam(value = "id") long id,
            Map<String, Measure> variable)
            throws JsonProcessingException {

        return createEntityResponse(
                ((OperationDao) dao).calcule(
                        ((OperationDao) dao).find(id),
                        variable,
                        info.getPathParameters()
                )
        ).build();
    }

}
