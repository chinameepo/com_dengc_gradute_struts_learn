package model; 

import java.util.HashSet;
import java.util.Set;

import javassist.expr.NewArray;

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
	private int id;
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
	private Set<Student>students = new HashSet<Student>();
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getClassName()
	{
		return className;
	}
	public void setClassName(String className)
	{
		this.className = className;
	}
	public int getSum()
	{
		return sum;
	}
	public void setSum(int sum)
	{
		this.sum = sum;
	}
	public String getClassroom()
	{
		return classroom;
	}
	public void setClassroom(String classroom)
	{
		this.classroom = classroom;
	}
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public String getTeacher()
	{
		return teacher;
	}
	public void setTeacher(String teacher)
	{
		this.teacher = teacher;
	}
	public String getMonitor()
	{
		return monitor;
	}
	public void setMonitor(String monitor)
	{
		this.monitor = monitor;
	}
	public String getMonitorTel()
	{
		return monitorTel;
	}
	public void setMonitorTel(String monitorTel)
	{
		this.monitorTel = monitorTel;
	}
	public Set<Student> getStudents()
	{
		return students;
	}
	public void setStudents(Set<Student> students)
	{
		this.students = students;
	}
	
	
	
}
 
