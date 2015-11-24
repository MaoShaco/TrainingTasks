package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.InOutDateDao;
import com.epam.training.dataaccess.model.InOutDate;
import com.epam.training.services.InOutDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
@Service
public class InOutDateServiceImpl extends GenericInsertOrUpdateServiceImpl<InOutDate> implements InOutDateService {

    @Autowired
    private InOutDateDao inOutDateDao;

    @Override
    protected GenericDao<InOutDate> getBeanDao() {
        return inOutDateDao;
    }
}
