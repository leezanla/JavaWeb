package work.leezan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(resp.getCharacterEncoding()); //默认是ISO-8859-1，这个字符集不支持中文
//        因此我们需要设置一下字符集
//        resp.setCharacterEncoding("UTF-8");
//
////        我们上面只是设置了服务器使用的是UTF-8的字符集，没有告诉浏览器也使用utf-8的字符集，因此只是上面一个设置
////        在浏览器上显示的还是乱码
////        通过响应头,告诉浏览器也使用utf-8的字符集
//        resp.setHeader("Content-Type", "text/html; charset=UTF-8");
        //下面这个代码它会同时设置服务器和客户端都使用UTF-8字符集,还设置了响应头
        //但是这个方法一定要在获取流对象之前调用才会有效
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        writer.write("我们的时光");
    }
}
