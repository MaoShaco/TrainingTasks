package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import com.epam.training.services.GenericInsertOrUpdateService;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public abstract class GenericInsertOrUpdateServiceImpl<T extends AbstractDataObject> implements GenericInsertOrUpdateService<T> {

    protected abstract GenericDao<T> getBeanDao();

    @Override
    public void insertOrUpdate(T obj) {
        if (obj.getId() == null) {
            getBeanDao().insert(obj);
        } else {
            getBeanDao().update(obj);
        }
    }
    @Override
    public T findById(Long id) throws InstantiationException, IllegalAccessException {
        return getBeanDao().getById(id);
    }
}
