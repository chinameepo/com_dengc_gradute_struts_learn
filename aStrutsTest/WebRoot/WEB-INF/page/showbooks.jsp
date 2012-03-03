<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>查看书籍</title>
    </head>
    <body>
        <h1>查看书籍!</h1>
         <table border="1" width ="360">
         <caption>书籍目录如下</caption>
         <!-- 从ValueStack中获取action的属性变量 -->
         <!--
          ValueStack valueStack =(ValueStack)request.getAttribute("struts.valueStack") ;
          //调用valuestack对象的方法来获取gatBookAction中的books属性的值
          String [] books = (String[])valueStack.findValue("books");
          //迭代输出数组的每个元素
          for(String book : books)
          {
         %>-->
         
         <!-- <tr>
           <td>书名：</td>
           <td>book</td>
         </tr>
         } -->
         
         <!-- 此处使用struts的标签库来输出书本的目录,迭代输出books中对象，，status是迭代序号 -->
         <s:iterator value = "books" status = "index">
           <!-- 判断行号是奇数 -->
           <s:if test="#index.odd == true">
             <tr style = "background-color:#cccccc">
                <td>书名</td>
                <td>
                  <s:property/>
                </td>
             </tr>
           </s:if>
           <!-- 判断是否为偶数 -->
           <s:else>        
             <tr>
                <td>书名</td>
                <td>
                  <s:property/>
                </td>
             </tr>
           </s:else>
         </s:iterator>
         </table>
    </body>
</html>