package bisiness;

import java.io.Serializable;
import java.util.Date;

/**
 * All right Rserved Dengc2011
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-12-27 上午11:20:17
 * @since jdk1.6 物品
 */
public class ItemBean implements Serializable {
	private Integer id;
	private String name;
	private String desc;
	private String remark;
	private String kind;
	private String owner;
	private String winer;
	private String state;
	private double initPrice;
	private double maxPrice;
	private Date addTime;
	private Date endTime;

	public ItemBean() {
	}

	public ItemBean(Integer id, String name, String desc, String remark,
			String kind, String owner, String winer, String state,
			double initPrice, double maxPrice, Date addTime, Date endTime) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.remark = remark;
		this.kind = kind;
		this.owner = owner;
		this.winer = winer;
		this.state = state;
		this.initPrice = initPrice;
		this.maxPrice = maxPrice;
		this.addTime = addTime;
		this.endTime = endTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getWiner() {
		return this.winer;
	}

	public void setWiner(String winer) {
		this.winer = winer;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getInitPrice() {
		return this.initPrice;
	}

	public void setInitPrice(double initPrice) {
		this.initPrice = initPrice;
	}

	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
