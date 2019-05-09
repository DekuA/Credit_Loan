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


$(function(){
	$("tr td").css("cursor","pointer");
})

var mh1;
var mh2;
var my1;
var my2;
var sfyq;

function seltiaojian1(e,trr,month1,month2){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	//alert(month1+","+month2);
}

function seltiaojian2(e,trr,money1,money2){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	//alert(money1+","+money2);
}

function seltiaojian3(e,trr,b){
	$("#"+trr+" td").css("color","#040505");
	$(e).css("color","orange");
	//alert(b);
}

function shouye(){
	window.location.href="shouye.html";
}

