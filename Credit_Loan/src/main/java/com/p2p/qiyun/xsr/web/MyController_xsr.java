package com.p2p.qiyun.xsr.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import javax.servlet.http.HttpSession;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.p2p.qiyun.dby.pojo.balance;
import com.p2p.qiyun.dby.service.accountService;
import com.p2p.qiyun.lsx.entity.Loan;
import com.p2p.qiyun.xsr.domain.customer;
import com.p2p.qiyun.xsr.domain.kefuinfo;
import com.p2p.qiyun.xsr.domain.paymenthistory;
import com.p2p.qiyun.xsr.domain.touxiang;
import com.p2p.qiyun.xsr.domain.userinfo;
import com.p2p.qiyun.xsr.domain.usersfz;
import com.p2p.qiyun.xsr.domain.xiaoxi;
import com.p2p.qiyun.xsr.service.CreditService_xsr;


@Controller
@RestController
public class MyController_xsr {
	@Autowired
	private CreditService_xsr im;
	
	private Map kxxxmap = new HashMap();
	private List<kefuinfo> kefuxx=null;
	private List<String> usidarr= new ArrayList<String>();//存发起聊天用户的id 
	private List<kefuinfo> kefuxxda = new ArrayList<kefuinfo>();//当前使用聊天用户发送的信息
	private List<kefuinfo> kefuhuifuarr = new ArrayList<kefuinfo>();//当前使用聊天客服回复的信息
	private List<kefuinfo> kefuxx2 = new ArrayList<kefuinfo>();//所有信息
	@RequestMapping("nicheng_xsr")
	public String nicheng_xsr(HttpSession session) { 
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		return us.getNickname();
	}
	
	@RequestMapping("zhanghu_xsr")
	public Map kehuxx(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		List<customer> kehuxinxi = im.kehuxinxi(us.getUserid());
		for (int i = 1; i < kehuxinxi.size(); i++) {
			im.delecus(kehuxinxi.get(i).getCustomerid());			
		}	
		session.setAttribute("Customerid_xsr", kehuxinxi.get(0).getCustomerid());
		String scdenglu = im.scdenglu(us.getPhone());
		String setousrc = im.setousrc(us.getUserid());
		Map map = new HashMap();
		map.put("userinfo_xsr",us);
		map.put("customer_xsr",kehuxinxi.get(0));
		map.put("logintime_xsr",scdenglu);
		map.put("tou_src",setousrc);
		map.put("nicheng_xsr",session.getAttribute("username"));
		return map;
	}
	
	@RequestMapping("shimingname_xsr")
	public String shimingname(userinfo info,HttpSession session) {
		info.setPhone((String) session.getAttribute("user"));
		int shimingrz = im.shimingrz(info);		
		return shimingrz+"";
	}
	

	@RequestMapping("bangyou_xsr")
	public String bangyou_xsr(customer cus,HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		cus.setCustomerid(attribute);
		int bangyou = im.bangyou(cus);
		return bangyou+"";
	}
	
	@RequestMapping("xiumima_xsr")
	public String xiumima_xsr(String password1,String password2,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		ByteSource bytes = ByteSource.Util.bytes(attribute);
		SimpleHash hash = new SimpleHash("MD5",password1,bytes,1234);
		userinfo phonechaxinxi = im.phonechaxinxi(attribute);		
		if(hash.toString().equals(phonechaxinxi.getPassword())) {
			SimpleHash hash2 = new SimpleHash("MD5",password2,bytes,1234);
			userinfo info = new userinfo(0, null, null, null, attribute, hash2.toString());
			int xiumi = im.xiumi(info);
			return 1+"";
		}else {
			return 0+"";	
		}		
	}
	
	
	@RequestMapping("chayin_xsr")
	public customer chayin_xsr(HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		customer keh = im.kehuxinxi22(attribute);
		return keh;
	}
	
	@RequestMapping("bangyin_xsr")
	public String bangyin_xsr(customer cus,HttpSession session) {
		int attribute = (int) session.getAttribute("Customerid_xsr");
		cus.setCustomerid(attribute);
		int bangyin = im.bangyin(cus);
		return bangyin+"";
	}
	
	@RequestMapping("panduan_xsr")
	public String panduan_xsr(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us = im.phonechaxinxi(attribute);
		if(us.getIdnumber()!=null) {
			return "1";
		}else {
			return "0";
		}	
	}
	
	@RequestMapping("shuaping_xsr")
	public String shuaping_xsr(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		int cid = (int) session.getAttribute("Customerid_xsr");
		customer kehu = im.kehuxinxi22(cid);		
		String num="400";
		if(us.getIdnumber()!=null && kehu.getBankid()==null) {
			num="500";
		}
		if(us.getIdnumber()!=null && kehu.getBankid()!=null) {
			num="580";
		}
		kehu.setCreditrate(num);
		int xiuxinyongfen = im.xiuxinyongfen(kehu);
		return num+"分";
	}
	@RequestMapping("panlogin_xsr")
	public String panlogin_xsr(HttpSession session) {
		if(session.getAttribute("user")!=null) {
			return "1";
		}
		return "0";
			
	}
	
	@RequestMapping("xiaoxi_xsr")
	public List<xiaoxi> xiaoxi_xsr(HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		List<xiaoxi> xioxichaxun = im.xioxichaxun(us.getUserid());
		return xioxichaxun;
			
	}
	
	@RequestMapping("chajie_xsr")
	public Map chajie_xsr(int yeshu,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		PageHelper.startPage(yeshu, 5);
		List<Loan> chajiekuan = im.chajiekuan(us.getUserid());
		PageInfo<Loan> info = new PageInfo<>(chajiekuan);
		int zonghang = (int) info.getTotal();
		int num = 0;
		if(zonghang%5==0){
			num=zonghang/5;
		}else{
			num=zonghang/5+1;
		}
		Map map = new HashMap();
		map.put("rows",chajiekuan);//存集合
		map.put("total",num);//存总数据的行数
		map.put("userphone",us.getNickname());//存总数据的行数
		return map;
			
	}
	
	@RequestMapping("chahuanku_xsr")
	public Map chahuanku_xsr(int yeshu,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		PageHelper.startPage(yeshu, 5);
		List<paymenthistory> chahuankuan = im.chahuankuan(us.getUserid());
		PageInfo<paymenthistory> info = new PageInfo<>(chahuankuan);
		int zonghang = (int) info.getTotal();
		int num = 0;
		if(zonghang%5==0){
			num=zonghang/5;
		}else{
			num=zonghang/5+1;
		}
		Map map = new HashMap();
		map.put("rows",chahuankuan);//存集合
		map.put("total",num);//存总数据的行数
		map.put("userphone",us.getNickname());
		return map;			
	}
	//-获取消息------------------------------------------------	
	@RequestMapping("chatext_xsr")
	public String chatext_xsr(kefuinfo kf,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		kf.setUserid(us.getUserid());
		List<kefuinfo> arr= new ArrayList<kefuinfo>();
		arr.add(kf);//所有信息
		for (int usid=0; usid<usidarr.size();usid++) {			
			if((us.getUserid()+"").equals(usidarr.get(usid))) {
					usidarr.remove(usid);			
			}
		}	
		usidarr.add(kf.getUserid()+"");
		
		
		kxxxmap.put("userid"+us.getUserid(), arr);	
		return 1+"";
			
	}
	//用户发送
	@RequestMapping("chaxuntext_xsr")
	public List<kefuinfo> chaxuntext_xsr(int number,HttpSession session) {
		String attribute = (String) session.getAttribute("user");
		userinfo us= im.phonechaxinxi(attribute);
		List<kefuinfo> gebie = new ArrayList<kefuinfo>();//当前用户的信息
		if (kxxxmap.get("userid"+us.getUserid())==null) {
			return null;
		}				
			List<kefuinfo> f=(List<kefuinfo>) kxxxmap.get("userid"+us.getUserid());
			if(number==1) {
				kefuxxda.add(f.get(0));	//当前所有信息
			}			
			for (int i = 0; i < kefuxxda.size(); i++) {
				if(us.getUserid()==kefuxxda.get(i).getUserid()) {
					kefuinfo kefuinfo = kefuxxda.get(i);
					gebie.add(kefuinfo);
				}
			}
			return gebie;
							
	}
	//客服回复
	@RequestMapping("huifuuser_xsr")
	public Map huifuuser_xsr(int qingqiuuserid) {
		System.out.println(usidarr);
		List<String> usidarr222 = usidarr;
		for (int i = 0; i < kefuxx2.size(); i++) {
			if(kefuxx2.get(i).getUserid()==qingqiuuserid) {
				kefuxx2.get(i).setUid(6);
				kefuhuifuarr.add(kefuxx2.get(i));				
			}	
		}
		Map map = new HashMap();
		map.put("quanbuqingqiu_xsr",usidarr222);//查询所有的聊天请求
		map.put("dangeuserinfo_xsr",kefuhuifuarr);//客服回复个别的信息
		return map;		
	}
//-0	---------------------------
	
	@RequestMapping("upload_Xsr")
	public  int upload(MultipartFile file,HttpSession session)  {
		int userid = (int) session.getAttribute("useridss");
        if (file==null) {
            return 0;
        }
        String filePath = "E:\\touxiang\\kehutou"; 
        File f=new File(filePath);       
        if(f.exists()==false) {
        	f.mkdirs();
        }
        String fileName = file.getOriginalFilename();          
        String xinmingzi = UUID.randomUUID()+fileName;
        File dest = new File(filePath , xinmingzi); 
        try {
            file.transferTo(dest);
            touxiang tou = new touxiang(0,(int) session.getAttribute("useridss"), xinmingzi);
            int updasrc = im.updasrc(tou);
            return updasrc;
        } catch (IOException e) {
           System.out.println(e);
        }
        return 0;
    }
	
	@RequestMapping("xiunicheg_xsr")
	public int xiunicheg_xsr(userinfo us,HttpSession session) {
		int attribute = (int) session.getAttribute("useridss");		
		us.setUserid(attribute);
		int xiunicheng = im.xiunicheng(us);
		return xiunicheng;
	}
	
	@RequestMapping("shenfenzp_xsr")
	public  int shenfenzp_xsr(MultipartFile filez,MultipartFile filef,HttpSession session)  {
		int userid = (int) session.getAttribute("useridss");
        if (filez==null) {
            return 0;
        }
        if (filef==null) {
            return 0;
        }
        String fileName1 = filez.getOriginalFilename();
        String fileName2 = filef.getOriginalFilename();
        String filePath = "E:\\touxiang\\kehutou";    
        File f=new File(filePath); 
        if(f.exists()==false) {
        	f.mkdirs();
        }
        String xinmingzi = UUID.randomUUID()+fileName1;
        String xinmingzi2 = UUID.randomUUID()+fileName2;
        File dest = new File(filePath , xinmingzi); 
        File dest2 = new File(filePath , xinmingzi2); 
        try {
            filez.transferTo(dest);
            filef.transferTo(dest2);
            usersfz sfzzpUsersfz = new usersfz(0, userid, xinmingzi, xinmingzi2);
            int addsfzzp = im.addsfzzp(sfzzpUsersfz);
            return addsfzzp;
        } catch (IOException e) {
           System.out.println(e);
        }
        return 0;
    }
	
}
