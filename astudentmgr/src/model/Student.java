package model; 
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
	/**班级信息，一个班级多个学生，一对多的关系*/
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
	 * getter && setter方法
	 * */
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getQq()
	{
		return qq;
	}
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	public StudentClass getStudentClass()
	{
		return studentClass;
	}
	public void setStudentClass(StudentClass studentClass)
	{
		this.studentClass = studentClass;
	}
	public String getRoom()
	{
		return room;
	}
	public void setRoom(String room)
	{
		this.room = room;
	}
	public String getPoor()
	{
		return poor;
	}
	public void setPoor(String poor)
	{
		this.poor = poor;
	}
	public String getRalation()
	{
		return ralation;
	}
	public void setRalation(String ralation)
	{
		this.ralation = ralation;
	}
	public String getRalationTel()
	{
		return ralationTel;
	}
	public void setRalationTel(String ralationTel)
	{
		this.ralationTel = ralationTel;
	}
	public double getAvaScore()
	{
		return avaScore;
	}
	public void setAvaScore(double avaScore)
	{
		this.avaScore = avaScore;
	}
	public String getDiscipline()
	{
		return discipline;
	}
	public void setDiscipline(String discipline)
	{
		this.discipline = discipline;
	}
	public int getEscClass()
	{
		return escClass;
	}
	public void setEscClass(int escClass)
	{
		this.escClass = escClass;
	}
	public String getFine()
	{
		return fine;
	}
	public void setFine(String fine)
	{
		this.fine = fine;
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
 
