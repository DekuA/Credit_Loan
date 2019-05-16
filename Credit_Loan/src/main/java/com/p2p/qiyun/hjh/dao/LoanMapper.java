package com.p2p.qiyun.hjh.dao;

import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.entity.LoanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoanMapper {
	 int loancount();
	 int loancount1();
	 Loan selloan(Integer userid);
	List<Loan> selStatus(Integer page);
	List<Loan> selStatus1(Integer page);
    int countByExample(LoanExample example);

    int deleteByExample(LoanExample example);

    int deleteByPrimaryKey(Integer loanid);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(LoanExample example);

    Loan selectByPrimaryKey(Integer loanid);

    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}