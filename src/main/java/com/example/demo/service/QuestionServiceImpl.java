package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.QuestionDao;
import com.example.demo.dto.Question;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionDao questionDao;

	@Override
	public List<Question> getAllQuestions() {
		return questionDao.selectAll();
	}

	@Override
	public void createQuestion(Question question) {
		questionDao.createQuestion(question);
	}

}
