package model; 

import java.util.HashSet;
import java.util.Set;



/** 
 * 文件名：AuctionUser.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-12 下午03:26:55 
 * @since jdk1.6
 * 一个拍卖系统中，注用户的模型，映射到hibernate中
 */
public class AuctionUser
{
	// 标识属性
	private Integer id;
	// 用户名属性
	private String username;
	// 密码属性
	private String userpass;
	// 电子邮件属性
	private String email;
	// 手机属性
	private String mobile;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Item> itemsByOwner = new HashSet();
	private Set<Item> itemsByWiner = new HashSet();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<Bid> bids = new HashSet();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Item> getItemsByOwner() {
		return itemsByOwner;
	}

	public void setItemsByOwner(Set<Item> itemsByOwner) {
		this.itemsByOwner = itemsByOwner;
	}

	public Set<Item> getItemsByWiner() {
		return itemsByWiner;
	}

	public void setItemsByWiner(Set<Item> itemsByWiner) {
		this.itemsByWiner = itemsByWiner;
	}

	public Set<Bid> getBids() {
		return bids;
	}

	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

}
 
