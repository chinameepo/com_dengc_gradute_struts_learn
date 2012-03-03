<%@ page language="java" contentType="text/html; charset=GBK"%>
<script src="prototype-1.4.0.js" type="text/javascript">
</script>
<script language="JavaScript">
	function gotClick()
	{
		//请求的地址
		var url = 'JSONExample.action';
		//将favorite表单域的值转换为请求参数
		var params = Form.serialize('form1');
		//创建Ajax.Request对象，对应于发送请求
		var myAjax = new Ajax.Request(
		url,
		{
			//请求方式：POST
			method:'post',
			//请求参数
			parameters:params,
			//指定回调函数
			onComplete: processResponse,
			//是否异步发送请求
			asynchronous:true
		});
	}
    function processResponse(request)
	{
		$("show").innerHTML = request.responseText;
	}	
</script>
<html>
<head>
<title>使用JSON插件</title>
</head>
<body>
<form id="form1" name="form1" method="post">
field1:<INPUT TYPE="text" name="field1" id="field1"/><br>
field2<INPUT TYPE="text" name="field2" id="field2"/><br>
field3<INPUT TYPE="text" name="field3" id="field3"/><br>
<INPUT TYPE="button" value="提交" onClick="gotClick();"/>
</form>
<div id="show">
</div>
</body>
</html>
