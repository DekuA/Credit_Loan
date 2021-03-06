package com.p2p.qiyun.lxm.dao;

import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ProjectExample;
import com.p2p.qiyun.lxm.domain.SelZhaiQuan;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProjectMapper {
	int selYihuanqishu(int loanid);
	
	int insertBysp(Project pro);
	
	int updatePschedule(int pschedule,String pid);
	
	int selYuqicishu(SelZhaiQuan selzq);
	
	int selCountloanPay(int userid);
	
	int selcountloan(int userid);
	
	String selsumloan(int userid);
	
	String selPayMoney(int userid);
	
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer pid);
    
    Project selProjectByLoanid(int loanid);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}