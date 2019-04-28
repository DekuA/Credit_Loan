package com.p2p.qiyun.hjh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.hjh.dao.QuestionMapper;
import com.p2p.qiyun.hjh.dao.QuestionTypeMapper;
import com.p2p.qiyun.hjh.entity.Question;
import com.p2p.qiyun.hjh.entity.QuestionType;
import com.p2p.qiyun.hjh.entity.QuestionTypeExample;

@Service
public class QuestionServiceimpol implements QuestionService {
	@Autowired
private QuestionTypeMapper ques;
	@Autowired
private QuestionMapper qu;
	@Override
	public List<QuestionType> selectByExample() {
		// TODO Auto-generated method stub
	
			QuestionTypeExample example=new QuestionTypeExample();
			List<QuestionType> selectByExample = ques.selectByExample(example);
			return selectByExample;
			
		
	}

	@Override
	public List<Question> Selquestion(int qTId) {
		// TODO Auto-generated method stub
		List<Question> selquestion = qu.Selquestion(qTId);
		return selquestion; 
	} 
	
}
