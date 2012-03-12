package action;


import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:03:04
 * @since jdk1.6 
 * 要拍卖某个物品，将这个拍卖添加到拍卖栏目中
 */
@SuppressWarnings("serial")
public class AddBidAction extends BaseAction {
	/*包括物品的ID，拍卖价格，最大价格、最后还有提交的验证码*/
	private int itemId;
	private double bidPrice;
	private double maxPrice;
	private String vercode;
    
	/**
	 * getters &&setters
	 * */
	public AddBidAction() {
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}
    
	/***
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * @exception  有异常抛出
	 * action的执行方法，把要拍卖的东西添加到拍卖栏中
	 */
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		String ver2 = (String) session.get("rand");
		ver2 = ver2.toLowerCase();
		session.put("rand", null);
		if (vercode.toLowerCase().equals(ver2)) {
			mgr.addBid(userId.intValue(), itemId, bidPrice);
			return "success";
		} else {
			addActionError("验证码不匹配,请重新输入");
			return "input";
		}
	}
    
	/***
	 *  struts的验证
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	public void validate() {
		if (bidPrice <= maxPrice)
			addFieldError("bidPrice", "您输入的竞价必须是数字。");
	}
}
