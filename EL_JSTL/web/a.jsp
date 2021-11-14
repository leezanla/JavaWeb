<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%
      request.setAttribute("key", "值");
    %>
    表达式脚本输出key的值是：<%=request.getAttribute("key")%> <br>
    EL表达式输出的key的值是：${key}<br>

    当输出的值不没有的时候：<br>
    表达式脚本输出key的值是：<%=request.getAttribute("key1")%> <br>   <!--这个会输出一个null值-->
    EL表达式输出的key的值是：${key1}<br> <!--这个什么也不会输出-->

  </body>
</html>
