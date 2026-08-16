package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        resp.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
//      sessen
//        HttpSession session=req.getSession(true);


        String userName=req.getParameter("username");
        String password=req.getParameter("password");



        if (userName.isEmpty() && password.isEmpty()){
            resp.getWriter().print("<h1>illigal entry</h1>");
            resp.getWriter().println("<img src=\"/sessionhtmlpractice/images.jpeg\" alt=\"GIF\">");

        }
        else if (userName!=null && password!=null) {
            resp.setContentType("text/html");
            for (User user : Repositary.findByUser()) {
                if (user.getUserName().equals(userName)&&user.getPassword().equals(password)) {

                    ////sessen
//                    session.setAttribute("username",userName);
//                    session.setAttribute("password",password);

                    ////cookie
                    Cookie logname=new Cookie("username",userName);
                    Cookie logpassword=new Cookie("password",password);
                    logname.setMaxAge(60*60*48);
                    logpassword.setMaxAge(60*60*48);
                    resp.addCookie(logname);
                    resp.addCookie(logpassword);
                    resp.sendRedirect("home");

                }
                else {
                    resp.getWriter().println("<h1>Invalid user</h1>");
                    resp.getWriter().println("<img src=\"/sessionhtmlpractice/nanban-yaar-nee.gif\" alt=\"GIF\">");

                }
            }
//
        }
    }
}
