<%--
  Created by IntelliJ IDEA.
  User: ALFIE
  Date: 10/23/2021
  Time: 4:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <%--
    request.getScheme() 它可以看到请求的协议
    request.getServerName() 获取请求的服务器ip或域名
    request.getServetPort() 获取请求的服务器端口号
    request.getContextPath() 获取工程路径
    request.getMethod() 获取请求的方式（GET或POST）
    request.getRemoteHost() 获取客户端的ip地址
    session.getId() 获取会话的唯一标识
    --%>
    1、协议:${pageContext.request.scheme} <br>
    2、服务器ip:${pageContext.request.serverName} <br>
    3、服务器端口:${pageContext.request.serverPort} <br>
    4、获取工程路径:${pageContext.request.servletPath} <br>
    5、获取请求方法:${pageContext.request.method} <br>
    6、获取客户端ip地址:${pageContext.request.remoteHost} <br>
    7、获取会话的id编号:${pageContext.session.id} <br>
    <%--也可以对上面的内容进行简写--%>
    <%
      pageContext.setAttribute("req", request);
    %>
      1、协议:${req.scheme} <br>
      2、服务器ip:${req.serverName} <br>
      3、服务器端口:${req.serverPort} <br>
      4、获取工程路径:${req.servletPath} <br>
      5、获取请求方法:${req.method} <br>
      6、获取客户端ip地址:${req.remoteHost} <br>
      7、获取会话的id编号:${pageContext.session.id} <br>
  </body>
</html>
