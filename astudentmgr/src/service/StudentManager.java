package service; 

import java.util.List;

import exception.StudentmgrException;
import model.Student;
import model.User;



/** 
 * 文件名：StudentManager.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-18 下午04:21:04 
 * @since jdk1.6
 * 业务逻辑接口,调用DAO层的组件，指定业务逻辑的流程
 */
public interface StudentManager
{
	/**
	 * 模块一：登陆验证框架，根据用户名和密码验证登陆是否成功。
	 * @param username 用户名
	 * @param password 密码
	 * @param type     用户类型
	 * @return  用户
	 */
	public User validateLogin(String username, String password, String type)throws StudentmgrException;
	
	/**
	 * 模块2：注册系统用户
	 * @param username 用户名
	 * @param password 密码
	 * @param type   类型
	 * @return  新用户获得的ID
	 */
	public int addUser(String username ,String password , String type)throws StudentmgrException;
	
	/**
	 * 模块2：根据编号查找学生
	 * @param id 学生的编号
	 * @return 查询的结果
	 */
	public Student findStuById(int id);
	/**模块2：根据姓名查找学生信息
	 * 根据学生姓名查找学生，因为有可能有同名的学生，所以这里用LIST来存储
	 * @param name 学生姓名
	 * @return 该姓名的学生
	 */
	public List<Student> findStuByName(String name);
	/**
	 * @param student
	 * @return
	 */
	public int addStudent(Student student);

}
 
