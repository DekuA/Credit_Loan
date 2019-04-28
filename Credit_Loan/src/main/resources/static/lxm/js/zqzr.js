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

