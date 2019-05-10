package com.p2p.qiyun.wzr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.p2p.qiyun.wzr.domain.BorrowVO;
import com.p2p.qiyun.wzr.domain.Loan;
import com.p2p.qiyun.wzr.domain.Userinfo;
@Mapper
public interface BorrowMapper {
	List<Loan> borrowall(BorrowVO vo);
	int borrowallcount(BorrowVO vo);
}
