package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.UserDao;
import com.epam.training.dataaccess.model.User;
import com.epam.training.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@PostConstruct
	private void init() {
		System.out.print(true);
	}

	@Override
	public void insertOrUpdate(User user) {
		if (user.getId() == null) {
			userDao.insert(user);
		} else {
			userDao.update(user);
		}
	}

	@Override
	public void registerUser(String firstName, String lastName, String email) {

		User user = new User();
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setCreationDate(new Date());
		userDao.insert(user);
		// send email
	}

}