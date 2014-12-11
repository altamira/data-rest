/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture;

import br.com.altamira.data.model.manufacture.Tooling;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacture/tooling")
public class ToolingEndpoint extends MaterialBaseEndpoint<Tooling> {
    
}
