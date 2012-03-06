package action; 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：LoginAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-6 上午10:47:58 
 * @since jdk1.6
 * 登陆验证的框架,继承actionsupport是为了可以添加错误信息到前台
 */
public class LoginAction extends ActionSupport
{
	/**
	 * 前台登陆请求的用户名和密码。还有返回后的验证信息的tip。
	 * */
	private String username;
	private String password;
	private String tips;
	private String[] array = {"邓超","李青鑫","向舟","黄小龙","tom","jerry"};
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
	public String getTips()
	{
		return tips;
	}
	public void setTips(String tips)
	{
		this.tips = tips;
	}
	
	public void setArray(String[] array)
	{
		this.array = array;
	}
	
	
	public String[] getArray()
	{
		return array;
	}
	/** (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * 登陆验证类，使用freemarker作为视图模板，返回模型到前台
	 */
	public String execute()
	{
		if (("deng".equals(getUsername())) &&  ("dengchao".equals(getPassword())))
		{
			setTips("恭喜你登陆成功，你的用户名是："+getUsername());
			Map session = ActionContext.getContext().getSession();
			session.put("tips", getTips());
			session.put("array", array);
			return  SUCCESS;
		}
		else
		{
			addActionError("用户名或者密码错误，请重新登陆！");
			return INPUT;
		}
	}

}
 
