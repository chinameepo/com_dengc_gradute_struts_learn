package dao; 

import java.util.List;

import model.User;

/** 
 * 文件名：UserDao.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-15 上午11:18:19 
 * @since jdk1.6
 * 用户类的操作接口，关于用户的增删改查询的操作
 */
public interface UserDao
{
	/**
	 * 模块1:根据用户的ID来查找用户
	 * @param id 用户的ID编号
	 * @return 用户的对象
	 */
	User getUser(int id);
	
	/**模块2：把获得的用户添加到数据库中去
	 * @param user
	 */
	void save(User user);
	/**
	 * 模块3：修改用户信息，更新到数据库
	 * @param user
	 */
	void update(User user);
	
	/**
	 * 模块4：删除指定ID的用户
	 * @param id
	 */
	void delete(int id);
	/**
	 * 删除当前用户
	 * @param user 
	 */
	void delete(User user);
	
	/**
	 * 模块5：查找数据库中所有的用户
	 * @return 获得的所有用户
	 */
	List<User> findAll();
	
	/**
	 * 模块6：用户登陆时候的验证方法，用它来进行登陆验证。
	 * @param username 用户名
	 * @param password 密码
	 * @return 登陆的用户
	 */
	User finduUserByNameAndPass(String username,String password,String type);
	
	/**
	 * 模块7,：检查用户是否已经注销
	 * @param user
	 * @return 是否注销用户的结果
	 */
	boolean userExited(User user);
}
 
