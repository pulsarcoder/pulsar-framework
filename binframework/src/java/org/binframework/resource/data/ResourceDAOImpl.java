/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.data;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.binframework.resource.bean.Resource;
import org.binframework.resource.dao.ResourceDAO;
import org.binframework.resource.exception.ResourceException;
import org.binframework.resource.exception.ResourceMetaException;
import java.util.ArrayList;
import org.binframework.resource.bean.ResourceMeta;

/**
 * This is the resource data access implementation class
 * @author guru
 */
@Repository
public class ResourceDAOImpl implements ResourceDAO {
    @Override
    public Integer addResource(Resource resource) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer deleteResource(Integer resourceId) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer updateResource(Resource resource) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Resource> queryAll() throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> ArrayList<T> query(String sql, RowMapper<T> mapper) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer addResourceMeta(Integer resourceID, ResourceMeta resourceMeta) throws ResourceMetaException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer deleteResourceMeta(Integer resourceId) throws ResourceMetaException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
