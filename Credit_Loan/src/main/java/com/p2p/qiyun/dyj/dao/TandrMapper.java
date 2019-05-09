package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.Tandr;
import com.p2p.qiyun.dyj.pojo.TandrExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TandrMapper {
    int countByExample(TandrExample example);

    int deleteByExample(TandrExample example);

    int deleteByPrimaryKey(Integer trid);

    int insert(Tandr record);

    int insertSelective(Tandr record);

    List<Tandr> selectByExample(TandrExample example);
    List<Integer> selectId(int rid);
    Tandr selectByPrimaryKey(Integer trid);
    int deleteTandR(int[] idlist);
    int updateByExampleSelective(@Param("record") Tandr record, @Param("example") TandrExample example);

    int updateByExample(@Param("record") Tandr record, @Param("example") TandrExample example);

    int updateByPrimaryKeySelective(Tandr record);

    int updateByPrimaryKey(Tandr record);
}