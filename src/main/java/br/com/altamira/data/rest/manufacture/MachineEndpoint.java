/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture;

import br.com.altamira.data.model.manufacture.Machine;
import br.com.altamira.data.rest.Resource;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "MANUFACTURE")
@Path("/manufacture/machine")
public class MachineEndpoint extends MaterialBaseEndpoint<Machine> {

}
