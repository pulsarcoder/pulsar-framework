/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.bean;

/**
 * This class is a model class for storing and retrieving the custom fields
 * @author guru
 */
public class ResourceMeta {
    /**
     * metaKey for storing the key name
     */
    private String metaKey;
    
    /**
     * metaValue for storing the key value
     */
    private String metaValue;
    
    /**
     * This variable is auto-increment for meta table 
     */
    private int metaId;
    
    /**
     * This is the foreign key of Resource bean
     */
    private int resourceId;

    public int getMetaId() {
        return metaId;
    }

    public void setMetaId(int metaId) {
        this.metaId = metaId;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
