/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.altamira.data.rest;

import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ReaderInterceptorContext;
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
public class PatchReaderTest {
    
    public PatchReaderTest() {
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
     * Test of setInfo method, of class PatchReader.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        UriInfo info = null;
        PatchReader instance = new PatchReader();
        instance.setInfo(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aroundReadFrom method, of class PatchReader.
     */
    @Test
    public void testAroundReadFrom() throws Exception {
        System.out.println("aroundReadFrom");
        ReaderInterceptorContext readerInterceptorContext = null;
        PatchReader instance = new PatchReader();
        Object expResult = null;
        Object result = instance.aroundReadFrom(readerInterceptorContext);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
