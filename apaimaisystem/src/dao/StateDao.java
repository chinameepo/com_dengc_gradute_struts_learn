package dao; 
/** 
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-1-7 下午8:43:59 
 * @since jdk1.6
 * 类说明 
 */

import java.util.List;

import model.State;

public abstract interface StateDao
{
  public abstract State get(Integer paramInteger);
  public abstract void save(State paramState);

  public abstract void update(State paramState);

  public abstract void delete(Integer paramInteger);

  public abstract void delete(State paramState);

  public abstract List<State> findAll();
}
 
