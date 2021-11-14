<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/24/2021
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%--
      例题：遍历1到10输出
        begin属性设置开始的索引
        end属性设置结束的索引
        var属性表示遍历的变量
        step属性表示步长
    --%>
    <c:forEach begin="1" end="10" var="i" step="2">
      ${i}
    </c:forEach>


    <%--
      遍历数组
        在java的是增强for循环
        for(Object item : arr)
      items表示遍历的数据源（）
    --%>
    <%
      request.setAttribute("arr", new String[]{"12", "32", "5235"});
    %>
    <c:forEach items="${requestScope.arr}" var="item">
      ${item}  <br>
    </c:forEach>
  </body>
</html>
