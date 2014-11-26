package br.com.altamira.data.rest.purchasing.request;

import br.com.altamira.data.model.purchasing.RequestItem;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;


/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("purchasing/request/{parentId:[0-9]*}/item")
public class RequestItemEndpoint extends BaseEndpoint<RequestItem> {
    
}
