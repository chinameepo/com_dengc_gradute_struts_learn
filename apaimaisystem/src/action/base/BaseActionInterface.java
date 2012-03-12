package action.base;

import service.AuctionManager;

import com.opensymphony.xwork2.Action;

public class BaseActionInterface implements Action {

	protected AuctionManager mgr;
	
	public void setMgr(AuctionManager mgr) {
		this.mgr = mgr;
	}

	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
