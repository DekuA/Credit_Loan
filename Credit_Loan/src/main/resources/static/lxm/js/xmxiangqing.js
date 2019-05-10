var user;
$(function(){
	$.ajax({
		url:"gotoindex",
		success:function(data){
			if(data==""){
				window.location.href="login.html";
			}else{
				user=data;
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+data.nickname+"</font></a></li>"+
				"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
				if(data.idnumber==null){
					$("#touzianniu").attr({"disabled":"disabled"});
					$(".right-head").append("<p class='right-shiming'>请先实名验证再进行投资       点击 <a href='xsr_html/xsr_zhanghu.html'>>>实名验证</a></p>");
				}
			}
		}
	});
});
var num1=0;

function lijitouzi(){
	$.ajax({
		url:"lxm/selsfbk?userid="+user.userid,
		success:function(data){
			alert(data);
			if(data>0){
				alert("投资成功！");
			}else{
				alert("您还未绑定银行卡,请绑定银行卡后再进行投资");
				window.location.href="xsr_html/xsr_zhanghu.html";
			}
		}
	})
}

function chakanyue(){
	num1++;
	if(num1%2!=0){
		$("#zhye").html("8880.00");
		$("#zhye").css("color","orange");
	}else{
		$("#zhye").html("*****");
		$("#zhye").css("color","#000000");
	}
}

function jiajine(){
	var jine=$("#touzijine").val();
	jine=eval(jine*1+100).toFixed(2);
	$("#touzijine").val(jine);
}

function jianjine(){
	var jine=$("#touzijine").val();
	if(jine<100){
		jine=100.00;
	}
	jine=eval(jine*1-100).toFixed(2);
	$("#touzijine").val(jine);
}
