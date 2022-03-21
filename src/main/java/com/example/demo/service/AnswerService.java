package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Answer;
import com.example.demo.dto.Question;

public interface AnswerService {
	
	public void addAnswer(Answer answer);
	
	public List<Answer> getAnswerToQuestion(Question question);

}
