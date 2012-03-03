package dao;

import java.util.List;

import modle.User;

/**
 * 文件名：UserDao.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-28 下午07:08:58
 * @since jdk1.6 
 * 一个用户DAO的接口，规定了实现数据库操作的方法。通过这个接口，业务逻辑层可以直接和这个接口进行耦合，而不必用它的实现类
 */
public interface UserDao
{

	/**
	 * @param id
	 * @return 通过id来查找用户
	 */
	public User get(int id);

	/**
	 * @param user
	 *            保存用户实例的方法
	 */
	public void save(User user);

	/**
	 * @param user
	 *            更新用户到数据库
	 */
	public void update(User user);

	/**
	 * @param id
	 *            根据id查找用户，并且删除用户
	 */
	public void delete(int id);

	/**
	 * @param user
	 *            删除指定用户
	 */
	public void delete(User user);

	/**
	 * @return 查找所有用户
	 */
	public List<User> findAll();

	/**
	 * @param user
	 * @param pass
	 * @return 通过用户名和密码查找用户
	 */
	public User findUserByNameAndPass(String user, String pass);

	/**
	 * @param name
	 * @return 通过用户名查找用户
	 */
	public User findUserByName(String name);

}
