/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.process;

import br.com.altamira.data.model.manufacture.process.Produce;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author alessandro.holanda
 */
@RequestScoped
@Path("manufacturing/process/{process:[0-9]*}/operation/{parentId:[0-9]*}/produce")
public class ProduceEndpoint extends BaseEndpoint<Produce> {

}
