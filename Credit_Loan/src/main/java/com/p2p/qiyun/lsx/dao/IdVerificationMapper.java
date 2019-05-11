package com.p2p.qiyun.lsx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.p2p.qiyun.wzr.domain.Userinfo;



@Mapper
public interface IdVerificationMapper {

	Userinfo useridVerification(@Param("userid")int uid);
}
