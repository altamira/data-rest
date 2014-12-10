/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author Alessandro
 */
@RunWith(Arquillian.class)
public class OptionsAcceptHeaderTest {
    
    public OptionsAcceptHeaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of filter method, of class OptionsAcceptHeader.
     */
    @Test
    public void testFilter() throws Exception {
        System.out.println("filter");
        ContainerRequestContext requestContext = null;
        ContainerResponseContext responseContext = null;
        OptionsAcceptHeader instance = new OptionsAcceptHeader();
        instance.filter(requestContext, responseContext);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
