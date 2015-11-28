package com.epam.training.services.impl;

import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.dataaccess.model.RoomClass;
import com.epam.training.services.AbstractSpringTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Mao Shaco on 11/28/2015.
 */
public class RoomServiceImplTest extends AbstractSpringTest {

    @Autowired
    private RoomServiceImpl roomService;

    @Autowired
    private RoomInfoServiceImpl roomInfoServiceImpl;


    @Test
    public void testFindByRoomNumber() throws Exception {
        Assert.assertEquals(roomInfoServiceImpl.findById(1l).getId(), roomService.findByRoomNumber(1l).getRoomInfoId());
    }

    @Test
    public void testGetFreeRoomsOnDate() throws Exception {
        Date dateEntry = new GregorianCalendar(2016, 10, 15).getTime();
        Date dateOut = new GregorianCalendar(2016, 10, 30).getTime();

        RoomClass roomClass = new RoomClass();
        roomClass.setClassName("1+1");
        roomClass.setId(1l);

        BedsType bedsType = new BedsType();
        bedsType.setType("cheap");
        bedsType.setId(1l);

        Assert.assertEquals(1l, roomService.getFreeRoomsOnDate(dateEntry, dateOut, bedsType, roomClass).get(0).getId().longValue());
    }

    @Test
    public void testRegisterNewRoom() throws Exception {
        RoomClass roomClass = new RoomClass();
        roomClass.setClassName("cheap");
        roomClass.setId(1l);

        BedsType bedsType = new BedsType();
        bedsType.setType("1+1");
        bedsType.setId(1l);

        roomService.registerNewRoom(new BigDecimal(500), 31l, bedsType, roomClass);
    }
}