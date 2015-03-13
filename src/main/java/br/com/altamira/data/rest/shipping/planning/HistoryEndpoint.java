/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.planning;

import br.com.altamira.data.model.shipping.planning.History;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/shipping/planning/{parentId:[0-9]*}/history")
public class HistoryEndpoint extends BaseEndpoint<History> {
    
}
