package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.RoomInfoDao;
import com.epam.training.dataaccess.model.RoomInfo;
import com.epam.training.services.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class RoomInfoServiceImpl extends GenericInsertOrUpdateServiceImpl<RoomInfo> implements RoomInfoService {

    @Autowired
    private RoomInfoDao roomInfoDao;

    @Override
    protected GenericDao<RoomInfo> getBeanDao() {
        return roomInfoDao;
    }
}
