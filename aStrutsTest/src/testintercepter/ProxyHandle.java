package testintercepter; 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



/** 
 * 文件名：ProxyHandle.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-23 下午07:41:13 
 * @since jdk1.6
 *代理类
 */
public  class ProxyHandle implements InvocationHandler
{

	//需要被代理的对象
	private Object target;
	//创建拦截器实例
	private DogIntercepter dogIntercepter = new DogIntercepter();
	
	/*** (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 * 接口中实现的方法,执行代理目标的方法时，这个invoke方法会自动 调用
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		// TODO Auto-generated method stub
		Object result = null;
		if (method.getName().equals("info"))
		{
			//调用拦截器方法1
			dogIntercepter.method1();
			result = method.invoke(target, args);
			//调用拦截器方法2
			dogIntercepter.method2();
		}
		else
		{
			result = method.invoke(target, args);
		}
		return result;
	}
	
	/**
	 * @param object 
	 * 用于设置传入目标对象的方法！
	 */
	public void setTarget(Object object)
	{
		this.target = object;
	}
	
}
 
