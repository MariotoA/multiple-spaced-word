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
public class MultipleSpacedStringException extends RuntimeException {
    public MultipleSpacedStringException() {
        super();
    }
    public MultipleSpacedStringException(String str) {
        super(str);
    }
}
