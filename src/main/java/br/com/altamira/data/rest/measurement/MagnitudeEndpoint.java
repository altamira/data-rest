/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.measurement;

import br.com.altamira.data.model.measurement.Magnitude;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("measurement/magnitude")
public class MagnitudeEndpoint extends BaseEndpoint<Magnitude> {

    /**
     *
     */
//    public MagnitudeEndpoint() {
//        this.type = MagnitudeEndpoint.class;
//    }
}
