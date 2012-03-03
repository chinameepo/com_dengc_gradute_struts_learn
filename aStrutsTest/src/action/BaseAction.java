package action; 
/** 
 * 文件名：BaseAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-15 下午02:38:35 
 * @since jdk1.6
 * 一个action的接口，包括了一些放回的常量，和一个execute （）方法
 */
public interface BaseAction
{
	/*定义个字符串常量，表示action处理之后返回的字符串的情形*/
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	public static final String NONE = "none";
	public static final String  LOGIN = "login";
	
	public String execute() throws Exception;
	
 
}
 
