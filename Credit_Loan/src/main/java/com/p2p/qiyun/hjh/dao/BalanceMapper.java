package com.p2p.qiyun.hjh.dao;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.hjh.entity.Balance;

@Mapper
public interface BalanceMapper {
	Balance	selectBalanceBy(int id);
	int updateBalace(Balance b);
}
