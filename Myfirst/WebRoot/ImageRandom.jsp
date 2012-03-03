<%@ page contentType="image/jpeg" import ="java.awt.*,java.awt.image.*,com.sun.image.codec.jpeg.*,java.util.*"%>
<%
   int width=200,height=200;
   BufferedImage  image =new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
   Graphics g=image.getGraphics();
   g.setColor(Color.white);
   g.fillRect(0,0,width,height);
   Polygon poly=new Polygon();
   Random random =new Random();
   
    for(int i=0 ;i<5;i++)
    {
      poly.addPoint(random.nextInt(width),random.nextInt(height));
    }
   
   g.setColor(Color.cyan);
   g.fillPolygon(poly);
   g.dispose();


    ServletOutputStream sos =response.getOutputStream();
    JPEGImageEncoder encoder =JPEGCodec.createJPEGEncoder(sos);
    encoder.encode(image);
%>
  