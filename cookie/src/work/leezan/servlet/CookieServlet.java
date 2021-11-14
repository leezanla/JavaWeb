package work.leezan.servlet;

import work.leezan.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // 方案一：
//        // 先创建一个要修改的同名的cookie对象
//        // 在构造器，同时赋于一个cookie值
//        Cookie cookie = new Cookie("key1", "newValue1");
//        // 调用response.addCookie(cookie) 通知客户端保存修改
//        resp.addCookie(cookie);
//
//        resp.getWriter().write("key1的cookie值已经修改好了");


//        方案二
//        1、先查找到需要修改的Cookie对象
        Cookie cookie = CookieUtils.findCookie("key2", req.getCookies());
        if (cookie != null) {
//        2、调用setValue()方法赋于新的Cookie值
            cookie.setValue("newValue2");
//        3、调用response.addCookie()通知客户端保存修改
            resp.addCookie(cookie);
        }

    }
    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("path1", "path1");
        // getContextPath()  ------>  得到的是工程路径
        cookie.setPath(req.getContextPath());// 表示工程路径后面跟着/abc   --->   /工程路径/abc
        resp.getWriter().write("创建一个带有Path路径的cookie");
    }
    protected void life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("life3600", "life3600");
        cookie.setMaxAge(60*60); //这个是以秒为单位的，设置cookie一小时之后被删除即是无效
        resp.addCookie(cookie);
        resp.getWriter().write("已经设置了存活一个小时的cookie");
    }
    protected void defaultNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        先找到你要删除的cooke对象
        Cookie cookie = CookieUtils.findCookie("key2", req.getCookies());
        if (cookie != null) {
//        调用setMaxAge(0);
            cookie.setMaxAge(0); // 0表示马上删除，都不需要等待浏览器关闭
//        调用response.addCookie(cookie);
            resp.addCookie(cookie);
            resp.getWriter().write("key2的cookie已经被删除了");
        }
    }
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("defaultLife", "defaultLife");
        cookie.setMaxAge(-1);// 设置存活时间
        resp.addCookie(cookie);
    }
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            // getName()方法返回cookie的key（名）
            resp.getWriter().write("Cookie[" + cookie.getName() +" = " + cookie.getValue() +"] <br>");
        }
    }

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建cookie对象
        Cookie cookie = new Cookie("key1", "value1");
        // 通知客户端保存cookie
        resp.addCookie(cookie);

        //cookie也可以创建和发送多个

        // 创建cookie对象
        Cookie cookie1 = new Cookie("key2", "value2");
        // 通知客户端保存cookie
        resp.addCookie(cookie1);
        resp.getWriter().write("cookie创建成功");
    }
}
