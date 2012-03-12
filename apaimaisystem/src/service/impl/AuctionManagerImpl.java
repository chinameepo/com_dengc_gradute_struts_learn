package service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import model.AuctionUser;
import model.Bid;
import model.Item;
import model.Kind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.AuctionManager;
import bisiness.BidBean;
import bisiness.ItemBean;
import bisiness.User;
import dao.AuctionUserDao;
import dao.BidDao;
import dao.ItemDao;
import dao.KindDao;
import dao.StateDao;
import exception.AuctionException;




/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 * 
 */
public class AuctionManagerImpl implements AuctionManager
{

	static Logger log = LoggerFactory.getLogger(AuctionManagerImpl.class.getName());

	private AuctionUserDao userDao;
	private BidDao bidDao;
	private ItemDao itemDao;
	private KindDao kindDao;
	private StateDao stateDao;

	/**
	 * getter ￥￥￥ setters
	 * */
	public AuctionUserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(AuctionUserDao userDao)
	{
		this.userDao = userDao;
	}

	public BidDao getBidDao()
	{
		return bidDao;
	}

	public void setBidDao(BidDao bidDao)
	{
		this.bidDao = bidDao;
	}

	public ItemDao getItemDao()
	{
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao)
	{
		this.itemDao = itemDao;
	}

	public KindDao getKindDao()
	{
		return kindDao;
	}

	public void setKindDao(KindDao kindDao)
	{
		this.kindDao = kindDao;
	}

	public StateDao getStateDao()
	{
		return stateDao;
	}

	public void setStateDao(StateDao stateDao)
	{
		this.stateDao = stateDao;
	}


	/**
	 * 模块1 根据赢取者查询物品
	 * 
	 * @param winerId
	 *            赢取者id
	 * @return 赢取者获得的全部物品
	 */
	public List getItemByWiner(int winerId) throws AuctionException
	{
		List result;
		try
		{
			result = new ArrayList();
			List items = this.itemDao.findItemByWiner(Integer.valueOf(winerId));
			for (Iterator it = items.iterator(); it.hasNext();)
			{
				Item item = (Item) it.next();
				ItemBean ib = new ItemBean();
				initItem(ib, item);
				result.add(ib);
			}
			return result;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("根据赢取者查询物品出现异常,请重试");
		}
	}

	/**
	 * 模块2 查询全部流拍的物品
	 * 
	 * @return 全部流拍物品
	 */
	public List getFailItems() throws AuctionException
	{
		List result;
		try
		{
			result = new ArrayList();
			List items = this.itemDao.findItemByState(Integer.valueOf(3));
			for (Iterator it = items.iterator(); it.hasNext();)
			{
				Item item = (Item) it.next();
				ItemBean ib = new ItemBean();
				initItem(ib, item);
				result.add(ib);
			}
			return result;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("查询流拍物品出现异常,请重试");
		}
	}

	/**
	 * 查询用户的全部出价
	 * 
	 * @param userId
	 *            需查询的用户id
	 * @return 用户的全部出价
	 */
	public List getBidByUser(int userId) throws AuctionException
	{
		List l;
		try
		{
			l = this.bidDao.findByUser(Integer.valueOf(userId));
			List result = new ArrayList();
			for (int i = 0; i < l.size(); ++i)
			{
				Bid bid = (Bid) l.get(i);
				BidBean bb = new BidBean();
				initBid(bb, bid);
				result.add(bb);
			}
			return result;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("查询用户对应所有的竞价出现异常,请重试");
		}
	}

	/**
	 * 根据用户名，密码验证登陆是否成功
	 * 
	 * @param username
	 *            登陆所输入的用户名
	 * @param pass
	 *            登陆的密码
	 * @return 全部流拍物品
	 */
	public Integer validLogin(String username, String pass)
			throws AuctionException
	{
		try
		{
			AuctionUser user = userDao.findUserByNameAndPass(username, pass);
			if (user != null)
			{
				return user.getId();
			}
			return null;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("验证用户登陆出现异常,请重试");
		}
	}

	/**
	 * 模块4 根据用户id查找目前仍在拍卖中的物品
	 * 
	 * @param userId
	 *            用户id
	 * @return 当前用户所有的全部物品。
	 */
	public List getItemsByOwner(int userId) throws AuctionException
	{
		List result;
		try
		{
			result = new ArrayList();
			List items = this.itemDao.findItemByOwner(Integer.valueOf(userId));
			for (Iterator it = items.iterator(); it.hasNext();)
			{
				Item item = (Item) it.next();
				ItemBean ib = new ItemBean();
				initItem(ib, item);
				result.add(ib);
			}
			return result;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("获取用户的所有拍卖物品出现异常,请重试");
		}
	}

	/**
	 * 模块3 模块5 查询全部状态
	 * 
	 * @return 获得全部种类
	 */
	public List getAllKind() throws AuctionException
	{
		try
		{
			return this.kindDao.findAll();
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("获取所有的物品种类出现异常,请重试");
		}
	}

	/**
	 * 模块4 添加物品
	 * 
	 * @param name
	 *            物品名称
	 * @param desc
	 *            物品描述
	 * @param remark
	 *            物品备注
	 * @param avail
	 *            有效天数
	 * @param kind
	 *            物品种类
	 */
	public void addItem(String name, String desc, String remark,
			double initPrice, int avail, int kind, int userId)
			throws AuctionException
	{
		Kind k;
		try
		{
			k = this.kindDao.get(Integer.valueOf(kind));
			AuctionUser owner = this.userDao.get(Integer.valueOf(userId));
			Item item = new Item();
			item.setItemName(name);
			item.setItemDesc(desc);
			item.setItemRemark(remark);
			item.setAddTime(new Date());
			Calendar c = Calendar.getInstance();
			c.add(5, avail + 1);
			item.setEndTime(c.getTime());
			item.setInitPrice(initPrice);
			item.setMaxPrice(initPrice);
			item.setItemState(this.stateDao.get(Integer.valueOf(1)));
			item.setKind(k);
			item.setOwner(owner);

			this.itemDao.save(item);
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("添加物品出现异常,请重试");
		}

	}

	/**
	 * 模块3 添加种类
	 * 
	 * @param name
	 *            种类名称
	 * @param desc
	 *            种类描述
	 */
	public void addKind(String name, String desc) throws AuctionException
	{
		Kind k;
		try
		{
			k = new Kind();
			k.setKindName(name);
			k.setKindDesc(desc);
			this.kindDao.save(k);
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("添加物品种类出现异常,请重试");
		}

	}

	/**
	 * 模块5 根据产品分类，获取当前拍卖的全部商品
	 * 
	 * @param kindId
	 *            种类id;
	 * @return 该类的全部产品
	 */
	public List getItemsByKind(int kindId) throws AuctionException
	{
		List result;
		try
		{
			result = new ArrayList();
			List items = this.itemDao.findItemByKind(Integer.valueOf(kindId));
			for (Iterator it = items.iterator(); it.hasNext();)
			{
				Item item = (Item) it.next();
				ItemBean ib = new ItemBean();
				initItem(ib, item);
				result.add(ib);
			}
			return result;
		}
		catch (Exception e)
		{
			log.debug(e.getMessage());
			throw new AuctionException("获取指定种类的物品出现异常,请重试");
		}
	}

	/**
	 * 模块5 根据分类id，获取种类名
	 * 
	 * @param kindId
	 *            种类id;
	 * @return 该分类的名称
	 */
	public String getKind(int kindId) throws AuctionException
	{
		Kind k = this.kindDao.get(Integer.valueOf(kindId));
		return k.getKindName();
	}

	/**
	 * 模块5 根据物品id，获取物品
	 * 
	 * @param itemId
	 *            物品id;
	 * @return 该物品的名称
	 */
	public ItemBean getItem(int itemId) throws AuctionException
	{
		Item item = this.itemDao.get(Integer.valueOf(itemId));
		ItemBean ib = new ItemBean();
		initItem(ib, item);
		return ib;
	}

	/**
	 * 模块5 增加新的竞价,并对竞价用户发送邮件通知
	 * 
	 * @param userId
	 *            用户id;
	 * @param itemId
	 *            物品id;
	 * @param bidPrice
	 *            竞价价格
	 */
	public void addBid(int userId, int itemId, double bidPrice)
			throws AuctionException
	{

		AuctionUser au = this.userDao.get(Integer.valueOf(userId));
		Item item = this.itemDao.get(Integer.valueOf(itemId));
		if (bidPrice > item.getMaxPrice())
		{
			item.setMaxPrice(bidPrice);
			this.itemDao.update(item);
		}

		Bid bid = new Bid();
		bid.setBidItem(item);
		bid.setBidUser(au);
		bid.setBidDate(new Date());
		bid.setBidPrice(bidPrice);

		this.bidDao.save(bid);
		
	}

	/**
	 * 模块6 根据时间来修改物品的赢取者 返回全部赢取者信息
	 */
	public List updateWiner() throws AuctionException
	{
		List itemList = this.itemDao.findItemByState(Integer.valueOf(1));
		List users = new ArrayList();
		for (int i = 0; i < itemList.size(); ++i)
		{
			Item item = (Item) itemList.get(i);
			if (!(item.getEndtime().after(new Date())))
			{
				AuctionUser au = this.bidDao.findUserByItemAndPrice(
						item.getId(), Double.valueOf(item.getMaxPrice()));
				User user = new User();
				user.setUsername(au.getUsername());
				user.setPassword(au.getUserpass());
				user.setMobile(au.getMobile());
				user.setItem(item);
				if (au != null)
				{
					item.setWiner(au);
					item.setItemState(this.stateDao.get(Integer.valueOf(2)));
					this.itemDao.update(item);
					users.add(user);
				}
				else
				{
					item.setItemState(this.stateDao.get(Integer.valueOf(3)));
					this.itemDao.update(item);
				}
			}
		}
		return users;
	}

	// public ItemBean getItem(int itemId) throws AuctionException {
	// // TODO Auto-generated method stub
	// return null;
	// }

	/**
	 * 将一个Bid PO转换成BidBean的VO
	 * 
	 * @param bb
	 *            BidBean的VO
	 * @param bid
	 *            Bid的PO
	 */
	private void initBid(BidBean bb, Bid bid)
	{
		bb.setId((Integer) bid.getId().intValue());
		if (bid.getBidUser() != null)
			bb.setUser(bid.getBidUser().getUsername());
		if (bid.getBidItem() != null)
			bb.setItem(bid.getBidItem().getItemName());
		bb.setPrice(bid.getBidPrice());
		bb.setBidDate(bid.getBidDate());
	}

	/**
	 * 将一个Item PO转换成ItemBean的VO
	 * 
	 * @param ib
	 *            ItemBean的VO
	 * @param item
	 *            Item的PO
	 */
	private void initItem(ItemBean ib, Item item)
	{
		ib.setId(item.getId());
		ib.setName(item.getItemName());
		ib.setDesc(item.getItemDesc());
		ib.setRemark(item.getItemRemark());
		if (item.getKind() != null)
			ib.setKind(item.getKind().getKindName());
		if (item.getOwner() != null)
			ib.setOwner(item.getOwner().getUsername());
		if (item.getWiner() != null)
			ib.setWiner(item.getWiner().getUsername());
		ib.setAddTime(item.getAddtime());
		ib.setEndTime(item.getEndtime());
		if (item.getItemState() != null)
			ib.setState(item.getItemState().getStateName());
		ib.setInitPrice(item.getInitPrice());
		ib.setMaxPrice(item.getMaxPrice());
	}
}
