package com.epam.training.services;

import com.epam.training.dataaccess.model.AbstractDataObject;
import com.epam.training.services.ServicesExceptions.NoSuchDataInDaoException;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public interface GenericInsertOrUpdateService<T extends AbstractDataObject> {

    void insertOrUpdate(T obj);

    T findById(Long id) throws InstantiationException, IllegalAccessException, NoSuchDataInDaoException;
}
