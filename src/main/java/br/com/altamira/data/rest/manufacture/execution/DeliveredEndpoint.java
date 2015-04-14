/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.execution;

import br.com.altamira.data.model.manufacture.execution.Delivered;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "MANUFACTURE_EXECUTION")
@Path("/manufacture/execution/component/{parentId:[0-9]*}/delivered")
public class DeliveredEndpoint extends BaseEndpoint<Delivered> {

}
