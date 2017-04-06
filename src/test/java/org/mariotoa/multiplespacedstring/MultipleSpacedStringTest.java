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
    public void testInsert0Spaces(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello");
        
        assertEquals("Falla la inserción de 0.",str.insertSpaces(0),"hellohello");
    }
    
    @Test
    public void testInsert1Space(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello");
        assertEquals("Falla la inserción de 1.",str.insertSpaces(1),"hello hello");
    
    }
    
    @Test
    public void testInsert6Spaces(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello");
        String str2 = str.insertSpaces(6);
        assertEquals("Falla la inserción de 6.",str2,"hello      hello");
    
    }
    
    @Test(expected=MultipleSpacedStringException.class)
    public void testInsertNegative2Spaces(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello");
        str.insertSpaces(-2);
    }
    
    @Test
    public void testInsertInOneWordStringShouldDoNothing(){
        MultipleSpacedString str = new MultipleSpacedString("hello");
        assertEquals("Falla la inserción en string de una palabra.",str.insertSpaces(1),"hello");
    
    }
    
    @Test
    public void testInsertInThreeWordString(){
        MultipleSpacedString str = new MultipleSpacedString("hello hello hello");
        assertEquals("Falla la inserción en string de 3 palabras.",str.insertSpaces(2),"hello  hello  hello");
    }
    
    @Test
    public void testInsertInEmptyStringShouldDoNothing(){
        MultipleSpacedString str = new MultipleSpacedString("");
        assertEquals("Falla la inserción en string vacía.",str.insertSpaces(2),"");
    }
}
