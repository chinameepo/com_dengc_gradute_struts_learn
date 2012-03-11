package com.hib; 
/** 
 * All right Rserved Dengc2011
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-11-18 下午6:06:15 
 * @since jdk1.6
 * 一个实体类，就是一个hibernate对象，通过印射文件，印射成数据库中的数据，它就是一个POJO
 */
public class Student {
	int id;
	String name;
	String company;
	String school;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
 
