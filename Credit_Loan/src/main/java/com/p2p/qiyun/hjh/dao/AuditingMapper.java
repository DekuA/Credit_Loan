package com.p2p.qiyun.hjh.dao;

import com.p2p.qiyun.hjh.entity.Auditing;
import com.p2p.qiyun.hjh.entity.AuditingExample;
import com.p2p.qiyun.hjh.entity.Query;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AuditingMapper {
	int adcount(Query q);
	 List<Auditing>	selauditing(Query q);
    int countByExample(AuditingExample example);

    int deleteByExample(AuditingExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Auditing record);

    int insertSelective(Auditing record);

    List<Auditing> selectByExample(AuditingExample example);

    Auditing selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Auditing record, @Param("example") AuditingExample example);

    int updateByExample(@Param("record") Auditing record, @Param("example") AuditingExample example);

    int updateByPrimaryKeySelective(Auditing record);

    int updateByPrimaryKey(Auditing record);
}