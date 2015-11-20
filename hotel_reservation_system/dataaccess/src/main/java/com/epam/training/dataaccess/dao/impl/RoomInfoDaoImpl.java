package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomInfoDao;
import com.epam.training.dataaccess.model.RoomInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class RoomInfoDaoImpl implements RoomInfoDao {

    public static long ID_GEN;

    private static Map<Long, RoomInfo> TABLE_ROOM_INFO = new HashMap<>();


    @Override
    public RoomInfo getById(Long id) {
        return TABLE_ROOM_INFO.get(id);
    }

    @Override
    public void insert(RoomInfo roomInfo) {
        roomInfo.setId(ID_GEN++);
        TABLE_ROOM_INFO.put(roomInfo.getId(), roomInfo);
    }

    @Override
    public void update(RoomInfo obj) {

    }
}
