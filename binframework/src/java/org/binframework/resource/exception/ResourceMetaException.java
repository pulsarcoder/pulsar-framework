/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.exception;

/**
 * This class is used for handling the exceptions thrown for ResourceMeta
 * @author guru
 */
public class ResourceMetaException extends Exception {

    public ResourceMetaException(String arg0) {
        super(arg0);
    }
    
    public ResourceMetaException(Throwable arg0) {
        super(arg0);
    }
    
    public ResourceMetaException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
}
