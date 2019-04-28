var arr = [];
$(function(){
	$("#tabss").tabs({
		fit : true,
		border : false,
	});
	$.ajax({
		Type:"post",
		url:"hostree",
		dataType:"json",
		success:function(data){
			for(i=0;i<data.length;i++){
				arr.push(data[i].id);
				//用div的id 点一个easyui的分类布局（手风琴）,add添加内容
				$("#ultt").accordion('add',{
					title:data[i].text,
					selected:false,
					content:'<div style="padding:10px"><ul name="'+data[i].text+'"></ul></div>'
				});
			}
		}
	});
	
	$("#ultt").accordion({
		onSelect:function(title,index){
			var idd = arr[index];
			$("ul[name='"+title+"']").tree({
				url:"hostreee?id=" +idd,
				onLoadSuccess:function(node,date){
					return date;
				},
				lines:true,
				onClick:function(node){
					if(node.url){
						if($("#tabss").tabs("exists",node.text)){
								$("#tabss").tabs("select",node.text);
						}else{
							$("#tabss").tabs("add",{
								title:node.text,
								closable:true,
								href:node.url,
							});
						}
					}
				}
			});
		}
	});
});