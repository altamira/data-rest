package br.com.altamira.data.rest.manufacture.process;

import javax.ws.rs.Path;
import br.com.altamira.data.model.manufacture.process.Process;

import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 *
 * @author Alessandro
 */
@Path("manufacturing/process")
@RequestScoped
public class ProcessEndpoint extends BaseEndpoint<Process> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

}
