<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 2021/11/2
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <form action="http://localhost:8080/cookie/loginServlet">
      用户名：<input type="text" name="username" value="${cookie.username.value}">
      密码：<input type="password" name="password">
      <input type="submit" value="提交">
    </form>
  </body>
</html>
