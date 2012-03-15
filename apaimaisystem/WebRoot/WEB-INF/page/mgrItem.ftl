<#assign s =JspTaglibs["/WEB-INF/struts-tags.tld"]>
<html>
<head>
	<title>管理拍卖物品</title>
</head>
<body>
<table width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr>
<td>
<br>
<table width=80% align="center" cellpadding=0 cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4" ><div class="mytitle">您当前的拍卖物品：</div></td> 
  </tr>
  <tr class="pt9" height="30">
    <td><b>物品名</b></td>
    <td><b>物品种类</b></td>
    <td><b>赢取价格</b></td>
    <td><b>物品备注</b></td>
  </tr>
<s:iterator id="item" value="items" status="st">
  <tr class="pt9" height="24" <s:if test="#st.odd">style="background-color:#dddddd"</s:if><s:else>style="background-color:#eeeeee"</s:else>>
    <td><s:property value="name"/></td>
    <td><s:property value="kind"/></td>
    <td><s:property value="maxPrice"/></td>
    <td><s:property value="remark"/></td>
  </tr>
</s:iterator>
</table>
</TD>
</TR>
<tr>
<td>
<br>
添加新物品
<div align=center>
<s:actionerror/>
<@s.form action="proAddItem.action">
<@s.textfield name="name" label="物品名"/>
<@s.textfield name="desc" label="物品描述"/>
<@s.textfield name="remark" label="物品备注"/>
<@s.textfield name="initPrice" label="起拍价格"/>
<!--freemark中 # 号又自己的意义，所以这里面因为#号冲突了。不能在1前面加上#号-->
<@s.select list=r"# {'1':'一天','2':'二天','3':'三天','4':'四天','5':'五天','6':'一个星期','7':'一个月','8':'一年'}"
	label="有效时间" name="avail"></@s.select>
<@s.select list="kinds" label="物品种类" name="kind"
	listKey="id"
	listValue="kindName"/>
<@s.textfield name="vercode" label="验证码"/>
<@s.submit/>
</@s.form>
<div>
验证码：<img name="d" src="authImg">
</td>
</tr>
</table>
</body>
</html>