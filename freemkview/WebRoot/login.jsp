<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    <!-- 输入actionerro的信息 -->
      <s:actionerror />
       <h1 align ="center">欢迎使用freemarker的视图应用</h1>
       <s:form id ="loginForm" action ="loginAction">
         <s:textfield name ="username" label ="用户名"></s:textfield>
         <s:password name ="password" label ="密  码"></s:password>
         <s:submit value ="登陆"/>
         <s:reset value ="重置"></s:reset>
       </s:form>
    </body>
</html>