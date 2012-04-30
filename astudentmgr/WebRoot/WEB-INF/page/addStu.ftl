
<!--使用freemarker的视图,并且使用struts的标签-->
<!--#assign s =JspTaglibs["/WEB-INF/struts-tags.tld"]-->
<html>
	<head>
	<title>主界面</title>
	<style type="text/css"> 
		body { 
		 background-image: url("img/sky.jpg");
 		 background-repeat: repeat;
		 background-position:center;
		 background-attachment:fixed;
		} 
	</style>
	</head>
	<body>
	    <h2 align="center">添加学生信息</h2>
		<div align="center">
			<@s.form  action ="addStudent">
				<@s.textfield name ="name" label ="姓名"/>
				<br>性别
				<@s.select label ="性别" name="sex"list="{'女'}" theme="simple" headerValue="男" headerKey="男"  />
				<@s.textfield name ="address" label ="家庭地址" />
				<@s.textfield name ="tel" label ="电话号码"/>
				<@s.textfield name ="email" label ="电子邮箱"/>
				<@s.textfield name ="qq" label ="QQ"/>
				<br>班级
				<select label ="班级" name="studentClass"  >
					<#list classList as stu>
						<option >${stu.className}</option>
					</#list>
				<select>
				<@s.textfield name ="room" label ="寝室号"/>
				<br>资助情况
				<@s.select  name="poor"list="{'贫困','特困'}" theme="simple" headerValue="无" headerKey="无" label ="资助情况" />
				<@s.textfield name ="ralation" label ="家庭联系人"/>
				<@s.textfield name ="ralationTel" label ="联系人电话"/>
				<@s.textfield name ="avaScore" label ="平均学分绩"/>
				<@s.textfield name ="discipline"  label ="违纪情况"/>
				<@s.textfield name ="escClass" label ="逃课次数"/>
				<@s.textfield name ="fine" label ="惩罚情况"/>
				<@s.textfield name ="note" label ="备注"/>
				<@s.submit value="提交"/>
			</@s.form>
		</div>
	</body>
</html>
	