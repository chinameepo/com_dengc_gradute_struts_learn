package dao; 

import java.util.List;

import modle.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/** 
 * 文件名：UserDaoHibernate.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-28 下午07:18:08 
 * @since jdk1.6
 *实现DAO接口的组件的一个实现类, HibernateDaoSupport由spring提供，可以很方便实现操作
 */
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao
{
	/** (non-Javadoc)
	 * @see dao.UserDao#get(int)
	 */
	public User get(int id)
	{
		
		return (User)getHibernateTemplate().get(User.class, id);
	}

	/** (non-Javadoc)
	 * @see dao.UserDao#save(modle.User)
	 */
	public void save(User user)
	{
		getHibernateTemplate().save(user);
		
	}

	/** (non-Javadoc)
	 * @see dao.UserDao#update(modle.User)
	 */
	public void update(User user)
	{
		getHibernateTemplate().saveOrUpdate(user);
		
	}


	/** (non-Javadoc)
	 * @see dao.UserDao#delete(int)
	 * 删除一个用户
	 */
	public void delete(int id)
	{
		User user = (User) getHibernateTemplate().get(User.class, id);
		getHibernateTemplate().delete(user);
	}

	/****(non-Javadoc)
	 * @see dao.UserDao#delete(modle.User)
	 */
	public void delete(User user)
	{
		getHibernateTemplate().delete(user);
		
	}

	/** (non-Javadoc)
	 * @see dao.UserDao#findAll()
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAll()
	{
		return (List<User>) getHibernateTemplate().find("from User");
	}

	/** (non-Javadoc)
	 * @see dao.UserDao#findUserByName(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User findUserByName(String name)
	{
		String hql = "from User au where au.user = ?";
		List<User> resultList  = getHibernateTemplate().find(hql,name);
		//如果查询的结果不为空，而且个数大于一
		if ( (resultList != null) && (resultList.size() >= 1) )
		{
			return (User) resultList.get(0);
		}
		else
		{
			return null;
		}
			
	}

	/** (non-Javadoc)
	 * @see dao.UserDao#findUserByNameAndPass(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User findUserByNameAndPass(String user, String pass)
	{
		String hqlString = "from User au where au.username = ? and au.password = ?";
		List<User> list = getHibernateTemplate().find(hqlString, new String[]{user ,pass});
		if ( (list != null) && (list.size() >=1) )
		{
			return (User) list.get(0);
		}
		else
		{
			return null;
		}
	}

	
}
 
