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
        resp.sendRedirect("register.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("username");
        String password=req.getParameter("password");

//            HttpSession session = req.getSession(true);
//            session.setAttribute("username", userName);
//            session.setAttribute("password", password);


            User user=new User(userName,password);
            String name =user.getUserName();
            String upassword =user.getPassword();

            Repositary.saveUser(name,upassword);
        resp.sendRedirect("login");

    }
}
