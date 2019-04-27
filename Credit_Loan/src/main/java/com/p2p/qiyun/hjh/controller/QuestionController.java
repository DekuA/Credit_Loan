package com.p2p.qiyun.hjh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.hjh.entity.Question;
import com.p2p.qiyun.hjh.entity.QuestionType;
import com.p2p.qiyun.hjh.service.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping("SelQuestionType")
	public List<QuestionType> SelQuestionType() {

		List<QuestionType> selectByExample = questionService.selectByExample();

		return selectByExample;

	}

	@RequestMapping("Selquestion")
	public List<Question> Selquestion(int qTId) {
		System.out.println("-------------"+qTId);
		List<Question> selquestion = questionService.Selquestion(qTId);
		return selquestion;
	}
}
