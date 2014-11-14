/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.measurement;

import br.com.altamira.data.model.measurement.Unit;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/measurement/unit")
public class UnitEndpoint extends BaseEndpoint<Unit> {

    /**
     *
     */
    public UnitEndpoint() {
        this.type = UnitEndpoint.class;
    }
}
