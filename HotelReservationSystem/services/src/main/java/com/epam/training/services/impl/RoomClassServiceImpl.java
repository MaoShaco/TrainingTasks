package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.RoomClassDao;
import com.epam.training.dataaccess.model.RoomClass;
import com.epam.training.services.RoomClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
@Service
public class RoomClassServiceImpl extends GenericInsertOrUpdateServiceImpl<RoomClass> implements RoomClassService {

    @Autowired
    private RoomClassDao roomClassDao;

    @Override
    protected GenericDao<RoomClass> getBeanDao() {
        return roomClassDao;
    }
}
