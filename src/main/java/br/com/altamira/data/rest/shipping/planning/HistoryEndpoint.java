/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.shipping.planning;

import br.com.altamira.data.dao.shipping.planning.HistoryDao;
import br.com.altamira.data.model.security.User;
import br.com.altamira.data.model.shipping.planning.History;
import br.com.altamira.data.rest.AuthTokenChkRespDataBean;
import br.com.altamira.data.rest.BaseEndpoint;
import br.com.altamira.data.rest.Resource;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilderException;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Resource(name = "SHIPPING_PLANNING")
@Path("/shipping/planning/{parentId:[0-9]*}/history")
public class HistoryEndpoint extends BaseEndpoint<History> {
	
    /**
     * 
     */
    private static final String TOKEN_URL = "http://localhost:8080/security-oauth2-0.2.0-SNAPSHOT/authz/token";
	
	@Override
	@POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
	public Response create(
			@NotNull(message = ENTITY_VALIDATION) History entity) 
			throws IllegalArgumentException, UriBuilderException, 
			JsonProcessingException {
		
		String token = info.getQueryParameters().get("token").get(0);
		User user = getUserDetailsByToken(token);
		entity.setCreatedby(user);
		
		return super.create(entity);
	}
	
	/**
	 * Check the Auth Token
	 * @param Token String
	 * @return Response
	 */
	private User getUserDetailsByToken(String token) {
		
		User user = null;
		Response response = null;
		try {
			String url = TOKEN_URL + "?token=" + token;
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(url);
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
			response = invocationBuilder.get();
			
			if(response.getStatus() == 200)
			{
				 Long userId = Long.parseLong(response.readEntity(AuthTokenChkRespDataBean.class).getUserId());
				 user = ((HistoryDao)dao).getUserById(userId);
			}
				
		} catch (Exception e) {            
			System.out.println(e.getMessage());
			
		}
		return user;
	}
    
}
