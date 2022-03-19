package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.User;

public interface UserService {
	
	public void createUser(User user);
	
	public List<User> getUserByName(String userName);

}
