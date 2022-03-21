package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.Answer;
import com.example.demo.dto.Question;

@Mapper
public interface AnswerDao {
	
	public List<Answer> selectAll();
	
	public void createAnswer(Answer answer);
	
	public List<Answer> getAnswerToQuestion(Question question);

}
