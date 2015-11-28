package com.epam.training.services.impl;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.AbstractSpringTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Mao Shaco on 11/28/2015.
 */
public class OrderServiceImplTest extends AbstractSpringTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Test
    public void testGetClientOrders() throws Exception {
        Client client = new Client();
        client.setClientInfoId(8l);
        client.setId(6l);
        client.setClientName("RandomName");

        orderService.getClientOrders(client);
        Assert.assertEquals(1l, orderService.getClientOrders(client).get(0).getId().longValue());

    }

    @Test
    public void testGetOrdersOnDate() throws Exception {
        Assert.assertEquals(1l, orderService.getOrdersOnDate(Calendar.getInstance().getTime()).get(0).getId().longValue());
    }

    @Test
    public void testRegisterNewOrder() throws Exception {

        Client client = new Client();
        client.setClientInfoId(3l);
        client.setId(9l);
        client.setClientName("Vadimka");

        Room room = new Room();
        room.setCostPerDay(new BigDecimal(500));
        room.setRoomInfoId(1l);
        room.setId(1l);
        room.setRoomClassId(1l);
        room.setBedsTypeId(1l);

        orderService.registerNewOrder(client, room, new GregorianCalendar(2015, 10, 15).getTime(), new GregorianCalendar(2015, 10, 30).getTime());
    }
}