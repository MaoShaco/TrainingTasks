package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.RoomDao;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class RoomServiceImpl extends GenericInsertOrUpdateServiceImpl<Room> implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    protected GenericDao<Room> getBeanDao() {
        return roomDao;
    }
}
