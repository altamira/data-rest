/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.manufacturing.process;

import br.com.altamira.data.dao.manufacturing.process.RevisionDao;
import br.com.altamira.data.model.manufacturing.process.Revision;
import br.com.altamira.data.rest.BaseEndpoint;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;

/**
 *
 * @author Alessandro
 */
@RequestScoped
@Path("manufacturing/process/{process:[0-9]*}/revision")
public class RevisionEndpoint  extends BaseEndpoint<Revision> {
    
    @EJB
    private RevisionDao revisionDao;
     
    public RevisionEndpoint() {
        this.type = RevisionEndpoint.class;
    }
    
    /**
     *
     * @param processId
     * @param startPosition
     * @param maxResult
     * @return
     * @throws IOException
     */
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(
            @Min(value = 1, message = ID_VALIDATION) @PathParam("process") long processId,
            @DefaultValue("0") @QueryParam("start") Integer startPosition,
            @DefaultValue("10") @QueryParam("max") Integer maxResult)
            throws IOException {

        return createListResponse(
                revisionDao.list(processId)).build();
    } */   
}
