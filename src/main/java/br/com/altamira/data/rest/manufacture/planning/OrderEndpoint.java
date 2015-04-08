/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacture.planning;

import br.com.altamira.data.dao.manufacture.planning.OrderDao;
import br.com.altamira.data.model.manufacture.planning.Order;
import br.com.altamira.data.rest.BaseEndpoint;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("/manufacture/planning")
public class OrderEndpoint extends BaseEndpoint<Order> {
	
	//ALTAMIRA-175 : Manufacture Planning - create list order's operations API
	/**
	 *
	 * @param startPosition
	 * @param maxResult
	 * @return
	 * @throws JsonProcessingException
	 */
	@GET
	@Path("/{id:[0-9]*}/operation")
	@Produces(value = MediaType.APPLICATION_JSON)
	public Response ListOperation(
			@DefaultValue("0") @QueryParam("start") Integer startPosition,
			@DefaultValue("10") @QueryParam("max") Integer maxResult)
					throws JsonProcessingException {

		MultivaluedMap<String, String> map = info.getPathParameters();

		map.putAll(info.getQueryParameters());

		return createEntityResponse(((OrderDao) dao).listOperation(map, startPosition, maxResult)).build();
	}

}
