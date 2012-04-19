package dao.imp; 

import java.util.Iterator;
import java.util.List;

import model.StudentClass;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StudentClassDao;

/** 
 * 文件名：StudentClassDaoHibernate.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-18 下午03:29:54 
 * @since jdk1.6
 * 班级类的DAO操作实现类，函数的具体功能，参见Dao的生命
 */
public class StudentClassDaoHibernate extends HibernateDaoSupport implements StudentClassDao
{

	public boolean classExisted(StudentClass class1)
	{
		try
		{
			String queryString = "from StudentClass sc where sc.className = ? ";
			Query query = getSession().createQuery(queryString);
			//设置第一列是名称，即用这个变量代替hql中的？中的值
			query.setString(0, class1.getClassName());
			Iterator ite = query.list().iterator();
			//如果查询里面有结果，那么它就存在，我们要返回真
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

	public void delete(StudentClass studentClass)
	{
		getHibernateTemplate().delete(studentClass);
	}
	
	public void delete(int id)
	{
		getHibernateTemplate().delete(getHibernateTemplate().get(StudentClass.class, id));
	}

	public List<StudentClass> findAll()
	{
		return getHibernateTemplate().find("from StudentClass");
	}

	public StudentClass getStudentClass(int id)
	{
		return getHibernateTemplate().get(StudentClass.class, id);
	}

	public StudentClass getsStudentClass(String name)
	{
		String queryString = "from StudentClass as sc where sc.name = ?";
		List<StudentClass> resultlList =getHibernateTemplate().find(queryString,name);
		Iterator<StudentClass> iterator = resultlList.iterator();
		if(iterator.hasNext())
		{
			return (StudentClass)iterator.next();
		}
		return null;
	}

	public void save(StudentClass studentClass)
	{
		getHibernateTemplate().save(studentClass);
	}

	public void update(StudentClass studentClass)
	{
		getHibernateTemplate().saveOrUpdate(studentClass);
	}
}
 
