var user;
$(function(){
	$("tr td").css("cursor","pointer");
	
	$.ajax({
		url:"gotoindex",
		success:function(data){
			if(data==""){
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='login.html'><font size='1'>登录</font></a></li>");
			}else{
				user = data;
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+data.nickname+"</font></a></li>"+
				"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
			}
		}
	});
})

var mh1="";
var mh2="";
var my1="";
var my2="";
var sfyq="";

function seltiaojian1(e,trr,month2,month1){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	mh1=month1==null?"0":month1;
	mh2=month2==null?"0":month2;
	selzhaiqzr();
}

function seltiaojian11(e,trr,month2,month1){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
}

function seltiaojian2(e,trr,money2,money1){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	my1=money1==null?"0":money1;
	my2=money2==null?"0":money2;
	selzhaiqzr();
}

function seltiaojian22(e,trr,money2,money1){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
}

function seltiaojian3(e,trr,b){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	sfyq=b==null?"3":b;
	selzhaiqzr();
}

function yueshu(){
	var mmhh1=$("#month1").val();
	var mmhh2=$("#month2").val();
	if(!/^[1-9]\d*$/.test(mmhh1)){
		$("#month1").val("");
	}else if(!/^[1-9]\d*$/.test(mmhh2)){
		$("#month2").val("");
	}else{
		mh1=mmhh2;
		mh2=mmhh1;
		selzhaiqzr();
	}
	
}

function moneyshu(e,trr){
	var mmyy1=$("#money1").val();
	var mmyy2=$("#money2").val();
	if(!/^(([1-9][0-9]*)|(([0]\.\d{1,2}|[1-9][0-9]*\.\d{1,2})))$/.test(mmyy1)){
		$("#money1").val("");
	}else if(!/^(([1-9][0-9]*)|(([0]\.\d{1,2}|[1-9][0-9]*\.\d{1,2})))$/.test(mmyy2)){
		$("#money2").val("");
	}else{
		my2=mmyy1;
		my1=mmyy2;
		selzhaiqzr();
	}
}

selzhaiqzr();

function selzhaiqzr(){
	my1=my1==""?"0":my1;
	my2=my2==""?"0":my2;
	mh1=mh1==""?"0":mh1;
	mh2=mh2==""?"0":mh2;
	sfyq=sfyq==""?"3":sfyq;
	$.ajax({
		url:"lxm/selzhaiqzr?money1="+my1+"&money2="+my2+"&month1="+mh1+"&month2="+mh2+"&sfyq="+sfyq,
		success:function(data){
			var project=data.projectlist;
			var loan=data.loanlist;
			var inves=data.inves;
			var list=data.list;
			$("#zrxm").empty();
			var iii=0;
			for(i=0;i<project.length;i++){
				if(list[i]==sfyq){
					iii++;
					var ptransmoney=inves[i].ptransmoney;
					$("#zrxm").append("<tr><td colspan='5' width='100%'><hr><h3 style='float:left;color: #666;font-size: 15px;font-weight: 400;'>"+
							project[i].pname+" 项目编号:"+project[i].pnumber+
								"</h3><span class='tag-title' title='该项目为转让项目'><span class='tag-discount-blue'>转</span></span></td></tr>"+
									"<tr><td class='tttddd1' rowspan='1'>历史参考收益率</td>"+
										"<td class='tttddd1' rowspan='1'>剩余期限</td>"+
										"<td class='tttddd1' rowspan='1'>收益方式</td>"+
										"<td class='tttddd1' rowspan='1'>转让价格</td>"+
										"<td rowspan='1'></td></tr>"+
									"<tr><td style='font-size:18px;color:red'><b>"+project[i].plcure.toFixed(2)+"%</b></td>"+
									"	<td>"+loan[i].repaymentperiod+"期 <font style='font-size:12px;color:orange;'></font></td>"+
										"<td>"+project[i].pncome+"</td>"+
										"<td style='font-size:18px;color:orange'>"+abs(ptransmoney+"00")+"元</td>"+
										"<td><button class='btn btn-group' style='background-color: orange;' onclick='zqxiangqing("+inves[i].iid+")'>购买</button></td>"+
									"</tr>");
				}
			}
			if(iii<1){
				$("#zrxm").append("<h2 style='text-algin:center'> 暂无达成条件项目 </h2>")
			}
			$("#zrxm tr td").css("border","none");
			$("#zrxm").css("background-color","white");
		}
	})
}


function zqxiangqing(invesid){
	if(user==null){
		window.location.href="login.html";
	}else{
		window.location.href="selInvesById.lxm?invesid="+invesid;
	}
}

function shouye(){
	window.location.href="shouye.html";
}


abs = function(val){
	//金额转换 分->元 保留2位小数 并每隔3位用逗号分开 1,234.56
	var str = (val/100).toFixed(2) + '';
	var intSum = str.substring(0,str.indexOf(".")).replace( /\B(?=(?:\d{3})+$)/g, ',' );//取到整数部分
	var dot = str.substring(str.length,str.indexOf("."))//取到小数部分搜索
	var ret = intSum + dot;
	return ret;
	}