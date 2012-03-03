package action; 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

/** 
 * 文件名：RegistAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-1 上午10:56:07 
 * @since jdk1.6
 * 注册的action控制器
 */
public class RegistAction extends BaseAction
{
	//用户提交的参数， 包括可用的用户名、密码、邮箱、验证码
	private String username;
	private String password;
	private String email;
	private String vercode;
	/**3
	 * getters%%%%&&&&setters
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
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getVercode()
	{
		return vercode;
	}
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	
	/** (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * @return 返回的状态字符串
	 */
	public String execute()
	{
		//获取session会话对象
		Map	 session = ActionContext.getContext().getSession();
		//取出随机生成的验证码
		String vercode2 = (String) session.get("rand");
		System.out.println("注册的验证码："+vercode2.toLowerCase()+",输入的验证码："+getVercode().toLowerCase());
		//强制验证码失效
		session.put("rand", null);
		
		if (vercode2.toLowerCase().equals(vercode.toLowerCase()))
		{
			try
			{
				if (manager.addUser(username, password, vercode) > 0)
				{
					//如果添加成功
					return SUCCESS;
				}
			}
			catch (Exception e)
			{
				addActionError("注册用户失败!");
				e.printStackTrace();
				return "failure";
			}
		}
		else
		{
			addActionError("验证码错误！重新输入");
		}
		return "failure";
	}
	
	

}
 
