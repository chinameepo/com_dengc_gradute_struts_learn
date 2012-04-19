package action.base; 

import service.StudentManager;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * 文件名：BaseActioni.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-19 下午04:45:24 
 * @since jdk1.6
 * 所有action的基础类，此处把业务逻辑的实现类作为一个私有变量注入。任何子类都可以使用这个业务逻辑处理类
 * 
 */
@SuppressWarnings("serial")
public class BaseAction extends ActionSupport
{
	protected StudentManager mgr;

	public StudentManager getMgr()
	{
		return mgr;
	}
	public void setMgr(StudentManager mgr)
	{
		this.mgr = mgr;
	}
}
 
