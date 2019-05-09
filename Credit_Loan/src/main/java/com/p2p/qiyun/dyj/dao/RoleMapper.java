package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.Role;
import com.p2p.qiyun.dyj.pojo.RoleExample;
import com.p2p.qiyun.dyj.pojo.RoleQueryVO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RoleMapper {
    int countByExample(RoleQueryVO vo);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);
    int addRole(String rolename);
    int insertSelective(Role record);
    int deleteRole(int[] idlist);
    List<Role> selectByExample(RoleQueryVO vo);

    Role selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}