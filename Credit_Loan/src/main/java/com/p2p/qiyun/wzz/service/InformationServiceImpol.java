package com.p2p.qiyun.wzz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.wzz.dao.InformationplMapper;
import com.p2p.qiyun.wzz.entity.Informationpl;

@Service
public class InformationServiceImpol implements InformationService{
	@Autowired
	private InformationplMapper us;

	@Override
	public Informationpl selectByPrimaryKey(Integer informationId) {
		// TODO Auto-generated method stub
	  Informationpl deleteByPrimaryKey = us.selectByPrimaryKey(informationId);
		
		return deleteByPrimaryKey;
	}
	
	

}
