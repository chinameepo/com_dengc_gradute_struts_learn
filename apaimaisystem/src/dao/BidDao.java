package dao; 
import java.util.List;

import model.AuctionUser;
import model.Bid;


/** 
 * All right Rserved Dengc2011
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-12-27 上午11:09:32 
 * @since jdk1.6
 * 竞拍物品的接口
 */

public interface BidDao {
	/**
	 * 根据主键查找竞价
	 * 
	 * @param bidId
	 * 竞价id;
	 * @return id对应的竞价
	 */
	Bid get(Integer bidId);

	/**
	 * 模块5
	 * 保存竞价
	 * 
	 * @param bid
	 * 需要保存的竞价
	 */
	void save(Bid bid);

	/**
	 * 修改竞价
	 * 
	 * @param bid
	 * 需要修改的竞价
	 */
	void update(Bid bid);

	/**
	 * 删除竞价
	 * 
	 * @param id
	 * 需要删除的竞价id
	 */
	void delete(Integer id);

	/**
	 * 删除竞价
	 * 
	 * @param bid
	 * 需要删除的竞价
	 */
	void delete(Bid bid);

	/**
	 * 模块5
	 * 根据用户查找竞价
	 * 
	 * @param id
	 * 用户id
	 * @return 用户对应的全部竞价
	 */
	List findByUser(Integer userId);

	/**
	 * 模块6
	 * 根据物品id，以及出价查询用户
	 * @param itemId
	 * 物品id;
	 * @param price
	 * 竞价的价格
	 * @return 对指定物品出指定竞价的用户
	 */
	AuctionUser findUserByItemAndPrice(Integer itemId, Double price);
}
 
