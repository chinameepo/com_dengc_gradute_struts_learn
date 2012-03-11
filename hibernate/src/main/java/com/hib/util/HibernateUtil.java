package com.hib.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 文件名：HibernateUtil.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-11 上午10:38:18
 * @since jdk1.6 因为每次运行都要产生session对象，所以可以通过工厂来产生工厂对象。
 */
public class HibernateUtil
{
	// 这样继承这个类的子类都可以直接获得session，而不用每次都要调用configure等操作。
	private static SessionFactory sessionFactory;

	/**
	 * 默认的构造方法，不要放入参数
	 */
	public HibernateUtil()
	{

	}

	/**
	 * 下面这个才是重点，它是在初始化的时候，肯定会运行的代码段，所以肯定会被执行。多个子类共享一个seesionfactory
	 * */
	static
	{
		Configuration configuration = new Configuration();
		sessionFactory = configuration.configure().buildSessionFactory();
	}

	/**
	 * 获得sesion对象,这个才是最终的目的。
	 * */
	public static Session getSession()
	{
		return sessionFactory.openSession();
	}

	/**
	 * getter&&setter方法
	 * 
	 * @return
	 */
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory)
	{
		HibernateUtil.sessionFactory = sessionFactory;
	}

}
