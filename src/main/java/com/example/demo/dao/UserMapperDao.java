package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.User;

@Mapper
public interface UserMapperDao {
	
	@Select("SELECT * FROM user WHERE user_name = #{userName}")
	public List<User> getUserFromName(String userName);
	
//	public List<User> selectAll();

}
