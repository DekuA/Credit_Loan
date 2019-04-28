package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.Trees;
import com.p2p.qiyun.dyj.pojo.TreesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TreesMapper {
    int countByExample(TreesExample example);

    int deleteByExample(TreesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trees record);

    int insertSelective(Trees record);

    List<Trees> selectByExample(TreesExample example);
    List<Trees> find(List<Integer> tid);
    List<Trees> select(int id);
    Trees selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trees record, @Param("example") TreesExample example);

    int updateByExample(@Param("record") Trees record, @Param("example") TreesExample example);

    int updateByPrimaryKeySelective(Trees record);

    int updateByPrimaryKey(Trees record);
}