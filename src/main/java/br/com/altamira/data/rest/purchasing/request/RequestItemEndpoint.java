package br.com.altamira.data.rest.purchasing.request;

import br.com.altamira.data.model.purchase.RequestItem;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Resource(name = "PURCHASE_REQUEST")
@Path("purchasing/request/{parentId:[0-9]*}/item")
public class RequestItemEndpoint extends BaseEndpoint<RequestItem> {

}
