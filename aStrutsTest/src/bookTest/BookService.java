package bookTest; 



/** 
 * 文件名：BookService.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-15 下午04:27:57 
 * @since jdk1.6
 * 一个数组，包含了一些书的名字，一个POJO 
 */
public class BookService
{
	private String[] books = new String[]{ "spring","hibernate","struts","slf4j"};

	public String[] getBooks()
	{
		return books;
	}

	public void setBooks(String[] books)
	{
		this.books = books;
	}
}
 
