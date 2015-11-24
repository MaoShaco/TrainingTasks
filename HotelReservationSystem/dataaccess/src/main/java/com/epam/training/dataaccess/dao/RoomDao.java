package com.epam.training.dataaccess.dao;

import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.dataaccess.model.RoomClass;

import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public interface RoomDao extends GenericDao<Room> {
    List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType);

    List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, RoomClass roomClass, BedsType bedsType);

    List<Room> getRoomsOnRoomClass(RoomClass roomClass);

    List<Room> getRoomsOnBedsType(BedsType bedsType);

    Room findRoomByNumber(Long roomNumber);
}
