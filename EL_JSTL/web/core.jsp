<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/24/2021
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%--i. <c:set/>  (使用很少)
      作用：set标签可以往域中保存数据
      域对象.setAttribute(key,value);
      scope属性是设置保存到哪个域
        page表示PageContext域（默认值）
        request表示Request域
        session表示Session域
        application表示Servletcontext-param域
      var属性设置key是多少
      value属性设置value是多少
    --%>

    ${requestScope.aa}
    <c:set scope="request" var="aa" value="a的值"></c:set>
    ${requestScope.aa}


    <%--<c:if>
        作用：if标签用来做if判断
        test属性表示判断的条件
    --%>
    <c:if test="${12==12}">
      <h1>12等于12</h1>
    </c:if>


    <hr>

    <%--
    <c:choose> <c:when> <c:otherwise>标签
        作用：多路判断。跟 switch .. case … default 非常接近
        choose标签开始选择判断
        when标签表示每一种判断情况
          test属性表示当前这种判断情况的值
        otherwise标签表示剩下的情况
    <c:choose> <c:when> <c:otherwise>标签使用时需要注意的点
        1、标签是不能使用html注释，要使用jsp注释
        2、when标签的父标签一定要是choose标签
    --%>
    <%
      request.setAttribute("height", 175);
    %>
    <c:choose>
      <c:when test="${requestScope.height >= 180}">
        <h1>很高</h1>
      </c:when>
      <c:when test="${requestScope.height >= 170}">
        <h1>还可以</h1>
      </c:when>
      <c:otherwise>
        <h1>一般</h1>
      </c:otherwise>
    </c:choose>


  </body>
</html>
