package com.p2p.qiyun.hjh.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.entity.Question;
import com.p2p.qiyun.hjh.entity.QuestionType;
import com.p2p.qiyun.hjh.service.LoanService;
import com.p2p.qiyun.hjh.service.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	@Autowired
	private LoanService loanservice;
	@RequestMapping("SelQuestionType")
	public List<QuestionType> SelQuestionType() {

		List<QuestionType> selectByExample = questionService.selectByExample();
		
		return selectByExample;

	}

	@RequestMapping("Selquestion")
	public List<Question> Selquestion(int qTId) {
		
		List<Question> selquestion = questionService.Selquestion(qTId);
	
		return selquestion;
	}
	@RequestMapping("selStatus")
	public List<Loan>  selStatus() {
		
		List<Loan> selStatus = loanservice.selStatus();
	
		return selStatus;
	}

}
