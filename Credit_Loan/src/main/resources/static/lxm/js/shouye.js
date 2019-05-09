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

function xmxiangqing(){
	window.location.href="xmxiangqing.html";
}
