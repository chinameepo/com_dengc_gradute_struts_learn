package action.incepertor;

import java.util.Map;

import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Administrator
 * 拦截器的定义
 */
public class AuthorityInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map session = ActionContext.getContext().getSession();
		Object userId = session.get("userId");
		if (userId == null){
			return "login";
		}
		else{
			return invocation.invoke();
		}
	}
}
