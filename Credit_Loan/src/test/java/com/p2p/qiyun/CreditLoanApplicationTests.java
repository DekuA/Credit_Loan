package com.p2p.qiyun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.p2p.qiyun.hjh.dao.QuestionTypeMapper;
import com.p2p.qiyun.hjh.entity.QuestionType;
import com.p2p.qiyun.hjh.service.QuestionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditLoanApplicationTests {
	@Autowired
private QuestionService q;

	@Test
	public void contextLoads() {
	
		System.out.println(	q.selectByExample());
	}

}
