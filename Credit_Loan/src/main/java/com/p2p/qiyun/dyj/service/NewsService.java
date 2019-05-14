package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.NewsMapper;
import com.p2p.qiyun.dyj.pojo.News;
import com.p2p.qiyun.dyj.pojo.NewsQueryVO;

@Service
public class NewsService {
	@Autowired
	private NewsMapper mapper;
	public List<News> showNews(NewsQueryVO vo){
		List<News> showNews = mapper.showNews(vo);
		return showNews;
	}
	public int newscount(NewsQueryVO vo){
		int newscount = mapper.newscount(vo);
		return newscount;
	}
	public News findNews(int nid){
		News selectByPrimaryKey = mapper.selectByPrimaryKey(nid);
		return selectByPrimaryKey;
	}
}
