package dao;

import java.util.List;

import model.StudentClass;

/**
 * 文件名：StudentClassDao.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-15 上午11:19:01
 * @since jdk1.6 班级的DAO层操作接口，对班级进行增删改查询
 */
public interface StudentClassDao
{
	/**
	 * 模块1：获得班级对象
	 * 
	 * @param id
	 *            班级的ID
	 * @return 要查找的班级对象
	 */
	StudentClass getStudentClass(int id);

	/**
	 * @param name
	 *            班级的名字
	 * @return 要查找的班级对象
	 */
	StudentClass getsStudentClass(String name);

	/**
	 * 模块2：添加班级
	 * 
	 * @param studentClass
	 */
	void save(StudentClass studentClass);

	/**
	 * 模块3：修改班级信息
	 * 
	 * @param studentClass
	 */
	void update(StudentClass studentClass);

	/**
	 * 模块4：删除班级信息
	 * 
	 * @param studentClass
	 */
	void delete(StudentClass studentClass);
	void delete(int id);

	/**
	 * 模块5：查找所有的班级信息
	 * 
	 * @return 所有的班级信息
	 */
	List<StudentClass> findAll();
	
	/**
	 * 模块6：查看班级是否存在，用于添加班级。
	 * @param class1 要添加的班级
	 * @return  查询的结果，这个班级是存在还是不存在
	 */
	boolean classExisted(StudentClass class1);

}
