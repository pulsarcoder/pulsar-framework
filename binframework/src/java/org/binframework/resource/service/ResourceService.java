/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.binframework.resource.service;

import org.binframework.resource.bean.Resource;
import org.binframework.resource.exception.ResourceException;

/**
 * This is the service interface for Resources
 * @author smart
 */
public interface ResourceService {
    public Integer save(Resource resource) throws ResourceException;
    public Integer delete(Integer resourceId) throws ResourceException;
}
