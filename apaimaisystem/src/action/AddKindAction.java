package action; 
import java.util.Map;

import action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;
/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:05:38 
 * @since jdk1.6
 * 添加拍卖物品的类别
 */
public class AddKindAction extends BaseAction
{

	private String name;
    private String desc;
    private String vercode;
    
    public AddKindAction()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getVercode()
    {
        return vercode;
    }

    public void setVercode(String vercode)
    {
        this.vercode = vercode;
    }

    public String execute()
        throws Exception
    {
        Map session = ActionContext.getContext().getSession();
        String ver2 = (String)session.get("rand");
        ver2 = ver2.toLowerCase();
        session.put("rand", null);
        if(vercode.toLowerCase().equals(ver2))
        {
            mgr.addKind(name, desc);
            return "success";
        } else
        {
            addActionError("验证码不匹配,请重新输入");
            return "input";
        }
    }
   
}
 
