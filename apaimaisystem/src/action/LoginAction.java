package action;

import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {
	private String username;
	private String password;
	private String vercode;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVercode() {
		return vercode;
	}

	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		ver2 = ver2.toLowerCase();
		// 清空用户Session的随机验证码字符串。
		session.put("rand", null);
		if (vercode.toLowerCase().equals(ver2)) {
			Integer userId = mgr.validLogin(username, password);
			if (userId != null) {
				session.put("userId", userId);
				return SUCCESS;
			} else {
				addActionError("用户名/密码不匹配");
				return "failure";
			}
		} else {
			addActionError("验证码不匹配,请重新输入");
			return "failure";
		}
	}
}
