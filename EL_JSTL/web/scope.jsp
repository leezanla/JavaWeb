<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%
      pageContext.setAttribute("key","pageContext");
      request.setAttribute("key","request");
      session.setAttribute("key","session");
      application.setAttribute("key","application");
    %>
    ${pageScope.key}
    ${requestScope.key}
    ${sessionScope.key}
    ${applicationScope.key} <%--可以选择的输出存放参数名一样的不同域中的数据-->
  </body>
</html>
