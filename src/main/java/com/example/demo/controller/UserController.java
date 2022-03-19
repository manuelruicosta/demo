package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("addUser")
	public String addUser(@RequestBody User user) {
		userService.createUser(user);
		return "success";
	}
	
	@GetMapping("getUserByName")
	public List<User> getUserByName(@RequestBody User user){
		return userService.getUserByName(user.getUserName());
	}
	
}
