package work.leezan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if ("lee".equals(username) && "123456".equals(password)) {
            req.getSession().setAttribute("user", username);
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
