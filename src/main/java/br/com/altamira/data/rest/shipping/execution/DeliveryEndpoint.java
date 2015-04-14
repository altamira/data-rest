/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.execution;

import br.com.altamira.data.model.shipping.execution.Delivery;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "SHIPPING_EXECUTION")
@Path("/shipping/execution/{bom:[0-9]*}/item/{item:[0-9]*}/component/{parentId:[0-9]*}/delivery")
public class DeliveryEndpoint extends BaseEndpoint<Delivery> {


}
