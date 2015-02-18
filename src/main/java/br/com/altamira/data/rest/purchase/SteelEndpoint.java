package br.com.altamira.data.rest.purchase;


import javax.ws.rs.Path;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("purchase/steel")
public class SteelEndpoint extends MaterialBaseEndpoint<br.com.altamira.data.model.purchase.Steel> {

}
