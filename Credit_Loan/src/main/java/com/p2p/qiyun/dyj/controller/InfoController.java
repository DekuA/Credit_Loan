package com.p2p.qiyun.dyj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.Info;
import com.p2p.qiyun.dyj.service.InfoService;

@RestController
public class InfoController {
	@Autowired
	private InfoService is;
	@RequestMapping("/showInfo")
	public List<Info> showInfo(){
		List<Info> showInfo = is.showInfo();
		System.out.println(showInfo);
		return showInfo;
	}
}
