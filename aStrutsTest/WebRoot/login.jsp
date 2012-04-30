<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登陆界面</title>
		<script language="javascript">
function regist() {
	//获取jSP页面的一个表单
	var targetForm = document.getElementById("targetForm");
	//动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
	targetForm.action = "loginAction!regist.action";
	//提交表单 
	targetForm.submit();
}

function login() {
	//获取jSP页面的一个表单
	var targetForm = document.getElementById("targetForm");
	//动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
	targetForm.action = "loginAction.action";
	//提交表单 
	targetForm.submit();
}
</script>
	</head>
	<body>
		<h1>
			欢迎登陆!
		</h1>
		<!-- 如果配置的自带的校验器不支持生成客户端脚本，而客户端form又设置了validation="true",那么将会报错 -->
		<s:form id="targetForm" name="targetForm" action="loginAction">

			<s:textfield name="username" label="用户名"></s:textfield>

			<s:password name="password" label="密 码"></s:password>
            <!-- -顶一个一个单选按钮 -->
            <s:radio name ="radio" list= "{'student','teacher'}"/>
            <!-- 定义一个组合框按钮 -->
            <s:combobox name ="combo"label = "静夜思" theme ="css_xhtml" labelposition ="top" size ="20"
            list="{'床前明月光','疑是地上霜'}"/>
            <!-- 此处要headerValue="man" headerKey="man"同时选中才能把它作为默人的值来处理。 -->
            <s:select list="{'woman','other'}" theme="simple" name="sex" headerValue="man" headerKey="man" label ="性别" />
			<s:submit value="登陆" />
			<input type="button" value="注册 " onclick="regist();" />
			<s:reset value="清空" />

		</s:form>
	</body>

</html>
