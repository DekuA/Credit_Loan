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
	public Map seluser(HttpServletRequest request,String username) {
		username=username==null?"":username;
		System.out.println(username);
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		int first = rows * (page - 1);// 第几个记录数 
		Map map = new HashMap(); 
		List<customer> list = ser.seluser(new customer(first,rows,username));
		int ccount = ser.ccount(username);
		map.put("total", ccount);
		map.put("rows", list);
		return map;
	}
	/*
	 * @RequestMapping("mohu") public List mohu(HttpServletRequest request) throws
	 * UnsupportedEncodingException { String username =
	 * request.getParameter("username"); String user = new
	 * String(username.getBytes("ISO-8859-1"),"utf-8"); List<customer> mohu =
	 * ser.mohu(new customer(user)); return mohu;
	 * 
	 * }
	 */
	//客戶id查所有
	@RequestMapping("selkahao")
	public List<customer> selkahao(int userid){
		List<customer> selkahao = ser.selkahao(userid);
		return selkahao;
		
	}
	/*
	 * @RequestMapping("listinfo") public Map listinfo(HttpServletRequest request) {
	 * int page = Integer.parseInt(request.getParameter("page")); int rows =
	 * Integer.parseInt(request.getParameter("rows")); int first = rows * (page -
	 * 1); Map map = new HashMap(); List<info> listinfo = ser.listinfo(new
	 * info(first, rows)); int countinfo = ser.countinfo(); map.put("total",
	 * countinfo); map.put("rows", listinfo); return map;
	 * 
	 * }
	 */
	}

