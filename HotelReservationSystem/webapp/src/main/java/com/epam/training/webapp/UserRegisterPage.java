package com.epam.training.webapp;

import com.epam.training.services.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        System.out.println(clientService.findById(6l));
        //clientService.registerClient("HelloBat", 1l);
        //clientService.registerClient("HelloBatman", 2l);
        //Client a = new Client();
        //a.setId(8l);
        //a.setClientInfoId(5l);
       // clientService.insertOrUpdate(a);

        //clientService.updateClient(4l,a);
        //clientService.registerClient("HelloBatG", 3l);
        //System.out.println(clientService.get(2l));

    }
}
