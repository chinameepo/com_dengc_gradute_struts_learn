package action; 

import exception.StudentmgrException;
import action.base.BaseAction;

/** 
 * 文件名：LoginAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-19 下午04:21:50 
 * @since jdk1.6
 * 用户登陆验证的action
 */
@SuppressWarnings("serial")
public class LoginAction extends BaseAction
{
	private String username;
	private String password;
	private String type;
	
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String execute()
	{
		try
		{
			if(null ==mgr.validateLogin(username, password, type))
			{
				
			}
		}
		catch (StudentmgrException e)
		{
			e.printStackTrace();
		}
	}
	

}
 
