package com.p2p.qiyun.cjz.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.investnotes;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.xinwenService;
import com.p2p.qiyun.cjz.service.kahaoxxService;
import com.p2p.qiyun.cjz.service.touziService;

@RestController
public class touziController {
	@Autowired
	private touziService ser;

	@RequestMapping("listtouzi")
	public Map listinfo(HttpServletRequest request) {
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		int first = rows * (page - 1);
		System.out.println(first = rows * (page - 1));
		Map map = new HashMap(); 
		List<investnotes> listtouzi = ser.listtouzi(new investnotes(first, rows));
		int counttouzi = ser.counttouzi();
		map.put("total", counttouzi);
		map.put("rows", listtouzi);
		return map;	
	}
	}

