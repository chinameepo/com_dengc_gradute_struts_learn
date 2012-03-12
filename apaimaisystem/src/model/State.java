package model; 

import java.util.HashSet;
import java.util.Set;



/** 
 * 文件名：State.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-12 下午03:30:45 
 * @since jdk1.6
 * 物品的状态类
 */
public class State
{
	private Integer id;
	private String stateName;
	 private Set<Item> items = new HashSet();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
 
