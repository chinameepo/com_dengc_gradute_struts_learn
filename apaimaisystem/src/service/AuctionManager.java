package service;

import java.util.List;

import bisiness.ItemBean;
import exception.AuctionException;





public interface AuctionManager {
	/**
	 * 模块1
     * 根据赢取者查询物品
     * @param winerId 赢取者id
     * @return 赢取者获得的全部物品
     */
    List getItemByWiner(int winerId) throws AuctionException;
    /**
     * 模块2
     * 查询全部流拍的物品
     * @return 全部流拍物品
     */
    List getFailItems() throws AuctionException;
    /**
     * 模块2
     * 根据用户名，密码验证登陆是否成功
     * @param username 登陆所输入的用户名
     * @param pass 登陆的密码
     * @return 全部流拍物品
     */
    Integer validLogin(String username , String pass) throws AuctionException;
    /**
     * 模块5
     * 查询用户的全部出价
     * @param userId 需查询的用户id
     * @return 用户的全部出价
     */
    List getBidByUser(int userId) throws AuctionException;
	/**
	 * 根据用户id查找目前仍在拍卖中的物品
	 * @param userId 用户id
	 * @return 当前用户所有的全部物品。
	 */
    List getItemsByOwner(int userId) throws AuctionException;

    /**
     * 模块3 模块5
     * 查询全部状态
     * @return 获得全部种类
     */ 
    List getAllKind()throws AuctionException; 

    /**
     * 模块4
     * 添加物品
     * @param name 物品名称
     * @param desc 物品描述
     * @param remark 物品备注
     * @param avail 有效天数
     * @param kind 物品种类
     */ 
    void addItem(String name , String desc , String remark , double initPrice , int avail , int kind , int userId) throws AuctionException;

    /**
     * 模块3
     * 添加种类
     * @param name 种类名称
     * @param desc 种类描述
     */ 
    void addKind(String name , String desc ) throws AuctionException;

    /**
     * 模块5
     * 根据产品分类，获取当前拍卖的全部商品
     * @param kindId 种类id;
     * @return 该类的全部产品
     */
    List getItemsByKind(int kindId) throws AuctionException;

    /**
     * 模块5
     * 根据分类id，获取种类名
     * @param kindId 种类id;
     * @return 该分类的名称
     */
    String getKind(int kindId) throws AuctionException;
    /**
     * 模块5
     * 根据物品id，获取物品
     * @param itemId 物品id;
     * @return 该物品的名称
     */
    ItemBean getItem(int itemId) throws AuctionException;

	/**
	 * 模块5
	 * 增加新的竞价
	 * @param userId 用户id;
	 * @param itemId 物品id;
	 * @param bidPrice 竞价价格
	 */
	void addBid(int userId , int itemId , double bidPrice)throws AuctionException;
	
	/**
	 * 模块6
	 * 根据时间来修改物品的赢取者
	 */
	List updateWiner()throws AuctionException;
}
