package com.epam.training.webapp;

import com.epam.training.services.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserRegisterPage {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {

		ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext(
				"spring-context.xml");

		//ClientInfoService clientInfoService = aContext.getBean(ClientInfoService.class);
		//clientInfoService.registerClient("s23565524223");

		ClientService clientService = aContext.getBean(ClientService.class);
		//clientService.registerClient("HelloBatman", 2l);
		System.out.println(clientService.get(9l));

	}
}
