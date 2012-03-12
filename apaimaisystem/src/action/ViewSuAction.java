package action; 

import java.util.List;
import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午2:59:01 
 * @since jdk1.6
 * 类说明 
 */
public class ViewSuAction extends BaseAction{
	 private List items;
	 public ViewSuAction()
	    {
	    }

	    public List getItems()
	    {
	        return items;
	    }

	    public void setItems(List items)
	    {
	        this.items = items;
	    }

	    public String execute()throws Exception
	    {
	        Map session = ActionContext.getContext().getSession();
	        Integer userId = (Integer)session.get("userId");
	        setItems(mgr.getItemByWiner(userId.intValue()));
	        return "success";
	    }
}
 
