package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Question;

@Mapper
public interface QuestionDao {
	
	public List<Question> selectAll();
	
	public void createQuestion(Question question);

}
