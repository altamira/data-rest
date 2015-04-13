package br.com.altamira.data.rest.sales;

import javax.ws.rs.Path;
import br.com.altamira.data.model.sales.OrderItem;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Resource(name = "SALES")
@Path("sales/orderitem/{number:[0-9]*}")
public class OrderItemEndpoint extends BaseEndpoint<OrderItem> {

}
