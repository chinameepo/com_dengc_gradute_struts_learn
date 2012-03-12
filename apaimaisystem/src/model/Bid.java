package model; 

import java.util.Date;

/** 
 * 文件名：Bid.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-12 下午03:31:18 
 * @since jdk1.6
 * 拍卖类
 */
public class Bid
{
	/*
	 * 包括竞拍给出的价格、竞拍的时间、竞拍的物品、竞拍用户等5个变量
	 * */
	private Integer id;
	private Double bidPrice;
	private Date bidDate;
	//数据库中，使用物品的ID来表示
	private Item bidItem;
	//用户名
	private AuctionUser  bidUser;
	
	/**
	 * getter && setter方法
	 * */
	
	public Double getBidPrice() {
		return bidPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	public Date getBidDate() {
		return bidDate;
	}
	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}
	public Item getBidItem() {
		return bidItem;
	}
	public void setBidItem(Item bidItem) {
		this.bidItem = bidItem;
	}
	public AuctionUser getBidUser() {
		return bidUser;
	}
	public void setBidUser(AuctionUser bidUser) {
		this.bidUser = bidUser;
	}

}
 
