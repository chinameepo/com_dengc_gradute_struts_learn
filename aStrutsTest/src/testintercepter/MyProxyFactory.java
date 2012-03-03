package testintercepter; 

import java.lang.reflect.Proxy;

/** 
 * 文件名：MyProxyFactory.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-23 下午07:49:44 
 * @since jdk1.6
 * 一个代理工厂，生成proxyHandle对象。根据目标对象生成一个代理对象
 */
public class MyProxyFactory
{
	public static Object getProxy(Object object)
	{
		//代理的处理类
		ProxyHandle handle = new ProxyHandle();
		//把dog实例托付给代理
		handle.setTarget(object);
		//第一个参数用来创建ClassLoader对象，只要能访问dog的接口即可
		//第二个参数是代理接口的数组
		//第三个参数是代理包含的处理实例
		return Proxy.newProxyInstance(DogImp.class.getClassLoader(),object.getClass().getInterfaces(), handle);
	}

}
 
