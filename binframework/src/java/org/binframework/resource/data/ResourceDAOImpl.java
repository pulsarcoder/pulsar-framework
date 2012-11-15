/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.binframework.resource.data;

import org.binframework.resource.bean.Resource;
import org.binframework.resource.dao.ResourceDAO;
import org.binframework.resource.exception.ResourceException;

/**
 * This is the resource data access implementation class
 * @author guru
 */
public class ResourceDAOImpl implements ResourceDAO {

    @Override
    public Integer save(Resource resource) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Integer delete(Integer resourceId) throws ResourceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
