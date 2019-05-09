$(function(){
	$.ajax({
		url:"gotoindex",
		success:function(data){
			if(data==""){
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='login.html'><font size='1'>登录</font></a></li>");
			}else{
				$(".navbar-nav").append("<li class='nav-item'><a class='nav-link' href='#'><font size='1'>"+data.username+"</font></a></li>"+
				"<li class='nav-item'><a class='nav-link' href='logouttt'>[<font size='1'>退出 </font>]</a></li>");
			}
		}
	});
});
var num1=0;

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
