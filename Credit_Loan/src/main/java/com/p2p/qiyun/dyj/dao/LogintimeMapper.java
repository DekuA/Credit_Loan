package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.Logintime;
import com.p2p.qiyun.dyj.pojo.LogintimeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogintimeMapper {
    int countByExample(LogintimeExample example);

    int deleteByExample(LogintimeExample example);

    int deleteByPrimaryKey(Integer ltid);

    int insert(String ltname);

    int insertSelective(Logintime record);

    List<Logintime> selectByExample(LogintimeExample example);

    Logintime selectByPrimaryKey(Integer ltid);
    Logintime findLT(String username);
    
    int updateByExampleSelective(@Param("record") Logintime record, @Param("example") LogintimeExample example);

    int updateByExample(@Param("record") Logintime record, @Param("example") LogintimeExample example);

    int updateByPrimaryKeySelective(Logintime record);

    int updateByPrimaryKey(Logintime record);
}