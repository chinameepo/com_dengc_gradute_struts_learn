package action.base;


import service.AuctionManager;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	protected AuctionManager mgr;
	public void setMgr(AuctionManager mgr) {
		this.mgr = mgr;
	}
}
