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
	private Course course;
	private String term;
	private double score;
	/*这里是多对一的关系，多个成绩对应一个学生，一个学生拥有多个成绩*/
	private Student student;
	
	
}
 
