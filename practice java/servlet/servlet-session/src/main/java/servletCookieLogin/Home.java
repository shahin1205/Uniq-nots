package servletCookieLogin;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/home1")
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println(
                " \" <form action='logout1' method='post'>\" \n" +
                        "  \" <button type='submit' class='logout-btn'>Logout</button>\" \n" +
                        "  \" </form>\""
        );

        Cookie[] cookies = req.getCookies();
        resp.getWriter().println("<h1>home</h1>");

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    resp.getWriter().println(cookie.getName() + " - " + cookie.getValue());
                }
            } else {
                resp.sendRedirect("login1");
            }

    }
}
