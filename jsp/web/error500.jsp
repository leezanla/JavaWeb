<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/21/2021
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         errorPage="error500.jsp"
         language="java" %>
<%--
errorPage表示错误后自动跳转去的路径
这个路径般都是以斜杠打头，它表示请求地址为http://ip:port/工程路径/
映射到代码的web目录
--%>

<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%--  1、声明类的属性--%>
    <%!
      private Integer id;
      private String name;
      private static Map<String, Object> map;
    %>

    <%--2、声明static静态代码块--%>
    <%!
      static {
        map = new HashMap<String, Object>();
        map.put("key1", "value1");
      }
    %>

    <%--3、声明类方法--%>
    <%!
      public int sum(int a, int b) {
        return a + b;
      }
    %>

    <%--4、声明内部类--%>
    <%!
      public static class A {
        private Integer id = 12;
        private String abc = "abc";
      }
    %>

    <%--1、输出整型--%>
    <%=12%>  <br>
    <%--2、输出浮点型--%>
    <%=12.2%>  <br>
    <%--3、输出字符串--%>
    <%="我是jsp中的jsp"%>  <br>
    <%--4、输出对象--%>
    <%=map%>  <br>
    <%=request.getParameter("username")%>

    <%
      int i = 5;
      if (i == 5) {
        System.out.println("你好吗");
      } else {
        System.out.println("我很好");

        //单行java注释

        /* 多选java注释 */


      }
    %>

    <!-- 这是html注释 -->
  <%-- 这是jsp注释 --%>
  </body>
</html>
