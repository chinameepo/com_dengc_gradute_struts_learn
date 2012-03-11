package com.hib;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hib.util.HibernateUtil;

import antlr.collections.List;

/**
 * All right Rserved Dengc2011
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-11-18 下午6:08:40
 * @since jdk1.6 测试操作hibernate，插入一个对象。
 */
public class Test extends HibernateUtil
{
	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 测试三个操作：查询指定的ID,插入信息，条件查询
	 * @param args
	 */
	public static void main(String[] args) {
		Test test =new Test();
		//先查看第九个学生的信息
		test.getsStudent(9);
		test.insertStudent("邓CCC", "hua wei ", "wuths");
		test.query();
	}
	

	/**
	 * 通过制定的ID查询制定的学生是否在数据库中
	 * 
	 * @param id 学生在数据库中的ID
	 * @return  返回查询对象，可能为空
	 */
	public Student getsStudent(int id)
	{
		Session session = getSession();
		Student student = (Student) session.get(Student.class, id);
		if (student != null)
		{
			logger.info("info: id =" + student.getId() + " ,name= "
					+ student.getName() + "company= ," + student.getCompany());
			session.close();
			return student;
		}
		else
		{
			session.close();
			return null;
		}
	}
	public void query()
	{
		Session session = getSession();
		//开始条件查询
		Criteria criteria = session.createCriteria(Student.class);
		//添加条件，eq是等于，gt是大于，lt是小于,or是或
		criteria.add(Restrictions.lt("id", 50));
		java.util.List list = criteria.list();
		//遍历查询结果
		for (Iterator iterator =list.iterator();iterator.hasNext(); )
		{
			Student stu = (Student) iterator.next();
			logger.info("id ="+stu.getId()+",name ="+stu.getName());
		}
	}

	/**
	 * 插入一个对象到数据库中
	 * 
	 * @param name
	 *            学生的姓名
	 * @param company
	 *            学生的公司
	 * @param school
	 *            所在学校
	 */
	public void insertStudent(String name, String company, String school)
	{
		// 新建一个对象
		Student student = new Student();
		student.setName(name);
		student.setCompany(company);
		student.setSchool(school);
		// 开始利用hibernate的工程会话来操作数据库
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}
}
