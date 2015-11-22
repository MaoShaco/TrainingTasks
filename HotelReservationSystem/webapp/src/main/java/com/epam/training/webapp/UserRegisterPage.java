package com.epam.training.webapp;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.services.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserRegisterPage {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext("spring-context.xml");

        /*ClientInfoService clientInfoService = aContext.getBean(ClientInfoService.class);
        clientInfoService.registerClient("235655244223");
        System.out.println(clientInfoService.get(2l).toString());*/

        ClientService clientService = aContext.getBean(ClientService.class);
        //clientService.registerClient("HelloBat", 1l);
        //clientService.registerClient("HelloBatman", 2l);
        Client a = new Client();
        a.setClientInfoId(1l);
        a.setClientName("asddsasd");
        clientService.updateClient(4l,a);
        //clientService.registerClient("HelloBat", 2l);
        //System.out.println(clientService.get(2l));

    }
}
