package dao.imp; 

import java.util.List;

import model.Course;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.CourseDao;

/** 
 * 文件名：CourceDaohiHernate.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-17 下午03:35:32 
 * @since jdk1.6
 * 课程类的hibernateDAO的实现,功能注释详细查看CourceDao
 */
public class CourseDaohiHernate extends HibernateDaoSupport implements CourseDao
{
	public void delete(int id)
	{
		getHibernateTemplate().delete(getHibernateTemplate().get(Course.class, id));
		
	}

	public void delete(Course course)
	{
		getHibernateTemplate().delete(course);
	}

	public List<Course> findAll()
	{
		return getHibernateTemplate().find("from Cource");
	}

	public Course findCourseByName(String nameString)
	{
		String hqlString = "from Course as c where c.name = ";
		return (Course) getHibernateTemplate().find(hqlString,nameString);
	}

	@SuppressWarnings("unchecked")
	public List<Course> findCoursesByTeacher(String teacherName)
	{
		String hqlString = "from Course as c where c.name = ? ";
		return  getHibernateTemplate().find(hqlString,teacherName);
	}

	public Course getcCourse(int id)
	{
		return ((Course)getHibernateTemplate().get(Course.class, id));
	}

	public void save(Course course)
	{
		getHibernateTemplate().save(course);
		
	}

	public void update(Course course)
	{
		getHibernateTemplate().saveOrUpdate(course);
	}

}
 
