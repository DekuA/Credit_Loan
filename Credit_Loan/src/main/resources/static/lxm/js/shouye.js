$(function(){
	$.ajax({
		url:"lxm/selProject",
		dataType:"json",
		success:function(data){
			var project=data.projectlist;
			var loan=data.loanlist;
			var myDate=new Date();
			for(i=0;i<project.length;i++){
				var arr=project[i].pclosing.split("-");
				var smallmoney=loan[i].loanamount/100;
				var birthDate = new Date(arr[0]+"/"+arr[1]+"/"+arr[2]);
				if (myDate.getMonth() < birthDate.getMonth() || (myDate.getMonth() == birthDate.getMonth() && myDate.getDate() < birthDate.getDate())||project[i].pschedule<100) {
					$("#xmxstab").append("<tr><td colspan='5'><hr><h3 style='float:left;color: #666;font-size: 15px;font-weight: 400;'>"+
							project[i].pname+" 项目编号:"+project[i].pnumber+" <span class='tag-discount-orange'>信息服务费率"+project[i].pinfo+"00%</span>"+
								"</h3></td></tr>"+
									"<tr><td class='tttddd1' rowspan='1'>历史参考收益率</td>"+
										"<td class='tttddd1' rowspan='1'>投资期限</td>"+
										"<td class='tttddd1' rowspan='1'>收益方式</td>"+
										"<td class='tttddd1' rowspan='1'>投资金额</td>"+
										"<td rowspan='1'></td></tr>"+
									"<tr><td style='font-size:18px;color:red'><b>"+project[i].plcure.toFixed(2)+"%</b></td>"+
									"	<td>"+loan[i].repaymentperiod+"个月 <font style='font-size:12px;color:orange;'>"+project[i].ptransfer+"天可转</font></td>"+
										"<td>"+project[i].pncome+"</td>"+
										"<td style='font-size:18px;color:orange'>"+abs(smallmoney+"00")+"元 起</td>"+
										"<td><button class='btn btn-group' style='background-color: orange;' onclick='xmxiangqing("+project[i].pid+")'>投资</button></td>"+
									"</tr>");
			    }
			}
			$("#xmxstab tr td").css("border","none");
			$("#xmxstab").css("background-color","white");
		}
	})
})

var user;

$.ajax({
	url:"gotoindex",
	success:function(data){
		if(data==""){
			$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='login.html'><font size='1'>登录</font></a></li>");
		}else{
			user=data;
			$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+data.nickname+"</font></a></li>"+
			"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
		}
	}
});

function touzi(){
	$(".right-box-touzi").css("display","block");
	$(".right-box-shouye").css("display","none");
}
		
function shouye(){
	$(".right-box-touzi").css("display","none");
	$(".right-box-shouye").css("display","block");
}

function zqzhuanr(){
	window.location.href="zhaiquanzr.html";
}

function xmxiangqing(xmid){
	if(user==null){
		window.location.href="login.html";
	}else{
		window.location.href="xmxiangqing.lxm?xmid="+xmid;
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
