package action.temp; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import model.StudentClass;
import action.base.BaseAction;

/** 
 * 文件名：AddStuTemp.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-28 下午04:54:38 
 * @since jdk1.6
 * 一个临时的action，该action获得班级的所有列表，然后返回给前台页面。这么做也没办法啊，不能呢个通过连接直接访问
 * web-INF里面的页面，然后ftl也不能解析成一个freemarker的视图。
 */
public class AddStuTempAction extends BaseAction
{
	private String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String execute()
	{
		List<StudentClass> list = mgr.findAllClass();
		Map session = ActionContext.getContext().getSession();
		session.put("classList",list);
		return SUCCESS;
	}
}
 
