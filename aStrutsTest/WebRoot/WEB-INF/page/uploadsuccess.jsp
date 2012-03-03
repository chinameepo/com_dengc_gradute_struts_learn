<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
     <title>
      上传成功！
     </title>
  </head>
  <body>
         <h2 align="center">上传成功</h2>
         文件标题：<s:property value = " + title"/><br>
      文件名为：<s:property value = "uploadFileName"/> 
      <br>
      文件显示：
	  <br>
      <iframe src = "<s:property value =" 'D:\Program Files\apache-tomcat-7.0.2\webapps\aStrutsTest' + uploadFileName"/> "></iframe>
  </body>
</html>