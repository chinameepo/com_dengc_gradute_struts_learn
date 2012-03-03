<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登陆界面</title>
         <script language="javascript">
          function seebook()
          {
           //获取jSP页面的一个表单
           var targetForm = document.getElementById("bookForm");
           //动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
           targetForm.action = "booklogin.jsp";
           //提交表单 
           targetForm.submit();
          }
          function uploadfile()
          {
          //获取jSP页面的一个表单
           var targetForm = document.getElementById("bookForm");
           //动态修改目标的action,响应方法是loginAction的一个叫做regist（）的方法
           targetForm.action = "uploadFile.action";
           //提交表单 
           targetForm.submit();
          }
        </script>
    </head>
    <body>
	  您已经成功登陆<br>
	  现在时间是：<%=new java.util.Date() %><br>
	 <!-- 通过表达式访问ServletContext的属性值 -->
	 <br>
	 本站的访问次数是：${applicationScope.counter} 
	 <br/>
	 <br/>
	 ${sessionScope.username}您已经成功登陆!
	 <br>
	 ${requestScope.tip }
	 <!-- 不能直接访问web-inf下的东西，要通过action跳转。通过超链接跳转是不行的 -->
     <s:form id = "bookForm" method = "post">
       <input type="button" onclick = "seebook();" value ="查看书籍"/>
       <input type= "button" onclick = "uploadfile();" value="跳转到上传页面"/>
     </s:form>
	</body>
</html>
	