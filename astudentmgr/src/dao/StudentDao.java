package dao; 

import java.util.List;

import model.Student;

/** 
 * 文件名：StudentDao.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-15 上午11:18:52 
 * @since jdk1.6
 * 学生信息的DAO层接口
 */
public interface StudentDao
{
	/**
	 * 模块1：根据ID查找某个学生
	 * @param id 学生的编号
	 * @return  学生的信息
	 */
	Student getsStudent(int id);
	/**
	 * 
	 * 模块2：根据名字来查找学生
	 * @param name 学生的姓名
	 * @return 所有姓名为name的学生名字
	 */
	List<Student> getStudentByName(String name);
	
	/**
	 * 模块3：获得某个班级的所有学生的信息
	 * @param className
	 * @return 班级所有的学生信息
	 */
	List<Student>getClassStudents(String className);
	
	/**
	 * 模块4：添加学生信息
	 * @param student
	 */
	void save(Student student);
	/**
	 * 模块5：更新学生信息
	 * @param student
	 */
	void update(Student student);
	/**
	 * 模块6：删除某个学生的信息
	 * @param id
	 */
	void delete(int id);
	/**
	 * 删除学生的信息
	 * @param student
	 */
	void delete(Student student);
	/**
	 * 模块7：查找所有的学生信息
	 * @return 数据库中所有的学生信息
	 */
	List<Student> findAll();
}
 
