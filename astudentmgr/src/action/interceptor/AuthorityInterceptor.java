package action.interceptor; 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
 * 文件名：AuthorityInterceptor.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-19 下午05:19:38 
 * @since jdk1.6
 *拦截器，验证用户是否已经登录或者已经注销
 */
public class AuthorityInterceptor extends AbstractInterceptor
{
	public AuthorityInterceptor()
	{
		
	}

	/**
	 * 从会话SESSION中提取出用户名，查看用户名是否存在，如果存在则表示登陆成功，否则表示未登录。
	 *  (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
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
 
