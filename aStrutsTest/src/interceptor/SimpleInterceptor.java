package interceptor; 

import java.util.Date;

import action.LoginAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/** 
 * 文件名：SimpleInterceptor.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-24 上午11:20:12 
 * @since jdk1.6
 * 在action loginaction类执行之前，插入的拦截器
 */
public class SimpleInterceptor extends AbstractInterceptor
{
	//拦截器的名字
	private String name;
	
	

	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		// 去的被拦截的action的实例
		LoginAction action = (LoginAction) invocation.getAction();
		
		System.out.println(name+"拦截器开始拦截，开始执行action的时间为："+new Date());
		//去的action开始执行的时间
		long start = System.currentTimeMillis();
		String result =invocation.invoke();
		System.out.println(name+"拦截器执行完毕,执行完登陆的时间为："+new Date());
		long end = System.currentTimeMillis();
		System.out.println("action 执行的总共时间为："+(end - start));
		return result;
	}

}
 
