/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import javax.persistence.NoResultException;
import javax.ws.rs.core.Response;
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
public class NoResultExceptionMapperTest {
    
    public NoResultExceptionMapperTest() {
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
     * Test of toResponse method, of class NoResultExceptionMapper.
     */
    @Test
    public void testToResponse() {
        System.out.println("toResponse");
        NoResultException exception = null;
        NoResultExceptionMapper instance = new NoResultExceptionMapper();
        Response expResult = null;
        Response result = instance.toResponse(exception);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
