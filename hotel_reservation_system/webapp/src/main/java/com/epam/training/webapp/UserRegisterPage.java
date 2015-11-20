package com.epam.training.webapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.services.UserService;

public class UserRegisterPage {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext springBeansContext = new ClassPathXmlApplicationContext("spring-context.xml");

		UserService bean = springBeansContext.getBean(UserService.class);
		System.out.print(true);
	}
}
