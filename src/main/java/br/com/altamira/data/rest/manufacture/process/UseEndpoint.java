/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.process;

import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "MANUFACTURE_PROCESS")
@Path("manufacture/process/{process:[0-9]*}/operation/{parentId:[0-9]*}/use")
public class UseEndpoint extends BaseEndpoint<br.com.altamira.data.model.manufacture.process.Use> {

}
