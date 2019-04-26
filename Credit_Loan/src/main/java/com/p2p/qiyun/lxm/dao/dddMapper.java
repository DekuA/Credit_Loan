package com.p2p.qiyun.lxm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.lxm.domain.ddd;

@Mapper
public interface dddMapper {
	List<ddd> selDDD();
}
