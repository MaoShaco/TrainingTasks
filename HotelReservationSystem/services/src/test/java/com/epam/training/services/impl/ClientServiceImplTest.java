package com.epam.training.services.impl;

import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.AbstractSpringTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by Mao Shaco on 11/28/2015.
 */
public class ClientServiceImplTest extends AbstractSpringTest {

    @Autowired
    private ClientServiceImpl clientService;

    @Test
    public void testRegisterClient() throws Exception {

        String name = "RandomName";
        String creditCardNumber = "123456789987654321";

        clientService.registerClient(name, creditCardNumber);
    }

    @Test
    public void testFindByRoomAndDate() throws Exception {

        Room room = new Room();
        room.setId(1l);
        room.setBedsTypeId(1l);
        room.setRoomClassId(1l);
        room.setRoomInfoId(1l);
        room.setCostPerDay(new BigDecimal(500));

        Assert.assertEquals(6l, clientService.findByRoomAndDate(room, Calendar.getInstance().getTime()).getId().longValue());
    }
}