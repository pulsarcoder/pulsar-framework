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
    private Integer metaId;
    
    /**
     * This is the foreign key of Resource bean
     */
    private Integer resourceId;

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
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

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }
}
