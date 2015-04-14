package br.com.altamira.data.rest.purchase;

import br.com.altamira.data.rest.Resource;
import javax.ws.rs.Path;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Resource(name = "PURCHASE")
@Path("purchase/steel")
public class SteelEndpoint extends MaterialBaseEndpoint<br.com.altamira.data.model.purchase.Steel> {

}
