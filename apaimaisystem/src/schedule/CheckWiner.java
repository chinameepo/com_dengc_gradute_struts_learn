package schedule;

import java.util.TimerTask;

import service.AuctionManager;


public class CheckWiner extends TimerTask {
	private AuctionManager mgr;

	public void setMgr(AuctionManager mgr) {
		this.mgr = mgr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		

	}

}
