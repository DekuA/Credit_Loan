package com.p2p.qiyun.lxm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.lxm.domain.ddd;
import com.p2p.qiyun.lxm.service.dddService;

@RestController
public class MyController {
	@Autowired
	private dddService ds;
	
	@RequestMapping("selddd")
	public List<ddd> selddd() {
		return ds.selDDD();
	}
	
}
