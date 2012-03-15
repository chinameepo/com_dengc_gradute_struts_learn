<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
   <title>管理拍卖种类</title>
   <link href="images/css.css" rel="stylesheet" type="text/css">
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="2" ><div class="mytitle">当前的物品种类如下：</div></td> 
  </tr>
<s:iterator id="kind" value="kinds" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>种类名</td>
    <td><s:property value="kindName"/></td>
  </tr>
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td>种类描述</td>
    <td><s:property value="kindDesc"/></td>
  </tr>
</s:iterator>
</table>
</td>
</tr>
<tr>
<td>
<br><br>
添加新种类
<div align=center>
<s:actionerror cssClass="error"/>
<s:form action="proAddKind.action">
<s:textfield name="name" label="种类名"/>
<s:textfield name="desc" label="种类描述"/>
<s:textfield name="vercode" label="验证码"/>
<s:submit/>
</s:form>
<div>
验证码：<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>