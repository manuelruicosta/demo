package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Answer;
import com.example.demo.dto.Question;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;

@RestController
public class QaController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerService answerService;
	
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
	
	@GetMapping("getAnswerToQuestion")
	public List<Answer> getAnswerToQuestionId(@RequestBody Question question){
		return answerService.getAnswerToQuestion(question);
	}
	
	@PostMapping("addAnswer")
	public void addAnswer(Answer answer) {
		answerService.addAnswer(answer);
	}

}
