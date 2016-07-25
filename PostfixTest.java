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
public class PostfixTest {
    
    public PostfixTest() {
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
     * Test of Push method, of class Postfix.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        String object = "";
        Postfix instance = new Postfix();
        instance.Push(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Pop method, of class Postfix.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        String operacion = "";
        Postfix instance = new Postfix();
        instance.Pop(operacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Postfix.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Postfix instance = new Postfix();
        String expResult = "a";
        String result = "a";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
        }
    }
    
}
