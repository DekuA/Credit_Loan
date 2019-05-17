package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.Dept;
import com.p2p.qiyun.dyj.pojo.DeptExample;
import com.p2p.qiyun.dyj.pojo.DeptQuerVO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DeptMapper {
    int countByExample(DeptQuerVO vo);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Integer deptid);

    int insert(Dept record);
    int addDept(String deptname);
    int insertSelective(Dept record);
    int deleteDept(int[] idlist);
    List<Dept> selectByExample(DeptQuerVO vo);

    Dept selectByPrimaryKey(Integer deptid);
    int showByDeptname(String deptname);
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}