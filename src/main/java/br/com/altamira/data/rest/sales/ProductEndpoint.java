package br.com.altamira.data.rest.sales;

import javax.ws.rs.Path;
import br.com.altamira.data.model.sales.Product;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;

/**
 *
 * 
 */
@RequestScoped
@Path("sales/product")
public class ProductEndpoint extends BaseEndpoint<Product> {

//    @EJB
//    private ProductDao productDao;
//    
//    public ProductEndpoint() {
//        this.type = ProductEndpoint.class;
//    }
    
}
