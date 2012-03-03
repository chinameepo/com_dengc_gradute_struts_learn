<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import ="java.io.*,java.util.*"%>
<%@page import = "org.apache.commons.fileupload.disk.*,org.apache.commons.fileupload.* "%>
<%@page import="org.apache.commons.fileupload.servlet.*" %>
<html>
<%
  DiskFileItemFactory factory = new DiskFileItemFactory();
  //设置上传工厂的限制 条件
  factory.setSizeThreshold(1024*1024*20);
  factory.setRepository(new File(request.getRealPath("/")));
  //创建一个上传文件的servletfileupload对象
  ServletFileUpload fileUpload = new ServletFileUpload(factory);
  
  //设置最大的上传限制
  fileUpload.setSizeMax(1024*1024*20);
  //处理http请求，timers是所有的表单项目
  List items = fileUpload.parseRequest(request);
  //遍历所有的表单
  for (Iterator iterator = items.iterator(); iterator.hasNext();)
  {
    FileItem item =(FileItem)iterator.next();
    //如果是表单域，提交表单，如果是文件域，提交文件上传
    if (item.isFormField())
    {
      String name = item.getFieldName();
      String value = item.getString("GBK");
      out.println("表单的name =value:" + name+"= "+value);
    }
    else
    {
      //获取文件的表单域名
      String fieldName = item.getFieldName();
      //获取文件名 
      String fileName = item.getName();
      //获取文件 类型
      String contenType = item.getContentType();
      
      //用当前时间来生成 文件的文件名
      FileOutputStream fileOutputStream = new FileOutputStream(request.getRealPath("/")+System.currentTimeMillis()
      +fileName.substring(fileName.lastIndexOf("."),fileName.length()));
      //如果文件 已经存在内存中,继续写入，如果不在，要完全重新写
      if (item.isInMemory())
      {
        fileOutputStream.write(item.get());
      }
      else
      {
        //获取输入流
        InputStream inputStream = item.getInputStream();
        byte [] buffer = new byte[1024];
        int length;
        while((length = inputStream.read(buffer))!=-1)
        {
          fileOutputStream.write(buffer,0,length);
        }
        inputStream.close();
        fileOutputStream.close();
      }
    }
  }
%>
 <body><br>上传成功！<br></body>
</html>