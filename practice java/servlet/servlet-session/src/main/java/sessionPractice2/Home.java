package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/home")
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println(
                " \" <form action='logout' method='post'>\" \n" +
                        "  \" <button type='submit' class='logout-btn'>Logout</button>\" \n" +
                        "  \" </form>\""
        );

        HttpSession session=req.getSession(false);
        if (session!=null){

            resp.getWriter().println("<h1>home</h1>"+session.getAttribute("username"));
        }else {
            resp.sendRedirect("login");
        }

    }
}
