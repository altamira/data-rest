package br.com.altamira.data.rest.purchasing.request;


import javax.ws.rs.Path;
import br.com.altamira.data.model.purchasing.Request;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("purchasing/request")
public class RequestEndpoint extends BaseEndpoint<Request> {

}
