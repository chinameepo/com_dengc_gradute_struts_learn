<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<HTML xmlns="http://www.w3.org/1999/xhtml">
	<HEAD>
		<TITLE>欢迎登陆新的界面</TITLE>
		<LINK href="images/Default.css" type=text/css rel=stylesheet>
		<LINK href="images/xtree.css" type=text/css rel=stylesheet>
		<LINK href="images/User_Login.css" type=text/css rel=stylesheet>
	</HEAD>


	<BODY id=userlogin_body>
		<DIV>
			第一个div
		</DIV>
		<form id="targetForm" name="targetForm" action="loginAction" method ="post">
			<DIV id=user_login>
				<DL>
					<DD id=user_top>
						<UL>
							<LI class=user_top_l></LI>
							<LI class=user_top_c></LI>
							<LI class=user_top_r></LI>
						</UL>
						<DD id=user_main>
							<UL>
								<LI class=user_main_l></LI>
								<LI class=user_main_c>
									<DIV class=user_main_box>
										<UL>
											<LI class=user_main_text>
												用户名
											</LI>
											<LI class=user_main_input>
												<INPUT class=TxtUserNameCssClass id=TxtUserName maxLength=20
													name=username>
											</LI>
										</UL>
										<UL>
											<LI class=user_main_text>
												密码
											</LI>
											<LI class=user_main_input>
												<INPUT class=TxtPasswordCssClass id=TxtPassword
													type=password name=password>
											</LI>
										</UL>
									</DIV>
								</LI>
								<LI class=user_main_r>
									<INPUT class=IbtnEnterCssClass id=IbtnEnter
										style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px"
										, 
    type=image src="images/user_botton.gif" name=IbtnEnter type="submit" 
								</LI>
							</UL>
						</DD>
					</DD>

					<DD id=user_bottom>
						<UL>
							<LI class=user_bottom_l></LI>
							<LI class=user_bottom_c>
								<SPAN style="MARGIN-TOP: 40px">如果未注册点此注册 <A href="#">注册</A>
									凤飞飞</SPAN>
							</LI>
							<LI class=user_bottom_r></LI>
						</UL>
					</DD>
				</DL>
			</DIV>
		</form>
		<SPAN id=ValrUserName style="DISPLAY: none; COLOR: red"></SPAN>

		<DIV id=ValidationSummary1 style="DISPLAY: none; COLOR: red"></DIV>

		<DIV>
		</DIV>

		</FORM>
	</BODY>
</HTML>
