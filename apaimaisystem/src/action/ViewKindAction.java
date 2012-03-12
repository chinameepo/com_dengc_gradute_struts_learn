package action; 
import java.util.List;

import action.base.BaseAction;

/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:10:20 
 * @since jdk1.6
 * 查看类别
 */
public class ViewKindAction extends BaseAction
{
	private List kinds;
    private String errMsg;
    
    public ViewKindAction()
    {
    }

    public List getKinds()
    {
        return kinds;
    }

    public void setKinds(List kinds)
    {
        this.kinds = kinds;
    }

    public String getErrMsg()
    {
        return errMsg;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public String execute()
        throws Exception
    {
        setKinds(mgr.getAllKind());
        return "success";
    }

    
}
 
