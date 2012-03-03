<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登陆界面</title>
        <script language="javascript">
          function regist()
          {
           //获取jSP页面的一个表单
           var targetForm = document.getElementById("targetForm");
           //动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
           targetForm.action = "loginAction!regist.action";
           //提交表单 
           targetForm.submit();
          }
          
          function login()
          {
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
        <h1>欢迎登陆!</h1>
        <!-- 如果配置的自带的校验器不支持生成客户端脚本，而客户端form又设置了validation="true",那么将会报错 -->
		<form id ="targetForm" name = "targetForm" action="loginAction" method ="post">
		  <table border = "1" align = "center">
		   <tr>
		     <s:textfield name = "username" label ="用户名"></s:textfield>
		   </tr>
		   <tr>
		    <s:password name = "password" label ="密 码"></s:password>
		   </tr>
		      <s:submit value ="登陆"/>
		   <tr>
		    <td>
		      <input type = "button" value = "注册 " onclick = "regist();"/> 
		    </td>
		    <td>
		    <s:reset value = "清空"/>
		    </td>
		   </tr>
		  </table>
		</form>
    </body>
   
</html>
