package servletCookieLogin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/login1")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println(
                "<form action=\"login1\" method=\"post\">\n" +
                        "\n" +
                        "    <label for=\"name\">Name</label>\n" +
                        "    <input type=\"text\" name=\"username\" id=\"name\">\n" +
                        "\n" +
                        "    <label for=\"password\">Password</label>\n" +
                        "    <input type=\"password\" name=\"password\" id=\"password\">\n" +
                        "\n" +
                        "    <button type=\"submit\">Submit</button>\n" +
                        "</form>"
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("username");
        String password=req.getParameter("password");

        Cookie logcookie=new Cookie("username",userName);
        Cookie logcookie1=new Cookie("password",password);

        logcookie.setMaxAge(60*60*48);
        logcookie1.setMaxAge(60*60*48);

//        logcookie.setHttpOnly(true);
//        logcookie1.setHttpOnly(true);

        resp.addCookie(logcookie);
        resp.addCookie(logcookie1);

        resp.sendRedirect("home1");
    }
}
