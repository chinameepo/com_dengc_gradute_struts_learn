package model; 

import java.util.Set;

/** 
 * 文件名：Student.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-14 下午12:43:43 
 * @since jdk1.6
 * 学生具体信息和档案，学号，班级，姓名，性别等所有信息。
 */
public class Student
{
	/**姓名、性别、籍贯、电话等联系方式*/
	private String name;
	private String sex;
	private String address;
	private String tel;
	private String email;
	private String qq;
	/*班级信息，一个班级多个学生，一对多的关系*/
	private StudentClass studentClass;
	/**寝室号*/
	private String room;
	/**是否贫困，例如否，贫困，特困等情况*/
	private String poor;
	/**家庭联系人以及联系方式*/
	private String ralation;
	private String ralationTel;
	/**平均学分绩*/
	private double avaScore;
	/**违纪情况记录*/
	private String  discipline;
	/**逃课次数*/
	private int escClass;
	/**受惩罚情况*/
	private String fine;
	/**备注*/
	private String note;
	
	/**
	 * 多对多的关系，多个学生对应多个课程*/
	private Set<Course>courses;
	/**一对多的关系，一个学生有多个成绩*/
	private Set<Score>scores;
	/**
	 * getter && setter方法
	 * */
	
	
}
 
