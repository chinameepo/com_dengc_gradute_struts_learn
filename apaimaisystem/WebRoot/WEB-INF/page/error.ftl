<#assign s =JspTaglibs["/WEB-INF/struts-tags.tld"]>
<html>
<head>
   <title>fr出错提示页</title>

</head>
<body>
<TABLE width="780" align="center" CELLSPACING=0 background="images/bodybg.jpg">
<tr> 
	<td height="39" valign=top>
	<br><div align="center"><font color="#FF0000" size="+1"><b>系统处理过程中发生了一个错误，信息如下：</b></font></div>
	</td>
</tr>
<tr>
	<td height="100" valign=top>
	<div class="error"><br><br>
	<@s.property value="errMsg"/>
	<@s.property value="exception"/>
	</div>
	</td>
</tr>
<tr>
	<td valign=top><div align="center" style="font:10pt">请您先核对输入</div><br></td>
</tr>
</table>
</body>
</html>