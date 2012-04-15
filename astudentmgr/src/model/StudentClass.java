package model; 

import java.util.Set;

/** 
 * 文件名：Class.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-14 下午12:43:25 
 * @since jdk1.6
 * 班级的类，包括班级、专业、人数、等信息。
 */
public class StudentClass
{
	/*班级名称，例如广告0604*/
	private String className;
	/*班级总人数*/
	private int sum;
	/*班级教室，如果没有的话可以不用管。班级专业，没有的话也可以不写*/
	private String classroom;
	private String major;
	/*班主任姓名*/
	private String teacher;
	/*班长姓名和联系方式*/
	private String monitor;
	private String monitorTel;
	/**这里是一对多的关系，一个班级可以有多个学生*/
	private Set<Student>students;
	
}
 
