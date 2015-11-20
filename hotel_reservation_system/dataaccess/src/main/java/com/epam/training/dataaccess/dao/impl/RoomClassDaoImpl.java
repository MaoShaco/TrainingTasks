package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomClassDao;
import com.epam.training.dataaccess.model.RoomClass;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class RoomClassDaoImpl implements RoomClassDao {

    public static long ID_GEN;

    private static Map<Long, RoomClass> TABLE_ROOM_CLASS = new HashMap<>();

    @Override
    public RoomClass getById(Long id) {
        return TABLE_ROOM_CLASS.get(id);
    }

    @Override
    public void insert(RoomClass roomClass) {
        roomClass.setId(ID_GEN++);
        TABLE_ROOM_CLASS.put(roomClass.getId(), roomClass);
    }

    @Override
    public void update(RoomClass obj) {

    }
}
