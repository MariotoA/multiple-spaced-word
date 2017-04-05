/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mariotoa.multiplespacedstring;

/**
 *
 * @author MariotoA
 */
public class MultipleSpacedString {
    private String str;
    private char space;
    public MultipleSpacedString(String str) {
        this(str,' ');
    }
    
    public MultipleSpacedString(String str,char space) {
        this.space = space;
        this.str=MultipleSpacedStringValidator.validateString(str,space);

    }
    
    /**
     * This method modifies to numSpace
     * the number of spaces between words in string.
     * @param numSpace 
     */
    public String insertSpaces(int numSpace) {
        return null;
    }
}
