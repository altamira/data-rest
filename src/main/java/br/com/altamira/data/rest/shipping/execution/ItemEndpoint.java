/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.execution;

import br.com.altamira.data.model.shipping.execution.Item;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/shipping/execution/{parentId:[0-9]*}/item")
public class ItemEndpoint extends BaseEndpoint<Item> {

}
