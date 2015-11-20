package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomDao;
import com.epam.training.dataaccess.model.Room;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class RoomDaoImpl implements RoomDao {

    public static long ID_GEN;

    private static Map<Long, Room> TABLE_ROOM = new HashMap<>();

    @Override
    public Room getById(Long id) {
        return TABLE_ROOM.get(id);
    }

    @Override
    public void insert(Room room) {
        room.setId(ID_GEN++);
        TABLE_ROOM.put(room.getId(), room);
    }

    @Override
    public void update(Room obj) {

    }
}
