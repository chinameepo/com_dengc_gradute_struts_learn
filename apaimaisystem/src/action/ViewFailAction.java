package action;

import java.util.List;

import action.base.BaseAction;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:09:18
 * @since jdk1.6 查看拍卖失败的栏目
 */
@SuppressWarnings("serial")
public class ViewFailAction extends BaseAction {
	private List failItems;
	
	public ViewFailAction() {
	}

	public List getFailItems() {
		return failItems;
	}

	public void setFailItems(List failItems) {
		this.failItems = failItems;
	}

	public String execute() throws Exception {
		setFailItems(mgr.getFailItems());
		return "success";
	}

	
}
