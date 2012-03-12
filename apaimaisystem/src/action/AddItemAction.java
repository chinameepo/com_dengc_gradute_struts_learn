package action;

import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:05:00
 * @since jdk1.6 
 * 添加一个物品
 */
@SuppressWarnings("serial")
public class AddItemAction extends BaseAction {
	/**添加的物品属性。包括物品的名称、描述、备注、初始价格、是否可行、类别
	 * 最后还有验证码
	 * */
	private String name;
	private String desc;
	private String remark;
	private double initPrice;
	private int avail;
	private int kind;
	private String vercode;

	public AddItemAction() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public double getInitPrice() {
		return initPrice;
	}

	public void setInitPrice(double initPrice) {
		this.initPrice = initPrice;
	}

	public int getAvail() {
		return avail;
	}

	public void setAvail(int avail) {
		this.avail = avail;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		@SuppressWarnings("rawtypes")
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		ver2 = ver2.toLowerCase();
		session.put("rand", null);
		Integer userId = (Integer) session.get("userId");
		if (vercode.toLowerCase().equals(ver2)) {
			switch (avail) {
			case 6: // '\006'
				avail = 7;
				break;

			case 7: // '\007'
				avail = 30;
				break;

			case 8: // '\b'
				avail = 365;
				break;
			}
			mgr.addItem(name, desc, remark, initPrice, avail, kind,
					userId.intValue());
			return "success";
		} else {
			addActionError("验证码不匹配，请重新输入");
			return "input";
		}
	}

}
