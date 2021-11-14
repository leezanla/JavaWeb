<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 2021/11/4
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>document</title>
    <style>
      img {
          width: 100px;
          height: 30px;
      }
    </style>
  </head>
  <body>
    <form action="http://localhost:8080/code/submitServlet">
      用户名：<input type="text" name="username"> <br>
      验证码：<input type="text" style="width: 80px;" name="code">
      <img src="http://localhost:8080/code//kaptchaServlet" alt=""> <br>
      <input type="submit" value="提交">
    </form>
  </body>
</html>
