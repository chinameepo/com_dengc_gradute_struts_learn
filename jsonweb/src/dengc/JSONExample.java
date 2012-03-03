package dengc; 

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.Action;

import javassist.expr.NewArray;

/** 
 * 文件名：JSONExample.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-3-3 下午02:44:11 
 * @since jdk1.6
 * 一个封装了请求的类
 */
public class JSONExample
{
	//封装3个请求参数
	private String field1;
	//'transient' fields are not serialized
	private transient String field2;
	//fields without getter method are not serialized
	private String field3;
	
	//封装请求的结果
	private int[] ints = {10,20};
	private Map map = new HashMap();
	private String custumerName = "customer";
	public String getField1()
	{
		return field1;
	}
	public void setField1(String field1)
	{
		this.field1 = field1;
	}
	public String getField2()
	{
		return field2;
	}
	public void setField2(String field2)
	{
		this.field2 = field2;
	}
	public int[] getInts()
	{
		return ints;
	}
	public void setInts(int[] ints)
	{
		this.ints = ints;
	}
	public Map getMap()
	{
		return map;
	}
	public void setMap(Map map)
	{
		this.map = map;
	}
	public String getCustumerName()
	{
		return custumerName;
	}
	
	/**
	 * @param custumerName
	 * 使用json来指定name域名，这个域名的值也指定了。然后它会被acton序列化，最后成为一个json对象。
	 */
	@JSON (name ="newName")
	public void setCustumerName(String custumerName)
	{
		this.custumerName = custumerName;
	}
	
	/**
	 * @return action的返回状态
	 * 把name域名放入序列化中
	 */
	public String execute()
	{
		map.put("name","dengchao");
		return Action.SUCCESS; 
	}
}
 
