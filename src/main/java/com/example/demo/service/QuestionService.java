package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Question;

public interface QuestionService {
	
	public List<Question> getAllQuestions();
	
	public void createQuestion(Question question);

}
