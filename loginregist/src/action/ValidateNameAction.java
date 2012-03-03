package action; 

import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：ValidateNameAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-29 下午05:47:55 
 * @since jdk1.6
 * 验证用户名是否存在的action
 */
@SuppressWarnings("serial")
public class ValidateNameAction extends BaseAction
{
	private String username;
	private String tip;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getTip()
	{
		return tip;
	}
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	
	public String exexcute()
	{
		try
		{
			//如果业务逻辑组件验证该用户名可用
			if (manager.validateName(username))
			{
				setTip("您好：用户名"+getUsername()+"可用");
				return ActionSupport.SUCCESS;
			}
			else
			{
				setTip("用户名"+getUsername()+"已经存在，请重新申请一个用户名");
				
			}
		}
		catch (Exception e)
		{
			setTip(e.toString());
		}
		return SUCCESS;
	}

}
 
