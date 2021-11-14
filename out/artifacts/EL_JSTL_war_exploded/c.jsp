<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%
//      1、值为null值的时候，为空
      request.setAttribute("emptyNull",null);
//      2、值为空串的时候，为空
      request.setAttribute("emptyStr","");
//      3、值是Object类型数据，长度为零的时候为空
      request.setAttribute("emptyArr", new Object[]{});
//      4、list集合，元素个数为零的时候为空
      List<String> list = new ArrayList<String>();
      request.setAttribute("emptyList", list);
//      5、map集合，元素个数为零的时候为空
      Map<String, Object> map = new HashMap<String, Object>();
      request.setAttribute("emptyMap",map);
    %>
    ${empty emptyNull} <br>
    ${empty emptyStr} <br>
    ${empty emptyArr} <br>
    ${empty emptyList} <br>
    ${empty emptyMap} <br>


    ${12 eq 12 ? "你好吗" : "我很好"}

  </body>
</html>
