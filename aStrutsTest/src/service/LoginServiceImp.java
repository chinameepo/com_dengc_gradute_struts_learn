package service; 
/** 
 * 文件名：LoginService.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-27 下午02:38:03 
 * @since jdk1.6
 * 登陆验证的业务逻辑，可以被登陆的控制器使用IOC注入调用
 */

public class LoginServiceImp implements LoginService
{
	
	/**
	 * @param username
	 * @param password
	 * @return 
	 * 验证用户名和密码是否正确
	 */
	public boolean validate(String username,String password)
	{ 
		if ("deng".equals(username)  &&  "dengchao".equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}
 
