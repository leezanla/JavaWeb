package work.leezan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        i. getRequestURI()   ------>   获取请求资源路径
        System.out.println("URI ---> " + req.getRequestURI());
//        ii. getRequestURL()   ------>   获取请求的统一资源定位符（绝对路径）
        System.out.println("URL ---> " + req.getRequestURL());
//        iii. getRemoteHost()   ------>   获取客户端的ip地址
        System.out.println("客户端地址：" + req.getRemoteHost());
//        iv. getHeader()   ------>   获取请求头
        System.out.println("请求头User-Agent ---> " + req.getHeader("User-Agent"));
//        getMethod()   ------>   获取请求的方式（GET或者是POST）
        System.out.println("请求的方式" + req.getMethod());
    }
}
