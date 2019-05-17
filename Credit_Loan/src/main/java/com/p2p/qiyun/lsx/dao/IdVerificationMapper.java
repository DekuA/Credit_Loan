package com.p2p.qiyun.lsx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.hjh.entity.Customer;
import com.p2p.qiyun.lsx.entity.Balance2;
import com.p2p.qiyun.wzr.domain.Userinfo;



@Mapper
public interface IdVerificationMapper {

	Userinfo useridVerification(@Param("userid")int uid);
	
	Balance2 findBalance(@Param("userid")int uid);
	
	Customer findCustomer(@Param("userid")int uid);
}
