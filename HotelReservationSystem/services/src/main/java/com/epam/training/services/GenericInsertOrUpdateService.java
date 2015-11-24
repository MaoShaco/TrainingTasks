package com.epam.training.services;

import com.epam.training.dataaccess.model.AbstractDataObject;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public interface GenericInsertOrUpdateService<T extends AbstractDataObject> {

    void insertOrUpdate(T obj);

    T findById(Long id) throws InstantiationException, IllegalAccessException;
}
