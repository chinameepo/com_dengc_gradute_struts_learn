package dao.impl;

import java.util.Iterator;
import java.util.List;

import model.AuctionUser;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.AuctionUserDao;


public class AuctionUserDaoHibernate extends HibernateDaoSupport implements
		AuctionUserDao {

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(
				getHibernateTemplate().get(AuctionUser.class, id));
	}

	public void delete(AuctionUser user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

	/**
	 * 查询全部用户
	 * 
	 * @return 获得全部用户
	 */
	public List<AuctionUser> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from AuctionUser");
	}

	/**
	 * 根据用户名，密码查找用户
	 * 
	 * @param username
	 *            查询所需的用户名
	 * @param pass
	 *            查询所需的密码
	 * @return 对应的用户
	 */
	public AuctionUser findUserByNameAndPass(String username, String pass) {
		// TODO Auto-generated method stub
		String[] args = { username, pass };
		List ul = getHibernateTemplate()
				.find(
						"from AuctionUser as au where au.username = ? and au.userpass = ?",
						args);
		if (ul.size() == 1) {
			return (AuctionUser) ul.get(0);
		}
		return null;
	}

	/*
	 * 模块4 (non-Javadoc)
	 * 
	 * @see com.cwq.dao.AuctionUserDao#get(java.lang.Integer)
	 */
	public AuctionUser get(Integer id) {
		// TODO Auto-generated method stub
		 return ((AuctionUser)getHibernateTemplate().get(AuctionUser.class, id));
	  
	}

	public void save(AuctionUser user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);

	}

	public void update(AuctionUser user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(user);

	}

	public boolean userExsited(AuctionUser user) {
		try {
			String queryString = "from AuctionUser au where au.username = ? and au.userpass = ?";
			Query query = getSession().createQuery(queryString);
			query.setString(0, user.getUsername());
			query.setString(1, user.getUserpass());
			Iterator ite = query.list().iterator();
			if (ite.hasNext()) {
				return true;
			} else {
				return false;
			}
		} catch (RuntimeException re) {
			re.printStackTrace();
			return false;
		}
	}

}
