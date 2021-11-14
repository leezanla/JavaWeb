package work.leezan.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        ServletContext context = getServletConfig().getServletContext();
//        也可以是下面的这种步骤来创建ServletContext
        ServletContext context = getServletContext();
        context.setAttribute("key1", "value1");
        System.out.println(context.getAttribute("key1"));
        System.out.println(context.getAttribute("key1"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
