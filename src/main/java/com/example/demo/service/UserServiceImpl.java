package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapperDao;
import com.example.demo.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapperDao userDao;
	
	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

	@Override
	public List<User> getUserByName(String userName) {
		return userDao.getUserFromName(userName);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.selectAll();
	}
	
}
