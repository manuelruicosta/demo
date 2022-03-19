package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dto.User;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveUser(User user) {
		jdbcTemplate.update("insert into user(user_name,user_password,user_email,birthdate) values(?,?,?,?)", 
				new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						// TODO Auto-generated method stub
						ps.setString(1, user.getUserName());
						ps.setString(2, user.getPassword());
						ps.setString(3, user.getEmail());
						ps.setString(4, user.getBirthdate());
					}
			
		});
	}

	@Override
	public List<User> getUserByName(String userName) {
		return jdbcTemplate.query(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				return con.prepareStatement("select user_name,user_email,birthdate from user where user_name='" + userName + "'");
			}
		}, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUserName(rs.getString(1));
				user.setEmail(rs.getString(2));
				user.setBirthdate(rs.getString(3));
				return user;
			}
			
		});
		
	}
	
}
