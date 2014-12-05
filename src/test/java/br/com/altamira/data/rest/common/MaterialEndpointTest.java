/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest.common;

import br.com.altamira.data.dao.common.MaterialDao;
import br.com.altamira.data.model.common.Material;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Alessandro
 */
@RunWith(Arquillian.class)
public class MaterialEndpointTest {

    @Deployment
    public static Archive<?> createTestArchive() {
        return ShrinkWrap.create(WebArchive.class, "MaterialTest.war")
                .addClasses(Material.class, MaterialDao.class, MaterialEndpoint.class)
                .addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
                // Deploy our test datasource
                .addAsWebInfResource("test-ds.xml");
    }

    @Inject
    Logger log;

    @Test
    public void MaterialTest() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(UriBuilder.fromMethod(MaterialEndpoint.class, "list").build().normalize());
        Builder request = webTarget.request(MediaType.APPLICATION_JSON);
        
        Response response = request.get();
        
        assertEquals(200, response.getStatus());
        
        List<Material> list = response.readEntity(new GenericType<List<Material>>() {});
        
        assertNotNull(list);
        assertFalse(list.isEmpty());
        
        Material entity = webTarget.path(list.get(0).getId().toString()).request(MediaType.APPLICATION_JSON).get(Material.class);
        
        assertNotNull(entity.getId());
        log.info("Material load sucessfull");
    }

}
