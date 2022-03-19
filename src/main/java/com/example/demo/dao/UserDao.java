package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.User;

public interface UserDao {
	
	public void saveUser(User user);
	
	public List<User> getUserByName(String userName);

}