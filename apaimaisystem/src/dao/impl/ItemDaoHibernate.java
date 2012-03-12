package dao.impl;


import java.util.List;

import model.Item;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ItemDao;

/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午7:48:04
 * @since jdk1.6 类说明
 */
public class ItemDaoHibernate extends HibernateDaoSupport implements ItemDao {
	public void delete(Integer id) {
		getHibernateTemplate().delete(
				getHibernateTemplate().get(Item.class, id));
	}

	public void delete(Item item) {
		getHibernateTemplate().delete(item);
	}

	public List<Item> findItemByKind(Integer kindId) {
		return getHibernateTemplate().find(
				"from Item as i where i.kind.id = ? and i.itemState.id = 1",
				kindId);
	}

	public List<Item> findItemByOwner(Integer userId) {
		return getHibernateTemplate().find(
				"from Item as i where i.owner.id = ? and i.itemState.id = 1",
				userId);
	}

	public List<Item> findItemByState(Integer stateId) {
		return getHibernateTemplate().find(
				"from Item as i where i.itemState.id = ?", stateId);
	}

	public List<Item> findItemByWiner(Integer userId) {
		return getHibernateTemplate().find(
				"from Item as i where i.winer.id = ? and i.itemState.id = 2",
				userId);
	}

	public Item get(Integer itemId) {
		return ((Item) getHibernateTemplate().get(Item.class, itemId));
	}

	public void save(Item item) {
		getHibernateTemplate().save(item);
	}

	public void update(Item item) {
		getHibernateTemplate().saveOrUpdate(item);
	}
}
