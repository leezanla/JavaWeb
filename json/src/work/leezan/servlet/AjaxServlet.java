package work.leezan.servlet;

import com.google.gson.Gson;
import work.leezan.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet{
    protected void ajaxMethod(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ajax请求过来了");
        Person person = new Person(1, "lee");
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryAjax请求过来了");
        Person person = new Person(1, "lee");
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGet请求过来了");
        Person person = new Person(1, "lee");
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryPost请求过来了");
        Person person = new Person(1, "lee");
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
    protected void jQueryGetJSON(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGetJSON请求过来了");
        Person person = new Person(1, "lee");
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person(1, "lee");
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("password"));
        Gson gson = new Gson();
        // 返回客户端的话必须要是发字符串的方式来进行传输
        String personString = gson.toJson(person);
        // 利用writer()方法来向客户端返回数据
        resp.getWriter().write(personString);
    }
}
