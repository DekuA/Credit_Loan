var user;
var money;
var zuidatouzi;
var project;
var loan;
var umoney;
$(function(){
	$.ajax({
		url:"lxm/xmxiangqingxs",
		success:function(data){
			if(data==""){
				window.location.href="login.html";
			}else{
				project = data.project;
				loan = data.loan2;
				user = data.userinfo;
				umoney = data.usermoney;
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+user.nickname+"</font></a></li>"+
				"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
				if(user.idnumber==null){
					$("#touzianniu").css("disabled","disabled");
					$(".right-head").append("<p class='right-shiming'>请先实名验证再进行投资       点击 <a href='xsr_html/xsr_zhanghu.html'>>>实名验证</a></p>");
				}
				if(user.userid==loan.userid){
					$("#touzianniu").css("disabled","disabled");
					$(".right-head").append("<p class='right-shiming'>无法给自己投资</p>");
				}
				money=loan.loanamount/100;
				zuidatouzi=loan.loanamount-(loan.loanamount*1)*(project.pschedule/100);
				$(".xmxq-detail-head-xmbh").html(project.pnumber);
				$(".xmxq-detail-head-fbsj").html(project.pstarttime);
				$(".xmxq-cksyl").html(project.plcure.toFixed(2)+"%");
				$(".xmxq-qixian").html(loan.repaymentperiod+"个月");
				$("#right-dizengjine").html(money.toFixed(2));
				$("#touzijine").val(money.toFixed(2));
				$("#idxmxq-qixian").html(loan.repaymentperiod+"期");
				$(".xmxq-syfs").html(project.pncome);
				$(".other-info1").append("项目进度:<font style='margin-left: 200px;'"+
						">"+project.pschedule+"%&nbsp;&nbsp;&nbsp;&nbsp;剩余可投资金额："+abs(zuidatouzi*100)+"</font><div class='progress' "+
						"style='text-align:center;height:12px;width:150px;margin-left: 80px;margin-top: -38px;'><div class='progress-bar bg-success'" +
						"style='width:"+project.pschedule+"%'></div></div><span>安全等级参考:</span> &nbsp;");
				for(i=0;i<project.pestimate;i++){
					$(".other-info1").append("<i class='fa fa-star'></i>&nbsp;");
				}
				if(project.pestimate==1||project.pestimate==2){
					$(".other-info1").append("&nbsp;&nbsp;&nbsp;&nbsp;<span>高风险（内部评级，仅供参考）</span>");
				}else if(project.pestimate==4||project.pestimate==3){
					$(".other-info1").append("&nbsp;&nbsp;&nbsp;&nbsp;<span>中风险（内部评级，仅供参考）</span>");
				}else{
					$(".other-info1").append("&nbsp;&nbsp;&nbsp;&nbsp;<span>低风险（内部评级，仅供参考）</span>");
				}
				$(".other-info1").append("<p>投资人条件： 1. 身份：非护照注册会员； 2. 风险承受能力“保守型” 及以上</p>");
				$(".xmxq-xmbj").html(abs(loan.loanamount+"00")+"元");
				$(".xmxq-ysbj").html(abs(loan.loanamount+"00")+"元");
				$(".xmxq-xxfwl").html(project.pinfo.toFixed(4)+"%/月");
				$(".xmxq-zr").html("持有"+project.ptransfer+"天后可转让，最近7天转让成功率99%");
				$(".xmxq-zxtz").html(abs(loan.loanamount+"00"));
				counters(loan.repaymentperiod,loan.loanamount,project.plcure,project.pinfo.toFixed(4));
			}
		}
	});
});
var num1=0;

var xsje=0;

function jiekuanrenxinxi(){
	$.ajax({
		url:"lxm/seluserById?userid="+loan.userid,
		success:function(data){
			if(data.username.length<4){
				$("#jkrxm").html(data.username.substring(0,1));
				for(i=1;i<data.username.length;i++){
					$("#jkrxm").append("*");
				}
			}else{
				$("#jkrxm").html(data.username.substring(0,2));
				for(i=2;i<data.username.length;i++){
					$("#jkrxm").append("*");
				}
			}
			
			$("#jkrsfzh").html(plusXing(data.idnumber,4,2));
			$("#jkrphone").html(plusXing(data.phone,3,4));
			
			var sex=data.idnumber.substring(16,17)*1;
			var csnf=data.idnumber.substring(6,10)*1;
			var csyf=data.idnumber.substring(10,12)*1;
			var csrq=data.idnumber.substring(12,14)*1;
			if(sex%2==0){
				$("#jkrxb").html("女");
			}else{
				$("#jkrxb").html("男");
			}
			var myDate = new Date();
			var year=myDate.getYear();
			var riqi=csnf+"/"+csyf+"/"+csrq;
			var birthDate = new Date(riqi);
			var age = myDate.getFullYear() - birthDate.getFullYear();
			if (myDate.getMonth() < birthDate.getMonth() || (myDate.getMonth() == birthDate.getMonth() && myDate.getDate() < birthDate.getDate())) {
		        age--;
		    }
			$("#jkrnl").html(age+"岁");
		}
	})
	
	$.ajax({
		url:"lxm/selCountLoan?userid="+loan.userid,
		success:function(data){
			$("#jkbs").html(data.countloan);
			$("#yqcs").html(data.countloanpay);
			$("#yqzje").html(abs(data.sumpaymoney*100));
			$("#jkrfz").html(abs(data.sumloanmoney*100));
		}
	})
}

function counters(repaymentperiod,loanamount,plcure,pinfo){
	$("#fengqitab").html("");
	var myDate = new Date();
	myDate.setDate(myDate.getDate()+1);
	var qxr=myDate.toLocaleDateString();
	var dkqs=repaymentperiod;
	var dkbj=loanamount;
	var cksyl=plcure;
	var nian = qxr.substring(0,4);
	var yue  = parseInt(qxr.substring(5,8));
	var ri  = parseInt(qxr.substring(7,11));	
	//年收益率/百分比/总年数=月收益
	var qs = ((cksyl/100)/12)+1; //月利率+1
	var  bj = Math.pow(qs,dkqs);//（1+月利率）
	var bj2 = bj*((cksyl/100)/12);
	//应收本息
	var ysbx = (dkbj*bj2)/(Math.pow(qs,dkqs)-1);		
	var ResidualPrincipal = dkbj;
	var ccc=0;
	for(var i=1;i<=dkqs;i++){
		yue++;
		if(yue>12) {
			yue=01;
 			nian = parseInt(nian)+1;
		}
		var lixi = ResidualPrincipal*(cksyl/100)/12;
		ResidualPrincipal = ResidualPrincipal-ysbx+lixi;
		if(i==dkqs){
			ResidualPrincipal = 0.00;
		}
		var bqysbj=(ysbx-lixi).toFixed(2)*1;
		var bqsybj=ResidualPrincipal.toFixed(2)*1;
		var riqi=nian+"-"+yue+"-"+ri;
		if(yue<10){
			riqi=nian+"-0"+yue+"-"+ri;
		}
		var tr="<tr id='qs' ><td class='cash-head'>"+i+"</td>"
		+"<td class='repaymentDate'>"+riqi+"</td>"
		+"<td class='cash1'>"+(ysbx-lixi).toFixed(2)+"</td>"
		+"<td class='cash2'>"+lixi.toFixed(2)+"</td>"
		+"<td class='cash3'>"+ResidualPrincipal.toFixed(2)+"</td>"
		+"<td class='cash-last'>"+((bqysbj+bqsybj).toFixed(2)*(pinfo/100)).toFixed(2)+"</td>"
		+"</tr>";
		$("#fengqitab").append(tr);
		num1=(((bqysbj+bqsybj).toFixed(2)*(pinfo/100)).toFixed(2))*100;
		ccc+=num1;
	}
	$("#trs").remove();
	var aaa=((ysbx*dkqs).toFixed(2))*100;
	var bbb=(((ysbx*dkqs)-dkbj).toFixed(2))*100;
	
	$(".idxmxq-ysbx").html(abs(aaa));
	$("#xmxq-ysbj").html(abs(bbb));
	$("#xmxq-fwxxf").html(abs(ccc)+"元");
}

function lijitouzi(){
	var touzijine=$("#touzijine").val();
	if(touzijine>umoney){
		alert("账户余额不足，请充值后再试.");
	}else{
		$.ajax({
			url:"lxm/selsfbk?userid="+user.userid,
			success:function(data){
				if(data>0){
					
				}else{
					alert("您还未绑定银行卡,请绑定银行卡后再进行投资!");
					window.location.href="xsr_html/xsr_zhanghu.html";
				}
			}
		})
	}
}

function zhifu(touzijine,xmid,uid){
	
} 

function touzijilu(){
	$.ajax({
		url:"lxm/selInvestnotes?pid="+project.pid,
		success:function(data){
			var inves=data.inves;
			var uname=data.uname;
			$("#menu3-tab2").empty();
			$("#menu3-tab2").append("<tr><th></th><th></th><th></th></tr>");
			if(inves.length<1){
				$("#menu3-tab2").append("<tr><th></th><th>暂无用户进行投资</th><th></th></tr>");
			}
			for(i=0;i<inves.length;i++){
				if(uname[i].length<3){
					$("#menu3-tab2").append("<tr><td>"+plusXing(uname[i],0,1)+"</td><td>"+abs(inves[i].imoney*100)+"</td><td>"+inves[i].idate+"</td></tr>");
				}else if(uname[i].length>3&&uname[i].length<6){
					$("#menu3-tab2").append("<tr><td>"+plusXing(uname[i],1,1)+"</td><td>"+abs(inves[i].imoney*100)+"</td><td>"+inves[i].idate+"</td></tr>");
				}else if(uname[i].length>5&&uname[i].length<10){
					$("#menu3-tab2").append("<tr><td>"+plusXing(uname[i],2,2)+"</td><td>"+abs(inves[i].imoney*100)+"</td><td>"+inves[i].idate+"</td></tr>");
				}else{
					$("#menu3-tab2").append("<tr><td>"+plusXing(uname[i],4,3)+"</td><td>"+abs(inves[i].imoney*100)+"</td><td>"+inves[i].idate+"</td></tr>");
				}
				
			}
		}
	})
}

function chakanyue(){
	xsje++;
	if(xsje%2!=0){
		$.ajax({
			url:"lxm/seluserbalance?userid="+user.userid,
			success:function(data){
				umoney=data*1;
				$("#zhye").html(abs(umoney.toFixed(2)*100));
				$("#zhye").css("color","orange");
			}
		})
	}else{
		$("#zhye").html("*****");
		$("#zhye").css("color","#000000");
	}
}

function jiajine(){
	var jine=$("#touzijine").val();
	jine=eval(jine*1+money).toFixed(2);
	if(jine>zuidatouzi){
		jine=(jine-money).toFixed(2);
	}
	$("#touzijine").val(jine);
}

function jianjine(){
	var jine=$("#touzijine").val();
	if(jine<money){
		jine=money;
	}
	jine=eval(jine*1-money).toFixed(2);
	$("#touzijine").val(jine);
}

function jinebianhua(e){
	if($(e).val()>zuidatouzi){
		$(e).val(zuidatouzi.toFixed(2));
	}
}


abs = function(val){
	//金额转换 分->元 保留2位小数 并每隔3位用逗号分开 1,234.56
	var str = (val/100).toFixed(2) + '';
	var intSum = str.substring(0,str.indexOf(".")).replace( /\B(?=(?:\d{3})+$)/g, ',' );//取到整数部分
	var dot = str.substring(str.length,str.indexOf("."))//取到小数部分搜索
	var ret = intSum + dot;
	return ret;
	}

function plusXing (str,frontLen,endLen) { 
	var len = str.length-frontLen-endLen;
	var xing = '';
	for (var i=0;i<len;i++) {
		xing+='*';
	}
	return str.substring(0,frontLen)+xing+str.substring(str.length-endLen);
}