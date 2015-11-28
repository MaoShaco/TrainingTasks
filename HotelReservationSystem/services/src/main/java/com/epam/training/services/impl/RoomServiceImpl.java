package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.RoomDao;
import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.dataaccess.model.RoomClass;
import com.epam.training.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Override
    public Room findByRoomNumber(Long roomNumber) {
        return roomDao.findRoomByNumber(roomNumber);
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType, RoomClass roomClass) {
        return getFreeRoomsOnDate(entryDate, outDate, bedsType, roomClass);
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType) {
        return getFreeRoomsOnDate(entryDate, outDate, bedsType);
    }

    @Override
    public List<Room> getAllRoomsWithBedsType(BedsType bedsType) {
        return roomDao.getRoomsOnBedsType(bedsType);
    }

    @Override
    public List<Room> getAllRoomsWithRoomClass(RoomClass roomClass) {
        return roomDao.getRoomsOnRoomClass(roomClass);
    }

}
