package dao; 

import java.util.List;

import model.Course;

/** 
 * 文件名：CourceDao.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-15 上午11:18:34 
 * @since jdk1.6
 * 课程的DAO接口
 */
public interface CourseDao
{
	/**
	 * 模块一：获得指定ID的课程
	 * @param id
	 * @return
	 */
	Course getcCourse(int id);
	/**
	 * 通过课程名称查找课程
	 * @param nameString 课程的名字
	 * @return 指定名字的课程
	 */
	Course findCourseByName(String nameString);
	/**
	 * 通过任课老师的名字来查找课程
	 * @param teacherName 任课老师的名字
	 * @return 任课老师所教授的所有课程
	 */
	List<Course> findCoursesByTeacher(String teacherName);
	/**
	 * 模块2：添加课程
	 * @param course
	 */
	void save(Course course);
	/**
	 * 模块3：修改课程信息
	 * @param course
	 */
	void update(Course course );
	/**
	 * 模块5：删除课程
	 * @param id
	 */
	void delete(int id);
	/**
	 * 删除课程
	 * @param course
	 */
	void delete(Course course);
	/**
	 * 模块6：查找所有的课程
	 * @return 所有的课程列表
	 */
	List<Course> findAll();

}
 
