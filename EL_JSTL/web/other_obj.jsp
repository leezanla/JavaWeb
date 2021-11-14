<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 5:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    输出请求参数username的值：${param.username} <br>
    输出请求参数password的值：${param.password} <br>
    输出请求参数username的值：${paramValues.hobby[0]} <br>
    输出请求参数username的值：${paramValues.hobby[1]} <br>

    输出请求头[user-Agent]的值：${header['user-Agent']} <br>
    输出请求头[Connection]的值：${header['Connection']} <br>
    <hr>

    获取cookie：${cookie} <br>
    获取cookie的名称：${cookie.JSESSIONID.name} <br>
    获取cookie的值：${cookie.JSESSIONID.value} <br>
    <hr>


    ${initParam} <br>

    ${initParam.username} <br>
    ${initParam.url} <br>

















  </body>
</html>
