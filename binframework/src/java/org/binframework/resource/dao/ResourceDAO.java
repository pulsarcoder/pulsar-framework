/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.dao;

import java.util.ArrayList;
import org.binframework.resource.bean.Resource;
import org.binframework.resource.bean.ResourceMeta;
import org.binframework.resource.exception.ResourceException;
import org.binframework.resource.exception.ResourceMetaException;
import org.springframework.jdbc.core.RowMapper;

/**
 * This interface is an abstract for dao implementation classes.
 * All the ResourceDAOImpl classes must implement this interface
 * and the methods in this class.
 * @author guru
 */
public interface ResourceDAO {
    public Integer addResource(Resource resource) throws ResourceException;
    public Integer deleteResource(Integer resourceId) throws ResourceException;
    public Integer updateResource(Resource resource) throws ResourceException;
    public ArrayList<Resource> queryAll() throws ResourceException;
    public <T> ArrayList<T> query(String sql, RowMapper<T> mapper)throws ResourceException;
    
    public Integer addResourceMeta(Integer resourceId, ResourceMeta resourceMeta) throws ResourceMetaException;
    public Integer deleteResourceMeta(Integer resourceId) throws ResourceMetaException;
}
