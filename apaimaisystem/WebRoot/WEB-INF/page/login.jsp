<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>商业拍卖J2EE程序框架</title>
</head>
<body>
<TABLE width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">

<tr>
<td>
请输入用户名和密码来登陆<br>
<div align=center>
<s:actionerror cssClass="error" />
<s:form action="processLogin.action">
	<s:textfield name="username" label="用户名" />
	<s:textfield name="password" label="密码"/>
	<s:textfield name="vercode" label="验证码"/>
	<s:submit/>
</s:form>
</div>
验证码：<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>