package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.RoomDao;
import com.epam.training.dataaccess.dao.RoomInfoDao;
import com.epam.training.dataaccess.model.*;
import com.epam.training.services.RoomService;
import com.epam.training.services.ServicesExceptions.NoSuchDataInDaoException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class RoomServiceImpl extends GenericInsertOrUpdateServiceImpl<Room> implements RoomService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoomServiceImpl.class);

    @Autowired
    private RoomInfoDao roomInfoDao;

    @Autowired
    private RoomDao roomDao;

    @Override
    protected GenericDao<Room> getBeanDao() {
        return roomDao;
    }

    @Override
    public Room findByRoomNumber(Long roomNumber) throws NoSuchDataInDaoException {
        LOGGER.info("Getting room by roomNumber: {}", roomNumber);
        try {
            return roomDao.findRoomByNumber(roomNumber);
        }catch(EmptyResultDataAccessException e){
            throw new NoSuchDataInDaoException(Room.class.toString(), roomNumber);
        }
    }

    @Override
    public void registerNewRoom(BigDecimal costPerDay, Long roomNumber, BedsType bedsType, RoomClass roomClass) {

        Room room = new Room();

        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setRoomNumber(roomNumber);

        room.setRoomInfoId(roomInfoDao.insert(roomInfo));
        room.setRoomClassId(roomClass.getId());
        room.setBedsTypeId(bedsType.getId());
        room.setCostPerDay(costPerDay);

        LOGGER.debug("Inserting RoomInfo id: {} for registering new room", room.getRoomInfoId());

        long id = roomDao.insert(room);
        LOGGER.info("Registering new room id: {}", id);
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType, RoomClass roomClass) {
        LOGGER.info("Getting all freeRooms on date from {} to {} with roomClass:{} and bedsType:{}", entryDate, outDate, bedsType.getType(), roomClass.getClassName());
        return roomDao.getFreeRoomsOnDate(entryDate, outDate, roomClass, bedsType);
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType) {
        LOGGER.info("Getting all freeRooms on date from {} to {} with roomClass:{}", entryDate, outDate, bedsType.getType());
        return roomDao.getFreeRoomsOnDate(entryDate, outDate, bedsType);
    }

    @Override
    public List<Room> getAllRoomsWithBedsType(BedsType bedsType) {
        LOGGER.info("Getting all free Rooms with bedsType:{}", bedsType.getType());
        return roomDao.getRoomsOnBedsType(bedsType);
    }

    @Override
    public List<Room> getAllRoomsWithRoomClass(RoomClass roomClass) {
        LOGGER.info("Getting all free Rooms with roomClass:{}", roomClass.getClassName());
        return roomDao.getRoomsOnRoomClass(roomClass);
    }
}
