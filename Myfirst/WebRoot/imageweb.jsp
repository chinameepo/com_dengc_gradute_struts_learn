<%@ page autoFlush="false" import ="java.awt.*,java.awt.image.*,com.sun.image.codec.jpeg.*,java.util.*" %>
<%@ page contentType ="text/html;charset=GB2312"%>
<%
    String ImageStr=request.getParameter("ID_text");
     if(ImageStr==null||ImageStr.equals(""))
      {
         response.setContentType("text/html;charset=GB2312");
%>
   <html>
     <head>
       <title>把JSP在内存里生成的图片显示到页面</title>
     </head>
   <body>
      <form id="form1" method="post">
       <input type="text" id="ID_text" name=ID_text>
       <input type="submit" value="GO">
      </form>
    </body>
   </html>
 <%
   }


    else
{
  out.clear();
  response.setContentType("image/jpeg");
  response.addHeader("prama","NO-cache");
  response.addDateHeader("Expries",0);


  int width=300,height=100;
  BufferedImage image =new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
  Graphics g=image.getGraphics();
  g.setColor(Color.gray);
  g.fillRect(0,0,width,height);
   String random ="random";
  g.setColor(Color.black);
  g.drawString("把JSP在内存里生成的图片显示到页面",10,20);
  g.drawString("Author::sungx[sungxmail@sohu.com]",10,40);
  g.drawString(ImageStr,10,70);
  g.dispose();
   
  ServletOutputStream outStream =response.getOutputStream();
  JPEGImageEncoder encoder =JPEGCodec.createJPEGEncoder(outStream);
  encoder.encode(image);
  outStream.close();

}
%>
  
        
      
  
