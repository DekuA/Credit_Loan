package com.p2p.qiyun.wzz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.wzz.entity.Informationpl;
import com.p2p.qiyun.wzz.service.InformationService;

@RestController
public class InformationController {
	@Autowired
	private InformationService user;
	
	@RequestMapping("infordata")
	public Informationpl data(){
		Informationpl selectByPrimaryKey = user.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
		return selectByPrimaryKey;
		
	}

}
