package service; 


import modle.User;
import dao.UserDao;

/** 
 * 文件名：UserManagerImp.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-29 上午11:15:26 
 * @since jdk1.6
 * 业务逻辑接口的实现组件,有三个方法，等待action来调用
 */
public class UserManagerImp implements UserManager
{
	//业务逻辑依赖的DAO组件，可以实现业务逻辑层和DAO层的松耦合
	private UserDao userDao;

	
	public UserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	/** (non-Javadoc)
	 * @see service.UserManager#addUser(java.lang.String, java.lang.String, java.lang.String)
	 * @param user 注册的用户名
	 * @param pass 注册的密码
	 * @param email 注册的邮箱
	 * @return 返回注册用户的id号码
	 * @throws Exception
	 * 注册用户，新增用户
	 */
	public int addUser(String username, String pass, String email) throws Exception
	{
		try
		{
			User user = new User();
			user.setUsername(username);
			user.setPassword(pass);
			user.setEmail(email);
			//保存实例
			userDao.save(user);
			return user.getId();
		}
		catch (Exception e)
		{
			throw new Exception("用户添加中出现错误！@！"+e.toString());
		}
	}

	/** (non-Javadoc)
	 * @see service.UserManager#loginValidate(java.lang.String, java.lang.String)
	 * @param user 登陆用户名
	 * @param pass 登陆的密码
	 * @return 返回用户的登录状态
	 * @throws Exception
	 * 用户登陆
	 */
	public int loginValidate(String user, String pass) throws Exception
	{
		try
		{
			User loginUser = userDao.findUserByNameAndPass(user, pass);
			if (loginUser != null)
			{
				return loginUser.getId();
			}
		}
		catch (Exception e)
		{
			throw new Exception("用户登陆中出现错误！@！"+e.toString());
		}
		return -1;
	}

	/** (non-Javadoc)
	 * @see service.UserManager#validateName(java.lang.String)
	 * @param name 用户名
	 * @return 查看用户名是否存在，如果存在，则用户名不可用
	 * @throws Exception 
	 * 查看用户名是否可用，如果不可用则不能用作注册用户名
	 */
	public boolean validateName(String name) throws Exception
	{
		try
		{
			if (userDao.findUserByName(name) == null)
			{
				return true;
			}
			else 
			{
				return false;	
			}
		}
		catch (Exception e)
		{
			throw new Exception("验证用户是否有效出错！");
		}
	}

}
 
