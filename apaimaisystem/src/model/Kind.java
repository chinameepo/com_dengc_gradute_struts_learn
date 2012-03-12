package model; 

import java.util.HashSet;
import java.util.Set;

/** 
 * 文件名：Kind.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-12 下午03:29:29 
 * @since jdk1.6
 * 物品的类别
 */
public class Kind
{
	//主属性，编号
	private Integer id;
	private String kindName;
	//对类别的具体描述，比如日用品的范围规定、注意事项等等
	private String kindDesc;
	private Set<Item> items = new HashSet();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKindName() {
		return kindName;
	}
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	public String getKindDesc() {
		return kindDesc;
	}
	public void setKindDesc(String kindDesc) {
		this.kindDesc = kindDesc;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
 
