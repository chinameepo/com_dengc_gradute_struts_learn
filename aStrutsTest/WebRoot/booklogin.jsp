<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登陆界面</title>
    </head>
    <body>
        <h1 align = "center">欢迎使用查看书籍系统!</h1>
        <s:form action ="booksAction" method ="post">
		<table align="center">
		 <tr>
		   <td>
		     <s:textfield name ="username" label ="用户名" value="deng"/>
		   </td>
		 </tr>
		 <tr>
		 <s:submit label ="提交"></s:submit>
		 </tr>
		</table>
		</s:form>
    </body>
</html>
