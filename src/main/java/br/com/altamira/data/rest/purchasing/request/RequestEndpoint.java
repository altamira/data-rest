package br.com.altamira.data.rest.purchasing.request;


import javax.ws.rs.Path;
import br.com.altamira.data.model.purchase.Request;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Resource(name = "PURCHASE_REQUEST")
@Path("purchasing/request")
public class RequestEndpoint extends BaseEndpoint<Request> {

}
