package br.com.altamira.data.rest.sales;

import javax.ws.rs.Path;
import br.com.altamira.data.model.sales.Order;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;

/**
 *
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "SALES")
@Path("/sales/order")
public class OrderEndpoint extends BaseEndpoint<Order> {

}
