$(function(){});
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
