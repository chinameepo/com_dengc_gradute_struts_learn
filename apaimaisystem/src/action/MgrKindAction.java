package action;

import java.util.List;
import java.util.Map;

import action.base.BaseActionInterface;

import com.opensymphony.xwork2.ActionContext;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:07:32
 * @since jdk1.6 管理，類別
 */
@SuppressWarnings("rawtypes")
public class MgrKindAction extends BaseActionInterface {
	
	private List kinds;
	private String errMsg;

	public MgrKindAction() {
	}

	public List getKinds() {
		return kinds;
	}

	public void setKinds(List kinds) {
		this.kinds = kinds;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@SuppressWarnings("unused")
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		setKinds(mgr.getAllKind());
		setErrMsg(errMsg);
		return "success";
	}
}
