
<#assign s=JspTaglibs["/WEB-INF/struts-tags.tld "]>  
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