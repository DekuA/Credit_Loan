package com.p2p.qiyun.hjh.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import com.p2p.qiyun.lsx.dao.Loan2Mapper;
import com.p2p.qiyun.lsx.entity.Paymenthistory2;
import com.p2p.qiyun.lsx.entity.Repayment2;
import com.p2p.qiyun.lxm.dao.ProjectMapper;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.xsr.domain.xiaoxi;
import com.p2p.qiyun.xsr.service.CreditService_xsr;

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

	@Autowired
	private Loan2Mapper loan2s;
	
	@Autowired
	private CreditService_xsr im;
	
	@Autowired
	private ProjectMapper promap;
	
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
						selloan.setApprovalstatus(String.valueOf(2));
						lomapper.updateByPrimaryKeySelective(selloan);
						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
						aud.insertSelective(a);

						return 2;

					} else {

						if (selloan.getLoanamount() > 10000) {

							selloan.setApprovalstatus(String.valueOf(3));
							if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {
								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 3);
								aud.insertSelective(a);
								return 3;
							} else {
								selloan.setApprovalstatus(String.valueOf(2));
								lomapper.updateByPrimaryKeySelective(selloan);
								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
								aud.insertSelective(a);
								return 2;
							}

						} else {

							selloan.setApprovalstatus(String.valueOf(1));
							if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {

								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 1);
								aud.insertSelective(a);
								Balance b = ba.selectBalanceBy(id);

								b.setBalance(b.getBalance() + selloan.getLoanamount());

								if (ba.updateBalace(b) > 0) {
									xiaoxi xo=new xiaoxi(0, id, selloan.getLoanamount()+"借款通过，已放款至您账户余额", null);	
									im.charuxiaoxi(xo);
									Loan loan2 = lomapper.selloan(id); //id 是用户id 
									int Loanid=loan2.getLoanid();
									//借款编号 
									
									double mm=(loan2.getLoanamount()+loan2.getLoanrate());//借款金额加利息总金额
									Double loanrate =loan2.getLoanrate(); //总利息 
									int qix = loan2.getRepaymentperiod(); //期限
									
									Project pro = new Project();
									pro.setLenderid(loan2.getLoanid());
									pro.setPperson(u.getUid());
									pro.setPassessor(u.getUid());
									int k = promap.insertBysp(pro);
									  System.out.println(k);
									  
									Date da = new Date();   
									SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
							        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");  
							        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss"); 
							        pro.setPclosing(sdf3.format(da));
							        if(loan2.getRepaymentperiod()==3) {
							        	pro.setPlcure(6.60);
							        }else if(loan2.getRepaymentperiod()==6) {
							        	pro.setPlcure(7.84);
							        }else {
							        	pro.setPlcure(8.40);
							        }
							        pro.setPnumber("88"+sdf2.format(da));
							        pro.setPestimate(5);
							        pro.setPstarttime(sdf1.format(da));
							        
									int insertBysp = promap.insertBysp(pro);
									  System.out.println("成功"+insertBysp);
									  Repayment2 repayment2=new Repayment2(Loanid, id, loanrate, mm, qix); 
									  int addRepayment2 = loan2s.AddRepayment2(repayment2); 
									  if(addRepayment2>0) { 
										  Calendar cal=Calendar.getInstance();    
										  int y=cal.get(Calendar.YEAR);    
										 int  m=cal.get(Calendar.MONTH);    
										 int d=cal.get(Calendar.DATE);    
										 int ssm=m+2;
										 int month=12;
										 String ss="";
										 Repayment2 rs = loan2s.selctRepayment(id);
										  for(int i = 0; i < loan2.getRepaymentperiod(); i++) {
												  if(12>=(ssm+i)) {
													  ss = y+"-"+(ssm+i)+"-"+d;
												  }else {
													  ss = (y+1)+"-"+((ssm+i)-month)+"-"+d;
												  }
									      //y+"-"+((ssm+1)+i)+"-"+d;
									     Paymenthistory2 paym=new Paymenthistory2(rs.getRepaymentid(), id, Loanid, mm/qix, ss);
									     int j = loan2s.AddPaymenthistory2(paym);
									    // System.out.println(j+"还款记录表成功！！");
										  
									   }
									  
									  }
									return 1;

								} else {

									return 2;
								}

							} else {
								selloan.setApprovalstatus(String.valueOf(2));
								lomapper.updateByPrimaryKeySelective(selloan);
								Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
								aud.insertSelective(a);
								return 2;
							}
						}

					}
				} else {

					selloan.setApprovalstatus(String.valueOf(1));
					if (lomapper.updateByPrimaryKeySelective(selloan) > 0) {
						
						
						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 1);
						aud.insertSelective(a);
						Balance b = ba.selectBalanceBy(id);

						b.setBalance(b.getBalance() + selloan.getLoanamount());

						if (ba.updateBalace(b) > 0) {
							xiaoxi xo=new xiaoxi(0, id, selloan.getLoanamount()+"借款通过，已放款至您账户余额", null);	
							im.charuxiaoxi(xo);
							Loan loan2 = lomapper.selloan(id); //id 是用户id 
							int Loanid=loan2.getLoanid();
							//借款编号 
							
							double mm=(loan2.getLoanamount()+loan2.getLoanrate());//借款金额加利息总金额
							Double loanrate =loan2.getLoanrate(); //总利息 
							int qix = loan2.getRepaymentperiod(); //期限
							  
							  Repayment2 repayment2=new Repayment2(Loanid, id, loanrate, mm, qix); 
							  int addRepayment2 = loan2s.AddRepayment2(repayment2); 
							  
							  Project pro = new Project();
								pro.setLenderid(loan2.getLoanid());
								pro.setPperson(u.getUid());
								pro.setPassessor(u.getUid());
								int k = promap.insertBysp(pro);
							  System.out.println(k);
								Date da = new Date();   
								SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
						        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");  
						        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss"); 
						        pro.setPclosing(sdf3.format(da));
						        if(loan2.getRepaymentperiod()==3) {
						        	pro.setPlcure(6.60);
						        }else if(loan2.getRepaymentperiod()==6) {
						        	pro.setPlcure(7.84);
						        }else {
						        	pro.setPlcure(8.40);
						        }
						        pro.setPnumber("88"+sdf2.format(da));
						        pro.setPestimate(5);
						        pro.setPstarttime(sdf1.format(da));
						        
								int insertBysp = promap.insertBysp(pro);
								
							  System.out.println("成功"+insertBysp);
							  if(addRepayment2>0) { 
								  Calendar cal=Calendar.getInstance();    
								  int y=cal.get(Calendar.YEAR);    
								 int  m=cal.get(Calendar.MONTH);    
								 int d=cal.get(Calendar.DATE);    
								 int ssm=m+2;
								 int month=12;
								 String ss="";
								 Repayment2 rs = loan2s.selctRepayment(id);
								  for(int i = 0; i < loan2.getRepaymentperiod(); i++) {
									  if(12>=(ssm+i)) {
										  ss = y+"-"+(ssm+i)+"-"+d;
									  }else {
										  ss = (y+1)+"-"+((ssm+i)-month)+"-"+d;
									  }
							      //ss=y+"-"+((ssm+1)+i)+"-"+d;
							     Paymenthistory2 paym=new Paymenthistory2(rs.getRepaymentid(), id, Loanid, mm/qix, ss);
							     int j = loan2s.AddPaymenthistory2(paym);
							     System.out.println(j+"还款记录表成功！！");
								  
							   }
							  
							  }
							
							return 1;

						} else {

							return 2;
						}
					} else {
						selloan.setApprovalstatus(String.valueOf(2));
						lomapper.updateByPrimaryKeySelective(selloan);
						Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
						aud.insertSelective(a);
						return 2;
					}

				}
			} else {
				selloan.setApprovalstatus(String.valueOf(2));
				lomapper.updateByPrimaryKeySelective(selloan);
				Auditing a = new Auditing(id, format, selloan.getLoanamount().toString(), 2);
				aud.insertSelective(a);
				return 4;
			}
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println(e);
			return 2;
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
