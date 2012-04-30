package action; 

import action.base.BaseAction;
import model.Student;
import model.StudentClass;

/** 
 * 文件名：AddStudentAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-29 下午04:21:59 
 * @since jdk1.6
 * 添加学生信息，把前台输入的学生信息组装成一个对象，然后保存的数据库。
 */
public class AddStudentAction extends BaseAction
{
	/**
	 * 学号，防止相同的名称类冲突。
	 */
	private static final long serialVersionUID = 1L;
	/**姓名、性别、籍贯、电话等联系方式*/
	private String name;
	private String sex;
	private String address;
	private String tel;
	private String email;
	private String qq;
	/*班级信息，一个班级多个学生，一对多的关系*/
	private String studentClass;
	/**寝室号*/
	private String room;
	/**是否贫困，例如否，贫困，特困等情况*/
	private String poor;
	/**家庭联系人以及联系方式*/
	private String ralation;
	private String ralationTel;
	/**平均学分绩*/
	private String avaScore;
	/**违纪情况记录*/
	private String  discipline;
	/**逃课次数*/
	private String escClass;
	/**受惩罚情况*/
	private String fine;
	/**备注*/
	private String note;
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
	public String getStudentClass()
	{
		return studentClass;
	}
	public void setStudentClass(String studentClass)
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
	public String getAvaScore()
	{
		return avaScore;
	}
	public void setAvaScore(String avaScore)
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
	public String getEscClass()
	{
		return escClass;
	}
	public void setEscClass(String escClass)
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
	
	/**
	 * @return
	 */
	public Student generatStudent()
	{
		Student student = new Student();
		student.setName(name);
		student.setAddress(address);
		student.setAvaScore(Double.parseDouble(avaScore));
		student.setDiscipline(discipline);
		student.setEmail(email);
		student.setEscClass(Integer.parseInt(escClass));
		student.setFine(fine);
		student.setPoor(poor);
		
		student.setNote(note);
		student.setSex(sex);
		student.setRalation(ralation);
		student.setRalationTel(ralationTel);
		student.setQq(qq);
		student.setRoom(room);
		/**把通过查找到的班级属性输入到学生的信息中。这里出错了，先保存一下，下次再处理*/
		StudentClass stClass =mgr.findClassByName(studentClass);
		student.setStudentClass(stClass);
		return student;
	}
	/**
	 * action的核心方法，通过 (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute()
	{
		Student student = generatStudent();
		mgr.addStudent(student);
		return SUCCESS;
	}

}
 
