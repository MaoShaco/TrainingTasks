package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.BedsTypeDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.services.BedsTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
@Service
public class BedsTypeServiceImpl extends GenericInsertOrUpdateServiceImpl<BedsType> implements BedsTypeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BedsTypeServiceImpl.class);

    @Autowired
    private BedsTypeDao bedsTypeDao;

    @Override
    protected GenericDao<BedsType> getBeanDao() {
        return bedsTypeDao;
    }

    @Override
    public List<BedsType> getAllBedsTypes(){
            LOGGER.info("Looking for all BedsTypes from dao");
        return bedsTypeDao.getAll();
    }

}
