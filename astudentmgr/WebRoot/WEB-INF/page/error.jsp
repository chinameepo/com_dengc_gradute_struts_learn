<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
	<title>error!</title>
	</head>
	<body background="img/sky.jpg">
	  <h2>error</h2>
	  <s:property value="exception.message" /> 
	  <a href="login.jsp">click here to restart!</a>
   </body>
</html>