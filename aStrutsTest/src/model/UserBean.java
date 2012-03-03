package model; 
/** 
 * 文件名：UserBean.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-19 下午03:40:29 
 * @since jdk1.6
 * 一个封装了用户登陆的用户名、密码的BEAN，POJO。用于使用模型驱动测试，采用模型驱动的action实现modelDriven接口。
 */
public class UserBean
{
	/**
	 * 用户名和密码，通过这两个变量和指定的变量对比，验证登录
	 * */
	private String username;
	private String password;
	/*封装处理结果的属性*/
	private String tip;
	
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTip()
	{
		return this.tip;
	}
	public void setTip(String tip)
	{
		this.tip = tip;
	}
}
 
