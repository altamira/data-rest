package br.com.altamira.data.rest.sales;

import javax.ws.rs.Path;
import br.com.altamira.data.model.sales.Product;
import br.com.altamira.data.rest.Resource;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 *
 */
@RequestScoped
@Resource(name = "SALES")
@Path("sales/product")
public class ProductEndpoint extends MaterialBaseEndpoint<Product> {

}
