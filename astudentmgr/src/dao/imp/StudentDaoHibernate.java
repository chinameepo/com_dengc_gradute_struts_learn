package dao.imp; 

import java.util.List;

import model.Student;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StudentDao;

/** 
 * 文件名：StudentDaoHibernate.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-18 下午03:23:08 
 * @since jdk1.6
 * 学生实体的操作实现类，继承了DAO类的方法 ，具体注释和功能，参见DAO接口
 */
public class StudentDaoHibernate extends HibernateDaoSupport implements StudentDao
{

	public void delete(int id)
	{
		getHibernateTemplate().delete(getHibernateTemplate().get(Student.class, id));
	}

	public void delete(Student student)
	{
		getHibernateTemplate().delete(student);
	}

	public List<Student> findAll()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getClassStudents(String className)
	{
		return getHibernateTemplate().find("from Student");
	}

	public List<Student> getStudentByName(String name)
	{
		String queryString = "from Student as st where st.name = ?";
		return getHibernateTemplate().find(queryString, name);
	}

	public Student getsStudent(int id)
	{
		return getHibernateTemplate().get(Student.class, id);
	}

	public void save(Student student)
	{
		getHibernateTemplate().save(student);
	}

	public void update(Student student)
	{
		getHibernateTemplate().saveOrUpdate(student);
	}
}
 
