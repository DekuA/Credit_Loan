package com.p2p.qiyun.lxm.dao;

import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.BalanceExamplelxm;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalanceMapperlxm {
	int upBalanceByUidjia(Balancelxm record);
	
	int upBalanceByUid(Balancelxm record);
	
	Balancelxm selectBalanceByUid(int uid);
	
    int countByExample(BalanceExamplelxm example);

    int deleteByExample(BalanceExamplelxm example);

    int deleteByPrimaryKey(Integer yueid);

    int insert(Balancelxm record);

    int insertSelective(Balancelxm record);

    List<Balancelxm> selectByExample(BalanceExamplelxm example);

    Balancelxm selectByPrimaryKey(Integer yueid);

    int updateByExampleSelective(@Param("record") Balancelxm record, @Param("example") BalanceExamplelxm example);

    int updateByExample(@Param("record") Balancelxm record, @Param("example") BalanceExamplelxm example);

    int updateByPrimaryKeySelective(Balancelxm record);

    int updateByPrimaryKey(Balancelxm record);
}