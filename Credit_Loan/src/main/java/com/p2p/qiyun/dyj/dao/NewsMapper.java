package com.p2p.qiyun.dyj.dao;

import com.p2p.qiyun.dyj.pojo.News;
import com.p2p.qiyun.dyj.pojo.NewsExample;
import com.p2p.qiyun.dyj.pojo.NewsQueryVO;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NewsMapper {
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer newsid);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);
    List<News> showNews(NewsQueryVO vo);
    int newscount(NewsQueryVO vo);
    News selectByPrimaryKey(Integer newsid);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}