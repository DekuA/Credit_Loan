package com.p2p.qiyun.dyj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2p.qiyun.dyj.pojo.News;
import com.p2p.qiyun.dyj.pojo.NewsQueryVO;
import com.p2p.qiyun.dyj.service.NewsService;

@RestController
public class NewsController {
	@Autowired
	private NewsService ns;
	@RequestMapping("/showNews")
	public Map<String, Object> showNews(int yeshu){
		NewsQueryVO vo=new NewsQueryVO();
		vo.setMaxPage(5);
		vo.setPageNum((yeshu-1)*5);
		List<News> showNews = ns.showNews(vo);
		int newscount = ns.newscount(vo);
		int num=newscount%5==0?(newscount/5):(newscount/5)+1;
		Map map = new HashMap();
		map.put("rows",showNews);
		map.put("total",num);
		return map;
	}
	@RequestMapping("/findNews")
	public News findNews(int newsid){
		News findNews = ns.findNews(newsid);
		return findNews;
	}
}
