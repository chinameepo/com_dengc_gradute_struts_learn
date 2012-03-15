<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
   <title>浏览赢取的全部物品</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4" ><div class="mytitle">您所赢取的物品：</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td bgcolor="#FFFFFF"><b>物品名</b></td>
    <td bgcolor="#FFFFFF"><b>物品种类</b></td>
    <td bgcolor="#FFFFFF"><b>赢取价格</b></td>
    <td bgcolor="#FFFFFF"><b>物品备注</b></td>
  </tr>
<s:iterator value="items" id="item" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if>
  <s:else>style="background-color:#eeeeee"</s:else>>
    <td><s:property value="name"/></td>
    <td><s:property value="kind"/></td>
    <td><s:property value="maxPrice"/></td>
    <td><s:property value="remark"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
</TABLE>
</body>
</html>