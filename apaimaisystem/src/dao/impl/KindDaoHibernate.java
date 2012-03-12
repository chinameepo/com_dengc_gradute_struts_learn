package dao.impl; 

import java.util.List;

import model.Kind;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.KindDao;


/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午7:48:39 
 * @since jdk1.6
 * 关于与物品类别的hibernate操作类
 */
public class KindDaoHibernate extends HibernateDaoSupport
implements KindDao{
	 public void delete(Integer id)
	  {
	    getHibernateTemplate().delete(getHibernateTemplate().get(Kind.class, id));
	  }

	  public void delete(Kind kind)
	  {
	    getHibernateTemplate().delete(kind);
	  }

	  @SuppressWarnings("unchecked")
	public List<Kind> findAll()
	  {
	    return getHibernateTemplate().find("from Kind");
	  }

	  public Kind get(Integer id)
	  {
	    return ((Kind)getHibernateTemplate().get(Kind.class, id));
	  }

	  public void save(Kind kind)
	  {
	    getHibernateTemplate().save(kind);
	  }

	  public void update(Kind kind)
	  {
	    getHibernateTemplate().saveOrUpdate(kind);
	  }

}
 
