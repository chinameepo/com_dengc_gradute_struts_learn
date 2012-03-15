<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>您参与的全部竞价</title>
</head>
<body">
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4" ><div class="mytitle">您参与的全部竞价</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td><b>物品名</b></td>
    <td><b>竞标价格</b></td>
    <td><b>竞标时间</b></td>
    <td><b>竞标人</b></td>
  </tr>
<s:iterator value="bids" id="bid" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td><s:property value="item"/></td>
    <td><s:property value="price"/></td>
    <td><s:property value="bidDate"/></td>
    <td><s:property value="user"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
</TABLE>
</body>
</html>