<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <title>浏览拍卖中的物品</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<s:actionerror/>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr bgcolor="#e1e1e1" >
    <td colspan="5" ><div class="mytitle">当前种类是：<s:property value="kind"/></div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td><b>物品名</b></td>
    <td><b>起拍时间</b></td>
    <td><b>最高价格</b></td>
    <td><b>所有者</b></td>
    <td><b>物品备注</b></td>
  </tr>
<s:iterator id="item" value="items" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if>>
    <td><a href='viewDetail.action?itemId=<s:property value="id"/>'>
	<s:property value="name"/></a></td>
    <td><s:property value="addTime"/></td>
    <td><s:property value="maxPrice"/></td>
    <td><s:property value="owner"/></td>
    <td><s:property value="remark"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
</TABLE>
</body>
</html>