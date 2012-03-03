package action; 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：Login.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-29 下午12:50:27 
 * @since jdk1.6
 * 登陆验证的action
 */
@SuppressWarnings("serial")
public class LoginAction extends BaseAction 
{
	/**
	 * 登陆输入的用户名、密码、验证码
	 * */
	private String username;
	private String password;
	private String vercode;
	/**
	 * getter&&&settter
	 * */
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
	public String getVercode()
	{
		return vercode;
	}
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	
	
	/***(non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * @override 重写父类的方法
	 * 用户登录到额验证方法
	 */
	public String execute() throws Exception
	{
		//取出sesion对象
		Map session = ActionContext.getContext().getSession();
	    //从session中获取随机生成的验证码
		String ver2 = (String) session.get("rand");
		//强制让本次生成的验证码失效
		session.put("rand", null);
		System.out.println("生成的验证码："+ver2.toLowerCase()+",输入的验证码："+getVercode().toLowerCase());
		
		//如果验证码正确，再验证用户名和密码
		if ((ver2.toLowerCase()).equals(getVercode().toLowerCase()))
		{
			//调用业务逻辑方法处理登陆请求
			int userId = manager.loginValidate(username, password);
			//id是正数表示用户名存在，登陆成功
			if(userId > 0)
			{
				session.put("userId", userId);
				return ActionSupport.SUCCESS;
			}
			else
			{
				addActionError("用户名或者密码错误！");
			}
		}
		else 
		{
			addActionError("验证码不正确！");
		}
		//不管是验证码不正确，还是用户名密码不正确，都返回错误字符串
		return "failure";
	}

}
 
