/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mariotoa.multiplespacedstring;

/**
 *
 * @author malex
 */
public class MultipleSpacedStringValidator {
        public static String validateString(String str,char space) {
        boolean firstSpaceFound=false;
        int tamSpaces=0;
        int i=0,j;
        while(i<str.length()) {
            if (str.charAt(i)==space) {
                j=i;
                while (j<str.length()&&str.charAt(j)==space) {
                    j++;
                }
                checkTamSpacesIfThereAreSpaces(firstSpaceFound,tamSpaces,j-i+1);
                tamSpaces = j - i + 1;
                i=j;
                firstSpaceFound=true;
            } else {
                i++;
            }
        }
        return str;
    }

    private static void checkTamSpacesIfThereAreSpaces(boolean firstSpaceFound,
            int tamSpacesOld, int tamSpacesNew) {
       if (firstSpaceFound&& tamSpacesOld != tamSpacesNew) {
                    throw new 
                    MultipleSpacedStringException("Spaces size are not consistent");
       }
    }

}
