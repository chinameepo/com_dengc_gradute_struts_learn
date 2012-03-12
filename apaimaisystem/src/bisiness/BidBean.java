package bisiness; 
import java.io.Serializable;
import java.util.Date;
/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午7:53:33 
 * @since jdk1.6
 * 类说明 
 */
public class BidBean implements Serializable{
	 private int id;
	  private String user;
	  private String item;
	  private double price;
	  private Date bidDate;

	  public BidBean(int id, String user, String item, double price, Date bidDate)
	  {
	    this.id = id;
	    this.user = user;
	    this.item = item;
	    this.price = price;
	    this.bidDate = bidDate;
	  }

	  public BidBean() {
	  }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getBidDate() {
		return bidDate;
	}

	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}
}
 
