/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import javax.validation.ValidationException;
import javax.ws.rs.core.Response;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.resteasy.api.validation.ResteasyViolationException;
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
public class ValidationExceptionMapperTest {
    
    public ValidationExceptionMapperTest() {
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
     * Test of toResponse method, of class ValidationExceptionMapper.
     */
    @Test
    public void testToResponse() {
        System.out.println("toResponse");
        ValidationException exception = null;
        ValidationExceptionMapper instance = new ValidationExceptionMapper();
        Response expResult = null;
        Response result = instance.toResponse(exception);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildResponse method, of class ValidationExceptionMapper.
     */
    @Test
    public void testBuildResponse() {
        System.out.println("buildResponse");
        Object entity = null;
        String mediaType = "";
        Response.Status status = null;
        ValidationExceptionMapper instance = new ValidationExceptionMapper();
        Response expResult = null;
        Response result = instance.buildResponse(entity, mediaType, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildViolationReportResponse method, of class ValidationExceptionMapper.
     */
    @Test
    public void testBuildViolationReportResponse() {
        System.out.println("buildViolationReportResponse");
        ResteasyViolationException exception = null;
        Response.Status status = null;
        ValidationExceptionMapper instance = new ValidationExceptionMapper();
        Response expResult = null;
        Response result = instance.buildViolationReportResponse(exception, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unwrapException method, of class ValidationExceptionMapper.
     */
    @Test
    public void testUnwrapException() {
        System.out.println("unwrapException");
        Throwable t = null;
        ValidationExceptionMapper instance = new ValidationExceptionMapper();
        String expResult = "";
        String result = instance.unwrapException(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
