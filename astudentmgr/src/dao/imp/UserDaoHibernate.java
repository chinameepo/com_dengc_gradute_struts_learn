package dao.imp;

import java.util.Iterator;
import java.util.List;

import model.User;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.opensymphony.xwork2.Result;

import dao.UserDao;

/**
 * 文件名：UserDaoHibernate.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-17 下午03:07:55
 * @since jdk1.6 系统注册用户的操作dao，实现类。用鼠标移动到方法的名称上，即可看到注释
 */
public class UserDaoHibernate extends HibernateDaoSupport implements UserDao
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#delete(int)
	 */
	public void delete(int id)
	{
		getHibernateTemplate().delete(
				getHibernateTemplate().get(User.class, id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#delete(model.User)
	 */
	public void delete(User user)
	{
		getHibernateTemplate().delete(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#findAll()
	 */
	public List<User> findAll()
	{
		/* 在HQL中，from 某个表，代表查询表中所有内容 */
		return getHibernateTemplate().find("from User");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#finduUserByNameAndPass(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	public User findUserByNameAndPass(String username, String password,
			String type)
	{
		// 先设置一个字符串数组，存放变量名
		String[] args =
			{ username, password, type };
		List<User> resultlList = getHibernateTemplate()
				.find(
						"from User as user where user.username = ? and user.password = ? and user.type = ?",
						args);
		if (1 == resultlList.size())
		{
			return (User) resultlList.get(0);
		}
		return null;
	}

	/**
	 * 模块:根据用户的ID来查找用户
	 * 
	 * @param id
	 *            用户的ID编号
	 * @return 用户的对象
	 */
	public User getUser(int id)
	{
		return (User) getHibernateTemplate().get(User.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#save(model.User)
	 */
	public void save(User user)
	{
		getHibernateTemplate().save(user);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#update(model.User)
	 */
	public void update(User user)
	{
		getHibernateTemplate().saveOrUpdate(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UserDao#userExited(model.User)
	 */
	public boolean userExited(User user)
	{
		try
		{
			String queryString = "from User u where u.username = ? and u.userpass = ? and u.type = ?";
			Query query = getSession().createQuery(queryString);
			query.setString(0, user.getUsername());
			query.setString(1, user.getPassword());
			query.setString(2, user.getType());
			Iterator ite = query.list().iterator();
			if (ite.hasNext())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (RuntimeException re)
		{
			re.printStackTrace();
			return false;
		}
	}

}
