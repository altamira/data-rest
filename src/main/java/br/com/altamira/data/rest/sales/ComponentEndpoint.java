/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.sales;

import br.com.altamira.data.model.sales.Component;
import br.com.altamira.data.rest.common.MaterialBaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("sales/component")
public class ComponentEndpoint extends MaterialBaseEndpoint<Component> {
    
}