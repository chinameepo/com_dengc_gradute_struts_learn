package model; 
/** 
 * 文件名：User.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-14 下午12:44:29 
 * @since jdk1.6
 * 系统的注册用户，用户输入用户名和密码登录系统
 */
public class User
{
	/**
	 * 包含属性：
	 * 用户名、密码、用户类型：管理员或者是学生
	 * */
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
}
 
