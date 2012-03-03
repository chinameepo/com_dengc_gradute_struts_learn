package action; 





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.LoginServiceImp;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：LoginAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-15 下午02:00:19 
 * @since jdk1.6
 * 一个登陆验证的action类
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	/**
	 * 用户名和密码，通过这两个变量和指定的变量对比，验证登录
	 * */
	private String username;
	private String password;
	private String tip;
	private LoginServiceImp service;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTip()
	{
		return tip;
	}
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	
	
	public LoginServiceImp getService()
	{
		return service;
	}
	public void setService(LoginServiceImp service)
	{
		this.service = service;
	}
	
	/**
	 * action 包含的注册方法
	 * */
	public String  regist()
	{
		ActionContext.getContext().getSession().put("username", getUsername());
		setTip("恭喜您,"+getUsername()+",您已经注册成功!");
		return "success";
	}
	
	/**
	 * @return action的字符串，为
	 * @throws Exception
	 * 一个验证方法，查看用户名和密码是否匹配
	 */
	public String  execute() throws Exception{ 
		//获取actonContext实例，通过实例访问servlet API
		ActionContext actionContext = ActionContext.getContext();
		//获取servletContext 的counter属性
		Integer counter = (Integer) actionContext.getApplication().get("counter");
		//如果counter值为null，则默认值为1,否则每次登陆一次，count+1
		if (counter == null)
		{
			counter = 1;
		}
		else 
		{
			counter ++;
		}
		//将增加后的counter的值重新更新
		actionContext.getApplication().put("counter", counter);
		
		//使用一个session来跟踪用户动态,是一个MAP变量,将username设置成一个session属性
		actionContext.getSession().put("username", getUsername());
		
		if(("deng".equals(getUsername()) && ("dengchao".equals(getPassword()))))
		{
			//相当于request.setAttributer("tip","XXX");
			actionContext.put("tip", "通过访问servlet actionContext：您已经成功登陆");
			return "success";
		}
		else 
		{
			Logger logger =LoggerFactory.getLogger(getClass());
			logger.error("用户登陆出现错误！用户名:"+getUsername());
			actionContext.put("tip", "服务器登陆失败");
			return "error";
		}
	}
	/**
	 * struts中完成数据校验的框架，同action一样，这个类只要覆盖父类的同名方法即可
	 * */
	public void validate()
	{
		//如果用户名为空的话
		if((getUsername()== null) ||getUsername().trim().equals("") )
		{
			addFieldError(username, "username requred!");
			addActionError("用户名不能为空!请重新输入");
		}
		if((getPassword() == null)|| getPassword().trim().equals(""))
		{
			addFieldError(password, "密码不能为空，请重新输入！");
		}
	}
	
}
 
