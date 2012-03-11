package com.hib; 

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import antlr.collections.List;

/** 
 * All right Rserved Dengc2011
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-11-18 下午6:08:40 
 * @since jdk1.6
 * 测试操作hibernate，插入一个对象。
 */
public class Test {
	public static void main(String[] args) {
		Test test =new Test();
		test.getsStudent(9);
		//新建一个对象
		/*Student student = new Student();
		student.setId(1108);
		student.setName("看看");
		student.setCompany("黎杰");
		student.setSchool("武汉理工大学");*/
		//开始利用hibernate的工程回话来操作数据库
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory =configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		//session.save(student);
		
		//开始条件查询
		Criteria criteria = session.createCriteria(Student.class);
		//eq是等于，gt是大于，lt是小于,or是或
		criteria.add(Restrictions.lt("id", 50));
		java.util.List list = criteria.list();
		//遍历查询结果
		for (Iterator iterator =list.iterator();iterator.hasNext(); )
		{
			Student stu = (Student) iterator.next();
			System.out.println("id ="+stu.getId()+",name ="+stu.getName());
		}
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}
	public Student getsStudent(int id){
		Configuration configuration = new Configuration();
		SessionFactory sessionFactory =configuration.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Student student =(Student) session.get(Student.class,id);
		System.out.println("info: id ="+student.getId()+" ,name= "+student.getName()+"company= ,"+student.getCompany());
	    return student;
	}
}
 
