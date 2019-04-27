package com.p2p.qiyun.hjh.service;

import java.util.List;

import com.p2p.qiyun.hjh.entity.Question;
import com.p2p.qiyun.hjh.entity.QuestionType;

public interface QuestionService {
	List<QuestionType> selectByExample();
	List<Question>	Selquestion (int qTId);
}
