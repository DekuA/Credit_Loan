var user;
var money;
var project;
var loan;
var userbalance;
var inves;
$(function(){
	$.ajax({
		url:"lxm/zqxiangqingxs",
		success:function(data){
			if(data==""){
				window.location.href="login.html";
			}else{
				inves = data.inves;
				project = data.project;
				loan = data.loan2;
				user = data.userinfo;
				money=inves.ptransmoney;
				userbalance=data.balance;
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+user.nickname+"</font></a></li>"+
				"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
				if(user.userid==inves.userid){
					$("#touzianniu").attr("disabled");
					$(".right-head").append("<p class='right-shiming'>不能购买自己的债权</p>");
				}
				if(user.idnumber==null){
					$("#touzianniu").attr("disabled");
					$(".right-head").append("<p class='right-shiming'>请先实名验证再进行购买       点击 <a href='xsr_html/xsr_zhanghu.html'>>>实名验证</a></p>");
				}
				$(".xmxq-detail-head-xmbh").html(project.pnumber);
				$(".xmxq-detail-head-fbsj").html(project.pstarttime);
				$(".xmxq-cksyl").html(project.plcure.toFixed(2)+"%");
				$(".xmxq-qixian").html(loan.repaymentperiod+"个月");
				$("#touzijine").val(money.toFixed(2));
				$(".idxmxq-qixian").html(loan.repaymentperiod+"期");
				$(".xmxq-syfs").html(project.pncome);
				$(".other-info1").append("<br><span>安全等级参考:</span> &nbsp;");
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
				$(".xmxq-xmbj").html(abs(money+"00")+"元");
				$(".xmxq-ysbj").html(abs(money+"00")+"元");
				$(".xmxq-xxfwl").html(project.pinfo.toFixed(4)+"%/月");
				$(".xmxq-zr").html("&nbsp;持有"+project.ptransfer+"天后可转让，最近7天转让成功率99%");
				$(".xmxq-zxtz").html(abs(money+"00"));
				counters(loan.repaymentperiod,inves.ptransmoney,project.plcure,project.pinfo.toFixed(4));
			}
		}
	})
})



var num1=0;

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
	//var curDate = new Date();
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
	$("#xmxq-fwxxf").html(abs(ccc)+"&nbsp;元&nbsp;");
}


var xsje=0;
function chakanyue(){
	xsje++;
	if(xsje%2!=0){
		$.ajax({
			url:"lxm/seluserbalance?userid="+user.userid,
			success:function(data){
				userbalance=data*1;
				$("#zhye").html(abs(userbalance.toFixed(2)*100)+"&nbsp;&nbsp;&nbsp;<a href='xsr_html/xsr_yue.html'>充值</a>");
				$("#zhye").css("color","orange");
			}
		})
	}else{
		$("#zhye").html("*****");
		$("#zhye").css("color","#000000");
	}
}

function jiekuanrenxinxi(){
	$.ajax({
		url:"lxm/seluserById?userid="+loan.userid,
		success:function(data){
			if(data.username.length>3){
				$("#jkr-name").html(plusXing(data.username,2,0));
			}else{
				$("#jkr-name").html(plusXing(data.username,1,0));
			}
			$("#jkr-sfz").html(plusXing(data.idnumber,5,3));
			$("#jkr-phone").html(plusXing(data.phone,3,4));
			$("#jkr-age").html(IdCard(data.idnumber,3));
			$("#jkr-sex").html(IdCard(data.idnumber,2));
		}
	})
	
	$.ajax({
		url:"lxm/selCountLoan?userid="+loan.userid,
		success:function(data){
			$("#jkr-fuzhai").html(abs(data.sumloanmoney*100));
			$("#jkr-countloan").html(data.countloan);
			$("#jkr-countloanpay").html(data.countloanpay);
			$("#jkr-sumloanmoney").html(abs(data.sumpaymoney));
		}
	})
}

function zhifumoney(){
	var mpwd=$("#moneypwd").val();
	if(!/^\d{6}$/.test(mpwd)){
		$(".modal-body1").html("&nbsp;请输入正确的支付密码！&nbsp;");
		$("#sfbangka").modal();
	}else{
		$.ajax({
			url:"lxm/selZqBalancepwd?userid="+user.userid+"&pwd="+mpwd+"&userbalance="+money+"&invesid="+inves.iid,
			success:function(data){
				if(data==1){
					window.location.href="selInvesById.lxm?invesid="+inves.iid;
				}else if(data==2){
					$(".modal-body1").html("&nbsp;订单数据错误！&nbsp;");
					$("#sfbangka").modal();
				}else if(data==0){
					$(".modal-body1").html("&nbsp;支付密码错误！&nbsp;");
					$("#sfbangka").modal();
				}
			}
		})
	}
}

function lijitouzi(){
	if(userbalance*1>=$("#touzijine").val()*1){
		$.ajax({
			url:"lxm/selsfbk?userid="+user.userid,
			success:function(data){
				if(data>0){
					$("#zhifukuang").modal();
					//alert("投资成功！");
				}else{
					$(".modal-body1").html(" &nbsp;您还未绑定银行卡,请绑定银行卡后再进行投资  &nbsp;");
					$("#sfbangka").modal();
					window.location.href="xsr_html/xsr_zhanghu.html";
				}
			}
		})
	}else{
		$(".modal-body1").html("&nbsp;账户余额不足，请充值后再进行投资&nbsp;");
		$("#sfbangka").modal();
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


function IdCard(UUserCard, num) {
    if (num == 1) {
        //获取出生日期
        birth = UUserCard.substring(6, 10) + "-" + UUserCard.substring(10, 12) + "-" + UUserCard.substring(12, 14);
        return birth;
    }
    if (num == 2) {
        //获取性别
        if (parseInt(UUserCard.substr(16, 1)) % 2 == 1) {
            //男
            return "男";
        } else {
            //女
            return "女";
        }
    }
    if (num == 3) {
        //获取年龄
        var myDate = new Date();
        var month = myDate.getMonth() + 1;
        var day = myDate.getDate();
        var age = myDate.getFullYear() - UUserCard.substring(6, 10) - 1;
        if (UUserCard.substring(10, 12) < month || UUserCard.substring(10, 12) == month && UUserCard.substring(12, 14) <= day) {
            age++;
        }
        return age;
    }
}