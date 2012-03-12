<!--使用freemarker的视图,并且使用struts的标签-->
<#assign s =JspTaglibs["/WEB-INF/struts-tags.tld"]>

<html>
    <head>
      <title>用户登陆</title>
      <script type="text/javascript">
        function refresh()
        {
          document.getElementById('authImg').src ='authImg?now=' + new Date();
        }
      </script>
    </head>
    <body>
      <!-- 输入actionerro的信息 -->
      <s:actionerror/>
      <center>
      <h3>请输入用户名和密码登录</h3>
        <!-- 登陆表单，添加表的的页面验证！ -->
        <s:form id="loginForm" action ="Login"  >
           <s:textfield name ="username" label="用户名"/>
           <s:password name ="password" label ="密码"/>
           <s:textfield name ="vercode" label ="验证码"/>
           <s:submit value ="登陆"/>
        </s:form>
        <!-- 指定验证码的生成源是这个叫做authImg的类 -->
        验证码(不分大小写)：<img alt="验证码" src="authImg" id ="authImg"/>
        <br>
        看不清？单击此处刷新 <a href="#" onclick ="refresh();">获取验证</a>
      </center>
     
   </body>
</html>

