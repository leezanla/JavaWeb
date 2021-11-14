<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/24/2021
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <form action="http://localhost:8080/EL/uploadServlet" method="post" enctype="multipart/form-data">
      用户名：<input type="text" name="username"> <br>
      头像：<input type="file" name="photo"> <br>
      <input type="submit" value="上传">
    </form>
  </body>
</html>
