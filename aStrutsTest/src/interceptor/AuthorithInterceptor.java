package interceptor; 

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
 * 文件名：AuthorithInterceptor.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-25 下午04:11:29 
 * @since jdk1.6
 * 一个权限控制的拦截器，如果用户没有实现登录，那么就会跳转到登录界面
 */
public class AuthorithInterceptor extends AbstractInterceptor
{
	

	/** (non-Javadoc)
	 * @param ActionInvocation invocation，一个代理请求
	 * @return String 返回一个类似execute方法的字符串，比如success,input,error
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 * 检查权限验证的拦截器
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		//去的actioncontext的实例
		ActionContext context = invocation.getInvocationContext();
		Map session = context.getSession();
		//从session中获取username属性
		String userename = (String) session.get("username");
		//如果没有登录，或者是用户名错误
		if ((userename!= null) && ("deng".equals(userename)))
		{
			return invocation.invoke();
		}
		//如果没有验证成功，将服务器设置成一个httpservletrequest属性
		else 
		{
			context.put("tip", "您还没有登录，请输入正确用户名和密码登录");
			return ActionSupport.INPUT;
		}
	}

}
 
