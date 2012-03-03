package service; 
/** 
 * 文件名：UserManager.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-29 上午10:57:13 
 * @since jdk1.6
 * 业务逻辑组件接口，注册，登陆，判断用户名是否有效
 */
public interface UserManager
{
	/**
	 * @param user 注册的用户名
	 * @param pass 注册的密码
	 * @param email 注册的邮箱
	 * @return 返回注册用户的id号码
	 * @throws Exception
	 * 注册用户，新增用户
	 */
	public int addUser(String user,String pass,String email) throws Exception;
	/**
	 * @param user 登陆用户名
	 * @param pass 登陆的密码
	 * @return 返回用户的登录状态
	 * @throws Exception
	 * 用户登陆啊
	 */
	public int loginValidate(String username,String pass) throws Exception;
	/**
	 * @param name 用户名
	 * @return 查看用户名是否存在，如果存在，则用户名不可用
	 */
	public boolean validateName(String name) throws Exception;

}
 
