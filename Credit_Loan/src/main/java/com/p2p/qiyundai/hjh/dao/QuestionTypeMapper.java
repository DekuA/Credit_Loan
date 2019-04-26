package com.p2p.qiyundai.hjh.dao;

import com.p2p.qiyundai.hjh.entity.QuestionType;
import com.p2p.qiyundai.hjh.entity.QuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeMapper {
    int countByExample(QuestionTypeExample example);

    int deleteByExample(QuestionTypeExample example);

    int deleteByPrimaryKey(Integer qTId);

    int insert(QuestionType record);

    int insertSelective(QuestionType record);

    List<QuestionType> selectByExample(QuestionTypeExample example);

    QuestionType selectByPrimaryKey(Integer qTId);

    int updateByExampleSelective(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    int updateByExample(@Param("record") QuestionType record, @Param("example") QuestionTypeExample example);

    int updateByPrimaryKeySelective(QuestionType record);

    int updateByPrimaryKey(QuestionType record);
}