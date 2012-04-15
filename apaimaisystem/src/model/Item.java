package model; 

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/** 
 * 文件名：Item.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-12 下午03:28:23 
 * @since jdk1.6
 * 拍卖物品的名称
 */
public class Item
{

	private Integer id;    //注意此处用的是interger类
	private String itemRemark;//备注，卖家提供的商品信息
	private String itemName;
	private String itemDesc;  //商品的具体描述，使用字符串存放
	private Date addTime;    //商品添加的时间和截止时间
	private Date endTime;
	private Double initPrice;  
	private Double maxPrice;
	private AuctionUser owner;//商品的拥有者，即卖家
	private Kind kind;       
	private AuctionUser winer;
	private State itemState;
	//一个物品可能有多个拍卖者，所以这里是一对多的关系，此处没有在数据库中有印射。
	private Set<Bid> bids = new HashSet();
	
	/**
	 * getter &&setter
	 * */
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemRemark() {
		return itemRemark;
	}
	public void setItemRemark(String itemRemark) {
		this.itemRemark = itemRemark;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Double getInitPrice() {
		return initPrice;
	}
	public void setInitPrice(Double initPrice) {
		this.initPrice = initPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public AuctionUser getOwner() {
		return owner;
	}
	public void setOwner(AuctionUser owner) {
		this.owner = owner;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	public AuctionUser getWiner() {
		return winer;
	}
	public void setWiner(AuctionUser winer) {
		this.winer = winer;
	}
	public State getItemState() {
		return itemState;
	}
	public void setItemState(State itemState) {
		this.itemState = itemState;
	}
	public Date getAddtime() {
		// TODO Auto-generated method stub
		return addTime;
	}
	public Date getEndtime() {
		// TODO Auto-generated method stub
		return endTime;
	}
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
}
 
