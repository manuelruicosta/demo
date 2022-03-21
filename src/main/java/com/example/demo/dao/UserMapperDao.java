package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.User;

@Mapper
public interface UserMapperDao {
	
	public List<User> getUserFromName(String userName);
	
	public List<User> selectAll();
	
	public void createUser(User user);

}
