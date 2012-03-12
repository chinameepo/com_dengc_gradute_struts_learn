package action;

import java.util.List;
import java.util.Map;

import action.base.BaseActionInterface;

import com.opensymphony.xwork2.ActionContext;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:06:50
 * @since jdk1.6 管理物品的类
 */

public class MgrItemAction extends BaseActionInterface {
	private List items;
	private List kinds;

	
    public MgrItemAction(){
    	
    }
	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

	public List getKinds() {
		return kinds;
	}

	public void setKinds(List kinds) {
		this.kinds = kinds;
	}

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		setItems(mgr.getItemsByOwner(userId.intValue()));
		setKinds(mgr.getAllKind());
		return "success";
	}
}
