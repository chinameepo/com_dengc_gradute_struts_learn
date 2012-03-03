<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
      <title>用户注册！</title>

      <script src ="js/prototype.js" type="text/javascript">
      </script>
      <script src ="js/json.js" type="text/javascript">
      </script>
      <script type="text/javascript">
       
        //刷新验证码
        function refresh()
        {
          document.getElementById('authImg').src ='authImg?now=' + new Date();
        }
        //验证用户名是否存在
        function validateName()
        {
          //请求的地址
          var url ="validateName.action";
          //使用protoType.js的函数来实现
          var params = Form.Element.serialize('username');
          //创建ajax对象，发送验证请求
          var myAjax = new Ajax.Request{
             url,
             {
               //请求方式post
               method:'post',
               parameters:params,
               onComplete:processResponse,
               //是否异步发送
               asynchronous:true
             }
          } ;
        }
        //定义回调函数
        function processResponse()
        {
          //把响应变成一个jasong对象
          var action = request.responseText.parseJSON();
          //将TIP属性放在json对象中显示
          $("tip").innerHTML = action.tip;
        }
      </script>
    </head>
    <body>
     
      <!-- 输入actionerro的信息 -->
      <s:actionerror/>
      <span id="tip" style="color:red;font-weight:bold"></span>
      <center>
       <h3>请填写用户注册信息</h3>
        <!-- 登陆表单，添加表的的页面验证！ -->
        <s:form id="registForm" action ="Regist" >
           <!-- 失去焦点的时候，调用ajax验证用户名是否可用 -->
           <s:textfield name ="username" label="用户名" onblur ="validateName();"/>
           <s:password name ="password" label ="密码"/>
           <s:textfield name ="email" label ="邮箱"/>
           <s:textfield name ="vercode" label ="验证码"/>
           <s:submit value ="注册"/>
        </s:form>
        <!-- 指定验证码的生成源是这个叫做authImg的类 -->
        验证码：<img alt="6位验证码" src="authImg" id ="authImg">
        <br>
        看不清？单击此处刷新 <a href="#" onclick ="refresh();">获取验证</a>
      </center>
   </body>
</html>

