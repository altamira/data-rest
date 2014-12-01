package br.com.altamira.data.rest.purchase;


import javax.ws.rs.Path;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("purchase/material")
public class MaterialEndpoint extends BaseEndpoint<br.com.altamira.data.model.purchase.Material> {

}
