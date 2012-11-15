/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.dao;

import org.binframework.resource.bean.Resource;
import org.binframework.resource.exception.ResourceException;

/**
 * This interface is an abstract for dao implementation classes.
 * All the ResourceDAOImpl classes must implement this interface
 * and the methods in this class.
 * @author guru
 */
public interface ResourceDAO {
    public Integer save(Resource resource) throws ResourceException;
    public Integer delete(Integer resourceId) throws ResourceException;
}
