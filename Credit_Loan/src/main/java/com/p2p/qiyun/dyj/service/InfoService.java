package com.p2p.qiyun.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.dyj.dao.InfoMapper;
import com.p2p.qiyun.dyj.pojo.Info;
import com.p2p.qiyun.dyj.pojo.InfoExample;

@Service
public class InfoService {
	@Autowired
	private InfoMapper mapper;
	public List<Info> showInfo(){
		List<Info> selectByExample = mapper.selectByExample(new InfoExample());
		return selectByExample;
	}
}
