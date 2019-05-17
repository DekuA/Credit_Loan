package com.p2p.qiyun.cjz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cjz.dao.xinwenMapper;
import com.p2p.qiyun.cjz.dao.kahaoxxMapper;
import com.p2p.qiyun.cjz.domain.customer;
import com.p2p.qiyun.cjz.domain.news;
import com.p2p.qiyun.cjz.domain.userinfo;
import com.p2p.qiyun.cjz.service.kahaoxxService;
@Service
public class xinwenServiceImpol implements xinwenService{
	@Autowired
	private xinwenMapper dao;



	/*
	 * @Override public int countnews() { // TODO Auto-generated method stub int
	 * countinfo = dao.countnews(); return countinfo; }
	 */



	@Override
	public int deletenews(int[] idlist) {
		// TODO Auto-generated method stub
		int deleteinfo = dao.deletenews(idlist);
		return deleteinfo;
	}



	@Override
	public int newsadd(news s) {
		int newsadd = dao.newsadd(s);
		return newsadd;
	}



	@Override
	public int updatenews(news s) {
		int updatenews = dao.updatenews(s);
		return updatenews;
	}



	@Override
	public news selid(int id) {
		news selid = dao.selid(id);
		return selid;
	}



	@Override
	public List<news> listnews(news e) {
		List<news> listnews = dao.listnews(e);
		return listnews;
	}



	@Override
	public int countnews(String ntitle) {
		int countnews = dao.countnews(ntitle);
		return countnews;
	}

}
