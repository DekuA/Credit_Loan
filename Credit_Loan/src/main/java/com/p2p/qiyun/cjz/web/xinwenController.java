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
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.xinwenService;
import com.p2p.qiyun.cjz.service.kahaoxxService;

@RestController
public class xinwenController {
	@Autowired
	private xinwenService ser;

	@RequestMapping("listnews")
	public Map listinfo(HttpServletRequest request) {
		int page = Integer.parseInt(request.getParameter("page"));
		int rows = Integer.parseInt(request.getParameter("rows"));
		int first = rows * (page - 1);
		System.out.println(first);
		Map map = new HashMap(); 
		List<news> listinfo = ser.listnews(new news(first, rows));
		int countinfo = ser.countnews();
		map.put("total", countinfo);
		map.put("rows", listinfo);
		return map;
		
	}
	@RequestMapping("deletenews")
	public int deletenews(int[] idlist) {
		int i = ser.deletenews(idlist);
		return i;
	}
	@RequestMapping("newsadd")
	public int newsadd(news s) {
	int newsadd = ser.newsadd(s);
		return newsadd;
	}
	@RequestMapping("updatenews")
	public int updatenews(int newsid,String ntitle,String ncontent,String ncreatedate) {
		/*
		 * news now = new news(); now.setNewsid(newsid);
		 */
		System.out.println(newsid+","+ntitle+","+ncontent+","+ncreatedate);
		news s = new news();
		s.setNewsid(newsid);
		s.setNtitle(ntitle);
		s.setNcontent(ncontent);
		s.setNcreatedate(ncreatedate);
		System.out.println(s);
		int updatenews = ser.updatenews(s);
		System.out.println("DIANJI"+updatenews);
		return updatenews;
	}
	@RequestMapping("selid")
	public news selid(int newsid) {
		news selid = ser.selid(newsid);
		System.out.println("點擊1修改拿到的值"+selid);
		return selid;
		
	}
	}

