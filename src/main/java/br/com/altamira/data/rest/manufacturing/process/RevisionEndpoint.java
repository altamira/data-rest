/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.process;

import br.com.altamira.data.model.manufacturing.process.Revision;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("manufacturing/process/{parentId:[0-9]*}/revision")
public class RevisionEndpoint  extends BaseEndpoint<Revision> {
    
}
