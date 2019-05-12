package com.p2p.qiyun.dby.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dby.pojo.account;
import com.p2p.qiyun.dby.service.accountService;


@RestController
public class accountController {

	@Autowired
	private accountService as;
	
	@RequestMapping("getAccount")
	public List<account> addRecrod(account ac) {
		List<account> recrod = as.getRecord(ac);
		return recrod;
	}
	
	
	
}
