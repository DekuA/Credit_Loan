package com.p2p.qiyun.hjh.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.qiyun.dyj.pojo.Users;
import com.p2p.qiyun.hjh.dao.AuditingMapper;
import com.p2p.qiyun.hjh.dao.BalanceMapper;
import com.p2p.qiyun.hjh.dao.CustomerMapper;
import com.p2p.qiyun.hjh.entity.DateAge;
import com.p2p.qiyun.hjh.dao.LoanMapper;

import com.p2p.qiyun.hjh.entity.Auditing;
import com.p2p.qiyun.hjh.entity.Balance;
import com.p2p.qiyun.hjh.entity.Customer;
import com.p2p.qiyun.hjh.entity.Loan;
import com.p2p.qiyun.hjh.entity.Query;

@Service
public class LoanServiceimpol extends Thread implements LoanService {
	@Autowired
	private LoanMapper lomapper;
	@Autowired
	private CustomerMapper comter;
	@Autowired

	private AuditingMapper aud;
	@Autowired

	private BalanceMapper ba;

	private Users u = null;

	@Override
	public List<Loan> selStatus(HttpSession session, Integer page) {
		// TODO Auto-generated method stub
		u = (Users) session.getAttribute("user");
		List<Loan> selStatus = null;
		if (u.getDid() == 1) {
			selStatus = lomapper.selStatus1(page);

		} else if (u.getDid() == 2) {
			selStatus = lomapper.selStatus(page);
		}

		return selStatus;
	}

	@Transactional
	@Override
	public int selectByPrimaryKeys(Integer id, HttpSession session) {

		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = sdf.format(date);
			try {
				sleep(1500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			Customer c = comter.selectByPrimaryKeys(id);
			int parseInt = Integer.parseInt(c.getCreditrate());
			Loan selloan = lomapper.selloan(id);
			selloan.setApprover(u.getUid());
			String idnumber = selloan.getUserinfo().getIdnumber();

			int age = DateAge.getAge(idnumber);

			if (age >= 18) {

				if (selloan.getApprovalstatus().equals("0")) {
					if (parseInt < 500) {
						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 0);
						aud.insertSelective(a);

						return 0;

					} else {

						if (selloan.getLoanamount() > 10000) {

							selloan.setApprovalstatus(String.valueOf(1));
							if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {
								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 1);
								aud.insertSelective(a);
								return 1;
							} else {

								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 0);
								aud.insertSelective(a);
								return 0;
							}

						} else {

							selloan.setApprovalstatus(String.valueOf(2));
							if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {

								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
								aud.insertSelective(a);
								Balance b = ba.selectBalanceBy(id);
								b.setBalance(b.getBalance()+selloan.getLoanamount());

								if (ba.updateBalace(b) > 0) {
									
									return 2;

								} else {

									return 0;
								}

							} else {

								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 0);
								aud.insertSelective(a);
								return 0;
							}
						}

					}
				} else {

					selloan.setApprovalstatus(String.valueOf(2));
					if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {

						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
						aud.insertSelective(a);
						Balance b = ba.selectBalanceBy(id);
						b.setBalance(b.getBalance()+selloan.getLoanamount());

						if (ba.updateBalace(b) > 0) {
						
							return 2;

						} else {

							return 0;
						}
					} else {

						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 0);
						aud.insertSelective(a);
						return 0;
					}

				}
			} else {
				Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 0);
				aud.insertSelective(a);
				return 3;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return 0;
		}

	}

	@Override
	public List<Auditing> selauditing(Query q) {
		// TODO Auto-generated method stub

		List<Auditing> selectByExample = aud.selauditing(q);
		return selectByExample;
	}

	@Override
	public int suditingcount(Query q) {
		// TODO Auto-generated method stub

		return aud.adcount(q);
	}

	@Override
	public int count(HttpSession session) {
		// TODO Auto-generated method stub
		Users us = (Users) session.getAttribute("user");

		if (us.getDid() == 1) {

			return lomapper.loancount1();

		} else {
			return lomapper.loancount();
		}
	}

}
