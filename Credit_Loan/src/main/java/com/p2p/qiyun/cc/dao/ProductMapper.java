package com.p2p.qiyun.cc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.cc.pojo.Product;

@Mapper
public interface ProductMapper {
		//查询商品
	 	List<Product> list(int pid);
	 	//保存商品
	 	String save(String pimageyi, String pimageer);
}
