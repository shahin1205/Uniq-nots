package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<form action=\"register\" method=\"post\">\n" +

                "    <label for=\"name\" >Name</label>\n" +
                "    <input type=\"text\" name=\"username\" id=\"name\">\n" +
                "\n" +
                "    <label for=\"password\" >password</label>\n" +
                "    <input type=\"password\" name=\"password\" id=\"password\">\n" +
                "\n" +
                "    <button type=\"submit\"> submit</button>\n" +
                "    </form>\n"
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("username");
        String password=req.getParameter("password");

            HttpSession session = req.getSession(true);
            session.setAttribute("username", userName);
            session.setAttribute("password", password);
            resp.sendRedirect("login");
    }
}
