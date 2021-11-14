<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%
      Map<String, Object> map = new HashMap<String, Object>();
      map.put("aaa", "aaaValue");
      map.put("b.b.b", "bbbValue");
      request.setAttribute("map",map);
    %>
    ${map.aaa} <br>
    ${map["b.b.b"]}
  </body>
</html>
