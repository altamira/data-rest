package br.com.altamira.data.rest.sales;

import br.com.altamira.data.dao.Dao;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilderException;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.altamira.data.dao.sales.OrderDao;
import br.com.altamira.data.model.manufacturing.bom.BOM;
import br.com.altamira.data.model.sales.Order;
import br.com.altamira.data.rest.BaseEndpoint;
import static br.com.altamira.data.rest.BaseEndpoint.ENTITY_VALIDATION;
import br.com.altamira.data.rest.manufacturing.process.UseEndpoint;
import javax.ejb.EJB;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/sales/order")
public class OrderEndpoint extends BaseEndpoint<Order> {

    @EJB
    private OrderDao orderDao;
    
    /**
     *
     */
    public OrderEndpoint() {
        this.type = OrderEndpoint.class;
    }
}
