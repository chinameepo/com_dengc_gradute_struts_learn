package model; 
/** 
 * 文件名：Course.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-14 下午12:43:35 
 * @since jdk1.6
 * 课程类，包括课程名、老师、教材、教室、上课时间等
 */
public class Course
{
	/**
	 * 属性包括
	 * 课程名、老师、教材、教室、时间，备注
	 * */
	private String name;
	private String teacher;
	private String book;
	private String classroom;
	private String time;
	private String note;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getTeacher()
	{
		return teacher;
	}
	public void setTeacher(String teacher)
	{
		this.teacher = teacher;
	}
	public String getBook()
	{
		return book;
	}
	public void setBook(String book)
	{
		this.book = book;
	}
	public String getClassroom()
	{
		return classroom;
	}
	public void setClassroom(String classroom)
	{
		this.classroom = classroom;
	}
	public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	public String getNote()
	{
		return note;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
	

}
 
