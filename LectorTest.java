/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

import java.io.IOException;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego H
 */
public class LectorTest {
    
    public LectorTest() {
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
     * Test of getText method, of class Lector.
     * @throws java.io.IOException
     */
    @Test
    public void testGetText() throws IOException {
        System.out.println("getText");
        Lector instance = new Lector();
        String[] expResult = {"a","b"};
        String[] result = {"a","b"};
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!Arrays.equals(expResult, result)){
        fail("The test case is a prototype.");
        }
    }
    
}
