/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.order;

import br.com.altamira.data.model.manufacturing.bom.BOM;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.ws.rs.Path;

/**
 *
 * Bill of Material rest services
 */
@Path("/manufacturing/bom")
public class OrderEndpoint extends BaseEndpoint<BOM> /*implements Endpoint<Process> See https://issues.jboss.org/browse/WFLY-2724*/ {

}
