<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>学生信息管理系统登陆界面</title>
		<script type="text/javascript">
		   function submit()
		   {
			//获取jSP页面的一个表单
			var targetForm = document.getElementById("targetForm");
			//动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
			targetForm.action = "login.action";
			//提交表单 
			targetForm.submit();
		   }
		   function reset()
		   {
		   	//获取jSP页面的一个表单
			var targetForm = document.getElementById("targetForm");
			targetForm.reset();
		   }
		</script>
	</head>
	<body background="img/sky.jpg">
	<div align="center">
	 <img src="img/top.png" alt=" 学生信息管理系统"width="800" height="100" />
	 </div>
	 <div style="background-position:center" align="center" >
		<!-- 如果配置的自带的校验器不支持生成客户端脚本，而客户端form又设置了validation="true",那么将会报错 -->
		<s:form id="targetForm" name="targetForm" action="login">
			<s:textfield name="username" label="用户名"></s:textfield>
     		<s:password name="password" label="密 码"></s:password>
            <!-- -顶一个一个单选按钮 -->
            <s:radio label="用户类型"  name ="type"  list= "{'学生','管理员'}" value ="管理员" />
           
		</s:form>
	</div>
	<div align ="center">
	  <input name="submit" type="image" onClick="submit();" src="img/login.jpg"  height="30" width="60" />
	  <input name="reset" type ="image" onClick ="reset();" src ="img/reset.jpg" height="30" width="60"/>
	</div>
	</body>
</html>
