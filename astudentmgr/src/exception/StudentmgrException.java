package exception; 
/** 
 * 文件名：StudentmgrException.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-19 下午03:48:20 
 * @since jdk1.6
 *一个自定义的异常，用于抛出自定义的异常
 */
@SuppressWarnings("serial")
public class StudentmgrException extends Exception
{
	
	public StudentmgrException()
	{
		
	}
	public StudentmgrException(String msg)
	{
		super(msg);
	}
}
 
