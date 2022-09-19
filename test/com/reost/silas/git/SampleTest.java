/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.reost.silas.git;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Silas
 */
public class SampleTest {
    
    public SampleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sayHello method, of class Sample.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        Sample instance = new Sample();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Sample.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double[] ints = {1,2,3,4,5};
        Sample instance = new Sample();
        double expResult = 15.0;
        double result = instance.add(ints);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class Sample.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        double[] ints = {2,3,2};
        Sample instance = new Sample();
        double expResult = 12.0;
        double result = instance.mult(ints);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testName() {
        Sample s = new Sample();
        
        assertEquals("Jesus", s.getName());
        
    }
    
}
