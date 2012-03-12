package action;

import java.util.List;

import action.base.BaseAction;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:09:50
 * @since jdk1.6 查看自己的拍卖物品
 */
public class ViewItemAction extends BaseAction {
	private int kindId;
	private String kind;
	private List items;

	public ViewItemAction() {
	}

	public int getKindId() {
		return kindId;
	}

	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

	public String execute() throws Exception {
		if (kindId <= 0) {
			addActionError("验证码不匹配,请重新输入");
			return "error";
		} else {
			setKind(mgr.getKind(kindId));
			setItems(mgr.getItemsByKind(kindId));
			return "success";
		}
	}

}
