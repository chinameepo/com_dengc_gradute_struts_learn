package dao.imp; 

import java.util.List;

import model.Score;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ScoreDao;

/** 
 * 文件名：ScoreDaoHibernate.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-17 下午04:50:11 
 * @since jdk1.6
 * 成绩的DAO实现类，具体注释和功能，查看DAO的解释.
 * 只要获得HibernateTemplate对象，即可完成对数据库对象的所有操作
 */
public class ScoreDaoHibernate extends HibernateDaoSupport implements ScoreDao
{

	public void delete(int id)
	{
		getHibernateTemplate().delete(getHibernateTemplate().get(Score.class, id));
		
	}

	public void delete(Score score)
	{
		getHibernateTemplate().delete(score);
	}

	public List<Score> findByStudent(int studentId)
	{
		String hql = "from Score as s where s.studentId = ?";
		return getHibernateTemplate().find(hql ,studentId);
	}

	public Score getsScore(int id)
	{
		return getHibernateTemplate().get(Score.class, id);
	}

	public void save(Score score)
	{
		getHibernateTemplate().save(score);
		
	}

	public void update(Score score)
	{
		getHibernateTemplate().saveOrUpdate(score);
	}
}
 
