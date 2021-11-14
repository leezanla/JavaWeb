package work.leezan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("曾至此一游Response1");
////        设置响应状态码302表示,表示重定向(已经搬迁)
//        resp.setStatus(302);
////        设置响应头,说明新的地址在那里
//        resp.setHeader("Location", "Http://localhost:8080/servlet2/response2");
        resp.sendRedirect("Http://localhost:8080/servlet2/response2");
    }
}
