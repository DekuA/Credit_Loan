package com.p2p.qiyun.cc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.cc.dao.ProductMapper;
import com.p2p.qiyun.cc.pojo.Product;

@Service
public class ProductService {
	@Autowired
	private ProductMapper mapper;
	
	public String save(String pimageyi, String pimageer) {
		String save = mapper.save(pimageyi,pimageer);
		return save;
	}
	public List<Product> list(int pid){
		List<Product> list = mapper.list(pid);
		return list;
		
	}
	
}