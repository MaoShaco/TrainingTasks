package com.epam.training.dataaccess.dao;

import com.epam.training.dataaccess.model.AbstractDataObject;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public interface GenericDao<T extends AbstractDataObject> {

    T getById(Long id) throws IllegalAccessException, InstantiationException;

    void insert(T obj);

    void update(Long id, T entity);
}
