<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 <title>登陆成功！</title>
 </head>
 <body>
   <h1 align ="center"> ${tips}</h1>
   <h3 align="center">后台传过来的数组是:</h3>
   <center>
   <table border ="2">
      <#list array as i>
        <tr><td>用户名</td> <td>${i}}</td></tr>
      </#list>
   </table>
   </center>
 </body>
</html>