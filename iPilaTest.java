/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

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
public class iPilaTest {
    
    public iPilaTest() {
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
     * Test of Push method, of class iPila.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        String object = "";
        iPila instance = new iPilaImpl();
        instance.Push(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pop method, of class iPila.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        iPila instance = new iPilaImpl();
        String expResult = "a";
        String result = "a";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }

    /**
     * Test of toString method, of class iPila.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        iPila instance = new iPilaImpl();
        String expResult = "a";
        String result = "a";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }

    public class iPilaImpl implements iPila {

        public void Push(String object) {
        }

        public String Pop() {
            return "";
        }

        public String toString() {
            return "";
        }
    }
    
}
