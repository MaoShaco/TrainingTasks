package com.epam.training.services;

import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.dataaccess.model.RoomClass;

import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
public interface RoomService extends GenericInsertOrUpdateService<Room> {
    Room findByRoomNumber(Long roomNumber);

    List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType, RoomClass roomClass);

    List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType);

    List<Room> getAllRoomsWithBedsType(BedsType bedsType);

    List<Room> getAllRoomsWithRoomClass(RoomClass roomClass);
}
