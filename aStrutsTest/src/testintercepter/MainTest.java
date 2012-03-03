package testintercepter;

/**
 * 文件名：MainTest.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-23 下午07:56:17
 * @since jdk1.6 主要的测试类
 */
public class MainTest
{
	public static void main(String[] args)
	{
		// 创建一个dog实例,将它作为代理目标对象
		Dog targetObject = new DogImp();
		Dog dog = null;
		// 目标对象创建代理
		Object proxy = MyProxyFactory.getProxy(targetObject);
		if (proxy instanceof Dog)
		{
			dog = (Dog) proxy;
		}
		// 调用代理的方法
		dog.info();
		dog.run();

	}

}
