/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mariotoa.multiplespacedstring;

import java.util.Scanner;

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
        //this.str=MultipleSpacedStringValidator.validateString(str,space);
        this.str=str;

    }
    
    /**
     * This method modifies to numSpace
     * the number of spaces between words in string.
     * @param numSpace 
     * @return  
     */
    public String insertSpaces(int numSpace) {
        if (numSpace<0) {
            throw new MultipleSpacedStringException("Tamaño de espacio negativo.");
        }
        /**
         * from 
         * http://stackoverflow.com/questions/1235179/simple-way-to-repeat-a-string-in-java
         * It creates an empty char array of numSpace tam and replaces end colon
         * with space.
        **/
        String spaces = new String(new char[numSpace]).replace("\0", ""+space);
        Scanner sc = (new Scanner(str))
                .useDelimiter(String.format("%c+", space));
        StringBuilder sb= new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.next());
            if(sc.hasNext()) {
                sb.append(spaces);
            }
        }
        sc.close();
        return sb.toString();
    }
}
