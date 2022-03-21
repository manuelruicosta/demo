package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AnswerDao;
import com.example.demo.dto.Answer;
import com.example.demo.dto.Question;

@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	private AnswerDao answerDao;

	@Override
	public void addAnswer(Answer answer) {
		answerDao.createAnswer(answer);
	}

	@Override
	public List<Answer> getAnswerToQuestion(Question question) {
		return answerDao.getAnswerToQuestion(question);
	}

}
