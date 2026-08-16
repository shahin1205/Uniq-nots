package sessionPractice;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/B")
public class Class2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession(false);

       String username = (String)session.getAttribute("username");
       String password =(String) session.getAttribute("password");

        System.out.println(username+ " - "+ password);
        resp.getWriter().println(username+ " - "+ password);
    }
}

