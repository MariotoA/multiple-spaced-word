/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mariotoa.multiplespacedstring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malex
 */
public class MultipleSpacedStringTest {
    
    public MultipleSpacedStringTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testInsert0Spaces(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello");
        str.insertSpaces(1);
        assertEquals("Falla la inserción de 0.",str.toString(),"hellohello");
    }
    
    @Test
    public void testInsert1Space(){
        
    }
    
    @Test
    public void testInsert6Spaces(){
        
    }
    
    @Test
    public void testInsertNegative2Spaces(){
    
    }
    
    @Test
    public void testInsertInOneWordString(){
    
    }
    
    @Test
    public void testInsertInTwoWordString(){
    
    }
    
    @Test
    public void testInsertInEmptyString(){
    
    }
}