package com.epam.training.webapp;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.ClientService;
import com.epam.training.services.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UserRegisterPage {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext("spring-context.xml");

        //ClientInfoService clientInfoService = aContext.getBean(ClientInfoService.class);
        //clientInfoService.registerClient("tratatatata");
       /* ClientInfo b = new ClientInfo();
        b.setId(3l);
        b.setCreditCardNumber("tratatatata");
        clientInfoService.insertOrUpdate(b);
        System.out.println(clientInfoService.findById(3l).toString());*/

        ClientService clientService = aContext.getBean(ClientService.class);
     clientService.findByRoomAndDate(new Room(), Calendar.getInstance().getTime());
        OrderService orderService = aContext.getBean(OrderService.class);
        System.out.println(clientService.findById(6l));

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


        orderService.registerNewOrder(client,room, new GregorianCalendar(2015,10,15).getTime(), new GregorianCalendar(2015,10,30).getTime());

        //clientService.registerClient("HelloBat", 1l);
        //clientService.registerClient("HelloBatman", 2l);
        //Client a = new Client();
        //a.setId(8l);
        //a.setClientInfoId(5l);
       // clientService.insertOrUpdate(a);

        //clientService.updateClient(4l,a);
        //clientService.registerClient("HelloBatG", 3l);
        //System.out.println(clientService.get(2l));

       /* Room room = new Room();
        room.setId(1l);
        room.setBedsTypeId(1l);
        room.setRoomClassId(1l);
        room.setRoomInfoId(1l);
        room.setCostPerDay(new BigDecimal(500));

        Client client = clientService.findByRoomAndDate(room, Calendar.getInstance().getTime());
        System.out.println(client);*/
    }
}
