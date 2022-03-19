package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void createUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public List<User> getUserByName(String userName) {
		return userDao.getUserByName(userName);
	}
	
}
