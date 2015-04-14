/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.bom;

import br.com.altamira.data.model.manufacture.bom.Item;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "MANUFACTURE_BOM")
@Path("/manufacture/bom/{parentId:[0-9]*}/item")
public class ItemEndpoint extends BaseEndpoint<Item> {

}
