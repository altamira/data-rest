/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.bom;

import br.com.altamira.data.model.manufacture.bom.BOMItemPart;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacturing/bom/{bom:[0-9]*}/item/{parentId:[0-9]*}/part")
public class BOMItemPartEndpoint extends BaseEndpoint<BOMItemPart> {

}
