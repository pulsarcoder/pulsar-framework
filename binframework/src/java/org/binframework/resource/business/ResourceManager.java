/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.business;

import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.binframework.resource.exception.ResourceException;
import org.binframework.resource.bean.Resource;
import org.binframework.resource.bean.ResourceMeta;
import org.binframework.resource.dao.ResourceDAO;
import org.binframework.resource.exception.ResourceException;
import java.util.ArrayList;

/**
 * This class is used as business delegate for Resource Details.
 * @author guru
 * @since v1.0
 */
@Component
public class ResourceManager {
    
	@Autowired
	private ResourceDAO resourceDAO;

	public Integer addResource(Resource resource) throws ResourceException {
            return resourceDAO.addResource(resource);
	}

	public Integer updateResource(Resource resource) throws ResourceException {
            return resourceDAO.updateResource(resource);
	}

	public Integer deleteResource(Integer resourceId) throws ResourceException {
            return resourceDAO.deleteResource(resourceId);
	}

	public ArrayList<Resource> queryAll() throws ResourceException {
            return resourceDAO.queryAll();
	}

	public <T> ArrayList<T> query(String sql, RowMapper<T> mapper) throws ResourceException {
            return resourceDAO.query(sql, mapper);
	}
        
        public Integer addResourceMeta(Integer resourceId, ResourceMeta resourceMeta) throws ResourceException {
            return resourceDAO.addResourceMeta(resourceId, resourceMeta);
        }
}
