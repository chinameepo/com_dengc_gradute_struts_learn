package dao; 
import java.util.List;

import model.Kind;


/** 
 * All right Rserved Dengc2011
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2011-12-27 上午11:05:24 
 * @since jdk1.6
 * 物品类别管理接口
 */
public interface KindDao {
	 /**
	  * 模块4
    * 根据id查找种类
    * @param id 需要查找的种类id
    */  
   Kind get(Integer id);
   /**
    * 增加种类
    * @param kind 需要增加的种类
    */       
   void save(Kind kind);

   /**
    * 模块3
    * 修改种类
    * @param kind 需要修改的种类
    */  
   void update(Kind kind);

   /**
    * 删除种类
    * @param id 需要删除的种类id
    */  
   void delete(Integer id);

   /**
    * 删除种类
    * @param kind 需要删除的种类
    */  
   void delete(Kind kind);

   /**
    * 模块3 模块5
    * 查询全部种类
    * @return 获得全部种类
    */ 
   List<Kind> findAll(); 

}
 
