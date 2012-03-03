<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
     <title>错误！</title>
  </head>
  <body>
    <h4>错误信息</h4>
    <span style ="color:green;font:9pt bold">
       <s:property value ="exception.message"/> 
    </span>
  </body>

</html>