package test; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/** 
 * 文件名：TestLogback.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-19 上午11:03:50 
 * @since jdk1.6
 * 一个测试，查看logback能否正常输出。
 */
public class TestLogback
{
	private Logger logger = LoggerFactory.getLogger(TestLogback.class);
	public static void main(String[] args)
	{
		TestLogback test = new TestLogback();
		test.info();
		test.debug();
		test.warn();
	}
	public void info()
	{
		this.logger.info("info:fefieifwe");
	}
	public void debug()
	{
		this.logger.debug("debug:fefesfaseife");
	}
	public void warn()
	{
		this.logger.warn("warn:LfefOIFE3");
	}
	

}
 
