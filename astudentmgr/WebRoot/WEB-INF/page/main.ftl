<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Language" content="zh-CN" /> 
	<title>主界面</title>
	     <!--显示时间和日期的一段脚本-->
		<script type="text/javascript">
			tempDate = new Date(); 
			date = tempDate.getDate(); 
			month= tempDate.getMonth() + 1 ; 
			year= tempDate.getYear(); 
			document.write("现在是：") 
			document.write(year); 
			document.write("年"); 
			document.write(month); 
			document.write("月"); 
			document.write(date); 
			document.write("日"); 
			document.write("", tempDate.getHours(),":",tempDate.getMinutes()); 
    </script>
    <style type="text/css"> 
		body { 
		 background-image: url("img/sky.jpg");
 		 background-repeat: repeat;
		 background-position:center;
		 background-attachment:fixed;
		} 
	</style>
	</head>
	
	<body background="img/sky.jpg">
		欢迎用户:${userName}
			<br>
		<div align="left">
	     <iframe src="http://m.weather.com.cn/m/pn6/weather.htm?id=101200101T " width="140" height="800" marginwidth="0" marginheight="0" hspace="0" vspace="0" frameborder="0" scrolling="no"></iframe>
		 </div>
		 <div align="center">
		 <img src="img/top.png" alt=" 学生信息管理系统" width="800" height="80" />
		 </div>
		 添加功能按钮
		 <br>
		
	<body>
</html>