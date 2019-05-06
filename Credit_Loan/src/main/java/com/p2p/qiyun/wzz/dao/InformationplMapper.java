package com.p2p.qiyun.wzz.dao;

import com.p2p.qiyun.wzz.entity.Informationpl;
import com.p2p.qiyun.wzz.entity.InformationplExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InformationplMapper {
    int countByExample(InformationplExample example);

    int deleteByExample(InformationplExample example);

    int deleteByPrimaryKey(Integer informationId);

    int insert(Informationpl record);

    int insertSelective(Informationpl record);

    List<Informationpl> selectByExample(InformationplExample example);

    Informationpl selectByPrimaryKey(Integer informationId);

    int updateByExampleSelective(@Param("record") Informationpl record, @Param("example") InformationplExample example);

    int updateByExample(@Param("record") Informationpl record, @Param("example") InformationplExample example);

    int updateByPrimaryKeySelective(Informationpl record);

    int updateByPrimaryKey(Informationpl record);
}