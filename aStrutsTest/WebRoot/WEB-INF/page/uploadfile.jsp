<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>文件上传</title>
</head>
   <body>
   <!-- No configuration found for the specified action: 
   'loginAction.action' in namespace: '/WEB-INF/page'. 
   Form action defaulting to 'action' attribute's literal value.大概是因为我在action中设置了actioin=/web-inf^^ -->
     <form id ="uploadfile" method = "post" action = "upload" enctype="multipart/form-data">
        <input type="text" name="title" >
	   <input type="file" name = "upload"/><br>
       <input type= "submit" value="文件上传" name = "dd"/>
     </form>
   </body>
</html>