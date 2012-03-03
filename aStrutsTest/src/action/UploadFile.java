package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 文件名：UploadFile.java All right Rserved Dengc2012
 * 
 * @author 邓超 E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-2-22 下午02:07:39
 * @since jdk1.6 一个处理文件上传的跳转的action
 */
public class UploadFile extends ActionSupport
{
	/* 属性包括：文件标题、上传文件、文件类型文件名、 
	 * 注意的是action一旦接受了来自前台的enctype="multipart/form-data"请求
	 * ，那么一个文件的名字XX，XXContentType,XXFileName这几个属性默认就是文件的类型属性
	 * */
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
    
	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public File getUpload()
	{
		return upload;
	}

	public void setUpload(File upload)
	{
		this.upload = upload;
	}

	public String getUploadContentType()
	{
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName()
	{
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}

	/***
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute() 父类的方法重写，返回字符串
	 */
	@SuppressWarnings("deprecation")
	@Override
	public String execute()
	{
		String savePath = ServletActionContext.getRequest()
		.getRealPath("/");
		return copyFile(savePath, getUpload());
	}

	/**
	 * 从一个upload的文件复制到savePath目录下
	 * @param String savaPath 要保存文件的文件路径，File upload,要被复制的文件的文件名
	 * @return String ,执行完之后返回的字符串
	 */
	public String copyFile(String savePath,File upload)
	{
		Logger logger = LoggerFactory.getLogger(getClass());
		// 用服务器的文件保存地址和源文件名建立上传文件输出流
		try
		{
			logger.info("标题是:" + getTitle());
			logger.info("文件类型" + getUploadContentType());
			logger.info("文件名字是：" + getUploadFileName());
			logger.info("保存路径：" + savePath);
			FileOutputStream fos = new FileOutputStream(savePath + "\\"
					+ getUploadFileName());
			// 为上传的文件建立输入流
			FileInputStream inputStream = new FileInputStream(upload);
			// 将上传的文件写入服务器
			byte[] buffer = new byte[1024];
			int len = 0;
			try
			{
				while ((len = inputStream.read(buffer)) != -1)
				{
					fos.write(buffer, 0, len);
				}
				inputStream.close();
				fos.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error(e.toString());
				logger.info("文件读写过程出错！");
				return ActionSupport.ERROR;
			}
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.toString());
			logger.info("文件找不到！！！");
			return ERROR;
		}
		return SUCCESS;
	}

}
