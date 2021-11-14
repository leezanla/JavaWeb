package work.leezan.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletConfig().getServletContext();
        //获取当前工程路径  格式：/工程路径
        System.out.println("当前的工程路径：" + context.getContextPath());

        //获取工程部署后在服务器硬盘上的绝对路径
        /**
         * 下面的 "/" 斜杠被服务器解析地址为：http://ip:port/工程名/  映射到idea代码的web目录
         */
        System.out.println("工程部署的路径是：" + context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是：" + context.getRealPath("/css"));
        System.out.println("工程下的imgs目录的绝对路径是：" + context.getRealPath("/"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
