<!--使用freemarker的视图,并且使用struts的标签-->
<#assign s =JspTaglibs["/WEB-INF/struts-tags.tld"]>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    <!-- 输入actionerro的信息 -->
      <@s.actionerror />
       <h1 align ="center">欢迎使用freemarker的视图应用</h1>
       <@s.form id ="loginForm" action ="loginAction">
         <@s.textfield name ="username" label ="用户名"></@s.textfield>
         <@s.password name ="password" label ="密  码"></@s.password>
         <@s.submit value ="登陆"/>
         <@s.reset value ="重置"></@s.reset>
       </@s.form>
    </body>
</html>