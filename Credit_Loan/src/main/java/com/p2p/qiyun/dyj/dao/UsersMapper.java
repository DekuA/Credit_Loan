package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.DeptQuerVO;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;
import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.dyj.pojo.UsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);
    int showDeptByDid(int[] deptid);
    int selectByRid(int[] rid);
    List<Users> selectByRIds(RoleQueryVO vo);
    int ridcount(RoleQueryVO vo);
    List<Users> selectByDeptIds(DeptQuerVO vo);
    int deptidcount(DeptQuerVO vo);
    Users selectByPrimaryKey(Integer uid);
    Users findPwd(String loginname);
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}