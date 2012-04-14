package model; 
/** 
 * 文件名：score.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-14 下午12:44:08 
 * @since jdk1.6
 * 学生考试成绩记载，包括课程名、学生学号、成绩等信息 
 */
public class Score
{
	/**
	 * 属性包括学生姓名、课程名、学期、最后得分*/
	private Student student;
	private Course course;
	private String term;
	private double score;
	
	public Student getStudent()
	{
		return student;
	}
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course = course;
	}
	public String getTerm()
	{
		return term;
	}
	public void setTerm(String term)
	{
		this.term = term;
	}
	public double getScore()
	{
		return score;
	}
	public void setScore(double score)
	{
		this.score = score;
	}
}
 
