package br.com.altamira.data.rest.sales;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.validation.Validator;
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
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriBuilderException;

import br.com.altamira.data.dao.sales.OrderDao;
import br.com.altamira.data.dao.sales.OrderItemDao;
import br.com.altamira.data.model.sales.Order;
import br.com.altamira.data.model.sales.OrderItem;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.serialize.JSonViews;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("sales/orderitem/{number:[0-9]*}")
public class OrderItemEndpoint extends BaseEndpoint<OrderItem> {


    @EJB
    private OrderItemDao orderItemDao;
    
        
    /**
     *
     */
    public OrderItemEndpoint() {
        this.type = OrderItemEndpoint.class;
    }
}
