var i = 3;

$("#divlog").dialog(
		{

			title : '祁云贷系统',
			width : 300,
			height : 250,
			
			buttons : [ {
				text : '登录',
				width : 60,
				handler : function() {
					var user = $("#food1").validatebox("isValid");
					var pwd = $("#food2").validatebox("isValid");

					if (!user) {
						$("#food1").focus();

					} else if (!pwd) {

						$("#food2").focus();
					} else {

						$.ajax({
							url : "login",
							type : "post",
							data : {
								hLoginname : $("#food1").val(),
								
							},
							dataType : "text",
							beforeSend : function() {
								$.messager.progress({
									text : "正在加载中...",

								});

							},
							success : function(data) {
								$.messager.progress("close");
								if (data == 1) {

									
									location.href = "hospitaltree.jsp";
								
										

									} else {
										$.messager.alert('登录失败', '账号或密码错误！', 'warning');
												
									}

								
								

							},
							error : function() {

								$.messager.progress("close");
								$.messager.alert('登录失败', '服务器出错！', 'warning');

							},

						});
					}

				}
			} ],
		});
$("#food1").validatebox({

	missingMessage : '请输入3到12位字符的账号',
	required : true,
	position : 'right',
	validType : 'length[3,12]',
	invalidMessage : '账号格式有误',

});
$("#food2").validatebox({
	required : true,
	position : 'right',
	validType : 'length[4,10]',
	missingMessage : '请输入密码',
	invalidMessage : '密码格式有误！',

});
