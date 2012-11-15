/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.binframework.resource.bean;

/**
 * This is a model class for getting the Resource details from the database.
 *
 * @author guru
 */
public class Resource {

    /**
     * this id will be the auto incremented one.
     */
    private int resourceId;
    /**
     * This variable holds the name of the resource.
     */
    private String resourceName;
    /**
     * This variable holds the description or the content for the resource.
     */
    private String resourceDesc;
    /**
     * This variable contains the resource type information.
     */
    private String resourceType;
    /**
     * This variable contains the resource created date.
     */
    private String resourceDate;
    /**
     * This variable contains the status of the resource.
     */
    private String resourceStatus;
    /**
     * This variable holds the created by information, linked with username
     * field of the user.
     */
    private String resourceAuthor;
    /**
     * This variable holds the value of the modified date for the resource.
     */
    private String resourceModifiedOn;
    /**
     * This variable contains the information of username, by whom the resource
     * is modified.
     */
    private String resourceModifiedBy;

    public String getResourceAuthor() {
        return resourceAuthor;
    }

    public void setResourceAuthor(String resourceAuthor) {
        this.resourceAuthor = resourceAuthor;
    }

    public String getResourceDate() {
        return resourceDate;
    }

    public void setResourceDate(String resourceDate) {
        this.resourceDate = resourceDate;
    }

    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceModifiedOn() {
        return resourceModifiedOn;
    }

    public void setResourceModifiedOn(String resourceModifiedOn) {
        this.resourceModifiedOn = resourceModifiedOn;
    }

    public String getResourceModifiedBy() {
        return resourceModifiedBy;
    }

    public void setResourceModifiedBy(String resourceModifiedBy) {
        this.resourceModifiedBy = resourceModifiedBy;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceStatus() {
        return resourceStatus;
    }

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}