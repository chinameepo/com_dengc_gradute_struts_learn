package dao.impl;

import java.util.List;

import model.State;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.StateDao;



/**
 * All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午7:46:20
 * @since jdk1.6
 * 
 */
public class StateDaoHibernate extends HibernateDaoSupport implements StateDao 
{

	 /**
     * 根据id查找状态
     * @param id 需要查找的状态id
     */  
    public State get(Integer id)
    {
        return (State)getHibernateTemplate().get(State.class , id);
    }
    /**
     * 增加状态
     * @param state 需要增加的状态
     */       
    public void save(State state)
    {
        getHibernateTemplate().save(state);
    }

    /**
     * 修改状态
     * @param state 需要修改的状态
     */  
    public void update(State state)
    {
        getHibernateTemplate().saveOrUpdate(state);
    }

    /**
     * 删除状态
     * @param id 需要删除的状态id
     */  
    public void delete(Integer id)
    {
        getHibernateTemplate().delete(getHibernateTemplate().get(State.class , id));
    }

    /**
     * 删除状态
     * @param state 需要删除的状态
     */  
    public void delete(State state)
    {
        getHibernateTemplate().delete(state);
    }

    /**
     * 查询全部状态
     * @return 获得全部状态
     */ 
    public List findAll()
    {
        return getHibernateTemplate().find("from State");
    }
	
}
