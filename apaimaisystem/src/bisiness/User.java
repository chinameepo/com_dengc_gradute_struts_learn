package bisiness; 

import model.Item;



/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午5:30:20 
 * @since jdk1.6
 * 用户类
 */
public class User {
	private String username;
	  private String password;
	  private String mobile;
	  private Item item = new Item();

	  public String getUsername()
	  {
	    return this.username;
	  }

	  public void setUsername(String username)
	  {
	    this.username = username;
	  }

	  public String getPassword()
	  {
	    return this.password;
	  }

	  public void setPassword(String password)
	  {
	    this.password = password;
	  }

	  public String getMobile()
	  {
	    return this.mobile;
	  }

	  public void setMobile(String mobile)
	  {
	    this.mobile = mobile;
	  }

	  public Item getItem() {
	    return this.item;
	  }

	  public void setItem(Item item) {
	    this.item = item;
	  }

}
 
