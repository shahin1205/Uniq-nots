package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println(
"<form action=\"login\" method=\"post\">\n" +
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
//        String userName=req.getParameter("username");
//        String password=req.getParameter("password");
//
//        if (userName.equals(userName)&password.equals(password)) {
//            HttpSession session = req.getSession(true);
//            session.setAttribute("username", userName);
//            session.setAttribute("password", password);
//            resp.sendRedirect("home");
//        }
//        else {
//            resp.getWriter().println("user not fond");
//        }


        HttpSession session=req.getSession(false);
        String userName=req.getParameter("username");
        String password=req.getParameter("password");

        if (session!=null){
            resp.setContentType("text/html");
            String name =(String)session.getAttribute("username");
            String pas =(String)session.getAttribute("password");
            if (userName.equals(name)&&password.equals(pas)) {
            resp.sendRedirect("home");
        }
            else {
                resp.getWriter().println("invalit user");
            }
        }
    }
}
