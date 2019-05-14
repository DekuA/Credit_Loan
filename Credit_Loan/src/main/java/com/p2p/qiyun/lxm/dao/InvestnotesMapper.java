package com.p2p.qiyun.lxm.dao;

import com.p2p.qiyun.lxm.domain.Investnotes;
import com.p2p.qiyun.lxm.domain.InvestnotesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InvestnotesMapper {
	List<Investnotes> selByPid(int pid);
	
    int countByExample(InvestnotesExample example);

    int deleteByExample(InvestnotesExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Investnotes record);

    int insertSelective(Investnotes record);

    List<Investnotes> selectByExample(InvestnotesExample example);

    Investnotes selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") Investnotes record, @Param("example") InvestnotesExample example);

    int updateByExample(@Param("record") Investnotes record, @Param("example") InvestnotesExample example);

    int updateByPrimaryKeySelective(Investnotes record);

    int updateByPrimaryKey(Investnotes record);
}