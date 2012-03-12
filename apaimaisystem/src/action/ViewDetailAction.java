package action; 
import action.base.BaseActionInterface;
import bisiness.ItemBean;
/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-4 下午3:08:46 
 * @since jdk1.6
 * 查看方法
 */
public class ViewDetailAction extends BaseActionInterface
{
	private int itemId;
    private ItemBean item;
    private String errMsg;
    
    public ViewDetailAction()
    {
    }

    public int getItemId()
    {
        return itemId;
    }

    public void setItemId(int itemId)
    {
        this.itemId = itemId;
    }

    public ItemBean getItem()
    {
        return item;
    }

    public void setItem(ItemBean item)
    {
        this.item = item;
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
        if(itemId <= 0)
        {
            setErrMsg("您输入的竞价必须是数字。");
            return "error";
        } else
        {
            setItem(mgr.getItem(itemId));
            return "success";
        }
    }

    
}
 
