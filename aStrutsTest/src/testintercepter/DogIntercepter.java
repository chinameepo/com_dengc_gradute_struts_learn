package testintercepter; 
/** 
 * 文件名：DogIntercepter.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-23 下午07:26:25 
 * @since jdk1.6
 * 一个拦截器类，有2个方法，到时候要用来插入用
 */
public class DogIntercepter
{
	public void method1()
	{
		System.out.println("=========模拟拦截器插入的通用方法一=========一");
	}
	public void method2()
	{
		System.out.println("==========模拟拦截器插入的通用方法二=============");
	}

}
 
