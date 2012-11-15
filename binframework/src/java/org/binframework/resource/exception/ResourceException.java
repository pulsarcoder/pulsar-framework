/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.exception;

/**
 * This is a common exception class for Resource module.
 * @author guru
 */
public class ResourceException extends Exception {    
    
    public ResourceException(String arg0) {
        super(arg0);
    }
    
    public ResourceException(Throwable arg0) {
        super(arg0);
    }
    
    public ResourceException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
}
