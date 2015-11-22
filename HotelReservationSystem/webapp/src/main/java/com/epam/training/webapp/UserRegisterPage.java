package com.epam.training.webapp;

import com.epam.training.services.ClientInfoService;
import com.epam.training.services.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserRegisterPage {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {

		ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext(
				"spring-context.xml");

		ClientInfoService clientInfoService = aContext.getBean(ClientInfoService.class);
		clientInfoService.registerClient("23565524223");
		System.out.println(clientInfoService.get(1l).toString());

		ClientService clientService = aContext.getBean(ClientService.class);
		clientService.registerClient("HelloBatman", 1l);
		System.out.println(clientService.get(1l));

	}
}
