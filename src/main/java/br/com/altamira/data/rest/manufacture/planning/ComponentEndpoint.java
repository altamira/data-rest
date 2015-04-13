/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.planning;

import br.com.altamira.data.model.manufacture.planning.Component;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "MANUFACTURE_PLANNING")
@Path("/manufacture/planning/{id:[0-9]*}/bom/{id:[0-9]*}/item/{id:[0-9]*}/component")
public class ComponentEndpoint extends BaseEndpoint<Component> {

}
