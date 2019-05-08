package com.p2p.qiyun.cjz.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.kahaoxxService;

@RestController
public class kahaoxxController {
	@Autowired
	private kahaoxxService ser;

	/*
	 * @RequestMapping("listuser") public List<customer> seluser(customer c) {
	 * List<customer> list = ser.seluser(c); System.out.println(list); return list;
	 * }
	 */

	@RequestMapping("listuser")
	public Map seluser(HttpServletRequest request) {
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		int first = rows * (page - 1);// 第几个记录数 
		Map map = new HashMap(); 
		List<customer> list = ser.seluser(new customer(first, rows));
		int ccount = ser.ccount();
		map.put("total", ccount);
		map.put("rows", list);
		return map;
	}

}
