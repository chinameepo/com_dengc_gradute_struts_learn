package bookTest; 

import com.opensymphony.xwork2.ActionContext;

import action.BaseAction;

/** 
 * 文件名：GetBooksAction.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-15 下午04:30:10 
 * @since jdk1.6
 * 一个查看 bookservice对象的书目录的action,是一次对模型、视图的学习尝试
 * 通过这个类，我们可以知道，action中的成员属性String[]books并不一定要封装用户的请求参数。
 * 有可能它是从后台传到前台的页面中显示的属性
 * 
 */
public class GetBooksAction implements BaseAction
{
	private String []books;

	public String[] getBooks()
	{
		return books;
	}

	public void setBooks(String[] books)
	{
		this.books = books;
	}

	
	/**
	 * @return String ，返回action的字符串
	 * @throws Exception 
	 * 如果用户已经登陆，那么session中有username属性。
	 * 将自己的books属性装入valueStack中
	 * */
	public String execute() throws Exception
	{
		/*获取session对象中的usernamme属性,
		 * 这个里面的session是必须要在loginaction里面登陆了，使用session.put()，username属性才会放入session，如果直接用
		 * booklogin.jsp登陆的话，因为没有使用loginAction把属性装入ssioin，username会null*/
		String username = (String)ActionContext.getContext().getSession().get("username");
		//如果验证成功，则将bookservice实例中的属性赋值给这个action中的数组
		if(username != null && username.equals("deng"))
		{
			BookService bookService = new BookService();
			//这样这个数组就封装在一个valueStack中，我们只要从前台获取这个对象，然后从对象中找到变量即可
			this.setBooks(bookService.getBooks());
			return SUCCESS;
		}
		else 
		{
			return ERROR;
		}
	}
}
 
