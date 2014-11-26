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

}
