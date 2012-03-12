package dao.impl; 

import java.util.List;

import model.AuctionUser;
import model.Bid;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.BidDao;
/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午7:47:22 
 * @since jdk1.6
 * 一个拍卖的dao类
 */
public class BidDaoHibernate extends HibernateDaoSupport
implements BidDao
{
	public BidDaoHibernate(){
		
	}
	public void delete(Integer id)
	  {
	    getHibernateTemplate().delete
	      (getHibernateTemplate().get(Bid.class, id));
	  }

	  public void delete(Bid bid)
	  {
	    getHibernateTemplate().delete(bid);
	  }

	  public List findByUser(Integer userId)
	  {
	    return getHibernateTemplate().find(
	      "from Bid as bid where bid.bidUser.id = ?", userId);
	  }

	  public AuctionUser findUserByItemAndPrice(Integer itemId, Double price)
	  {
	    Object[] args = { itemId, price };
	    List l = getHibernateTemplate().find
	      (
	      "from Bid as bid where bid.bidItem.id = ? and bid.bidPrice = ?", 
	      args);
	    if (l.size() >= 1) {
	      Bid b = (Bid)l.get(0);
	      return b.getBidUser();
	    }
	    return null;
	  }

	  public Bid get(Integer bidId)
	  {
	    return ((Bid)getHibernateTemplate().get(Bid.class, bidId));
	  }

	  public void save(Bid bid)
	  {
	    getHibernateTemplate().save(bid);
	  }

	  public void update(Bid bid)
	  {
	    getHibernateTemplate().saveOrUpdate(bid);
	  }
}
 
