package service.imp; 

import java.util.List;

import model.Student;
import model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;

import service.StudentManager;

import dao.CourseDao;
import dao.ScoreDao;
import dao.StudentClassDao;
import dao.StudentDao;
import dao.UserDao;
import exception.StudentmgrException;

/** 
 * 文件名：StudentManagerImpl.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-19 下午04:22:37 
 * @since jdk1.6
 * 业务逻辑的实现类，里面包含了所有的业务逻辑的操作
 */
/**
 * @author Administrator
 *
 */
public class StudentManagerImpl implements StudentManager
{
	private Logger logger = LoggerFactory.getLogger(StudentManagerImpl.class);
	private StudentDao studentDao;
	private StudentClassDao studentClassDao;
	private UserDao userDao;
	private CourseDao courseDao;
	private ScoreDao scoreDao;
	/**
	 * getter && setter 
	 * */
	public Logger getLogger()
	{
		return logger;
	}
	public void setLogger(Logger logger)
	{
		this.logger = logger;
	}
	public StudentDao getStudentDao()
	{
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}
	public StudentClassDao getStudentClassDao()
	{
		return studentClassDao;
	}
	public void setStudentClassDao(StudentClassDao studentClassDao)
	{
		this.studentClassDao = studentClassDao;
	}
	public UserDao getUserDao()
	{
		return userDao;
	}
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	public CourseDao getCourseDao()
	{
		return courseDao;
	}
	public void setCourseDao(CourseDao courseDao)
	{
		this.courseDao = courseDao;
	}
	public ScoreDao getScoreDao()
	{
		return scoreDao;
	}
	public void setScoreDao(ScoreDao scoreDao)
	{
		this.scoreDao = scoreDao;
	}
	
	/**
	 * 添加学生信息
	 * @param student
	 * @return
	 */
	public int addStudent(Student student)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 注册添加系统用户
	 * @param username
	 * @param password
	 * @param type
	 * @return
	 * @throws StudentmgrException
	 */
	public int addUser(String username, String password, String type)
			throws StudentmgrException
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 按照学号查找学生信息
	 * @param id
	 * @return
	 */
	public Student findStuById(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 按照姓名查找学生信息
	 * @param name
	 * @return
	 */
	public List<Student> findStuByName(String name)
	{
		
		return null;
	}
	
	/** 
	 * 登陆验证
	 * (non-Javadoc)
	 * @see service.StudentManager#validateLogin(java.lang.String, java.lang.String, java.lang.String)
	 */
	public User validateLogin(String username, String password, String type)
			throws StudentmgrException
	{
		try
		{
			User user =userDao.findUserByNameAndPass(username, password, type);
			if(null == user)
			{
				return null;
			}
			ActionContext.getContext().getSession().put("userName", user.getUsername());
			return user;
		}
		catch (Exception e)
		{
			logger.error(e.getMessage());
			e.printStackTrace();
			throw new StudentmgrException("用户登录出现异常,请重新登陆。");
		}
	}
	
	
	

}
 
