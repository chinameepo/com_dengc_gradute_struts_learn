package action; 

import model.UserBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/** 
 * 文件名：BeanLoginAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-19 下午04:13:22 
 * @since jdk1.6
 *  用作struts2模型驱动的测试类.
 */
@SuppressWarnings("serial")
public class BeanLoginAction extends ActionSupport implements ModelDriven<UserBean>
{
    /*把用户请求都封装到这个模型里面*/
	private UserBean userBean = new UserBean();
	
	public UserBean getModel()
	{
		return userBean;
	}
	
	public String execute()
	{
		if(getModel().getUsername().equals("deng") &&  getModel().getPassword().equals("dengchao"))
		{
			getModel().setTip("模型驱动：恭喜您登陆成功。");
			return ActionSupport.SUCCESS;
		}
		else 
		{
			return ActionSupport.ERROR;
		}
	}
}
 
