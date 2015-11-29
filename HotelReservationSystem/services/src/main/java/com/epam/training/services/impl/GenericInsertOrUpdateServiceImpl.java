package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import com.epam.training.services.GenericInsertOrUpdateService;
import com.epam.training.services.ServicesExceptions.NoSuchDataInDaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public abstract class GenericInsertOrUpdateServiceImpl<T extends AbstractDataObject> implements GenericInsertOrUpdateService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenericInsertOrUpdateServiceImpl.class);

    protected abstract GenericDao<T> getBeanDao();

    @Override
    public void insertOrUpdate(T obj) {
        if (obj.getId() == null) {
            long id = getBeanDao().insert(obj);
            LOGGER.info("New {} id: {} inserting into dao", obj.getClass().toString(), id);
        } else {
            getBeanDao().update(obj);
            LOGGER.info("Updating {} id: {} inserting into dao", obj.getClass().toString(), obj.getId());
        }
    }

    @Override
    public T findById(Long id) throws InstantiationException, IllegalAccessException, NoSuchDataInDaoException {
        LOGGER.info("Getting object with {} by id: {}", getBeanDao().getClass());
        try {
            return getBeanDao().getById(id);

        }catch(EmptyResultDataAccessException e){
            throw new NoSuchDataInDaoException(getBeanDao().getClass().toString(), id);
        }
    }
}
