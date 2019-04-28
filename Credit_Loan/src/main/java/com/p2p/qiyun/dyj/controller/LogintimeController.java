package com.p2p.qiyun.dyj.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Logintime;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.service.LogintimeService;

@RestController
public class LogintimeController {
	@Autowired
	private LogintimeService ls;
	@RequestMapping("findLT")
	public Logintime findLT(HttpSession session){
		Users u=(Users)session.getAttribute("user");
		Logintime findLT = ls.findLT(u.getUsername());
		int addLT = ls.addLT(u.getUsername());
		return findLT;
	}
}
