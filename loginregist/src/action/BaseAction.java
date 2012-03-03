package action; 

import service.UserManager;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：baseAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-29 下午01:05:53 
 * @since jdk1.6
 *一个基本类，规定了业务逻辑的处理类
 */
public class BaseAction extends ActionSupport 
{
	protected UserManager manager;
	public UserManager getManager()
	{
		return manager;
	}

	public void setManager(UserManager manager)
	{
		this.manager = manager;
	}
	

}
 
