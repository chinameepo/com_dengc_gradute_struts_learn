package action;

import java.util.List;
import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:08:13
 * @since jdk1.6 查看拍賣
 */
@SuppressWarnings("rawtypes")
public class ViewBidAction extends BaseAction {
	private List bids;

	public ViewBidAction() {
	}

	public List getBids() {
		return bids;
	}

	public void setBids(List bids) {
		this.bids = bids;
	}

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userId = (Integer) session.get("userId");
		setBids(mgr.getBidByUser(userId.intValue()));
		return "success";
	}

}
