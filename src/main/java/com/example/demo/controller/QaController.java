package com.example.demo.controller;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Question;
import com.example.demo.service.QuestionService;

@RestController
public class QaController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("hello-qa")
	public String helloQa() {
		return "hello";
	}
	
	@GetMapping("getAllQuestions")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
	
	@PostMapping("newQuestion")
	public void newQuestion(@RequestBody Question question) {
//		question.setCreatedAt(Timestamp.from(Instant.now()).toString());
		questionService.createQuestion(question);
	}

}
