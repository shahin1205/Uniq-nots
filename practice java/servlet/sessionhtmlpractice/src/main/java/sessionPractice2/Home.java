package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/home")
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        resp.getWriter().println(
//                "<form action=\"logout\" method=\"post\">\n" +
//                        "    <button type=\"submit\" class=\"logout-btn\">Logout</button>\n" +
//                        "</form>"
//        );
//
//        HttpSession session=req.getSession(false);
//        if (session!=null){
//
//            resp.getWriter().println("<h1>home</h1>"+session.getAttribute("username"));
//
//            resp.getWriter().println("<p></p><img src=\"/sessionhtmlpractice/vijay-ok.gif\" alt=\"GIF\">");
//
//        }else {
//            resp.sendRedirect("login");
//        }

        resp.setContentType("text/html");
        resp.getWriter().println(
                " \" <form action='logout' method='post'>\" \n" +
                        "  \" <button type='submit' class='logout-btn'>Logout</button>\" \n" +
                        "  \" </form>\""
        );

//        Cookie[] cookies = req.getCookies();
        resp.getWriter().println("<h1>home</h1>");

        String username = null;
        String password = null;

        Cookie[] cookies = req.getCookies();

        if(cookies != null){
            for(Cookie cookie : cookies){

                if(cookie.getName().equals("username")){
                    username = cookie.getValue();
                }

                if(cookie.getName().equals("password")){
                    password = cookie.getValue();
                }
            }
        }

        if(username != null && password != null){

            for(User user : Repositary.findByUser()){

                if(user.getUserName().equals(username)
                        && user.getPassword().equals(password)){

                    resp.getWriter().println(
                            "<h1>Welcome " + user.getUserName() + "</h1>"
                    );
                    return;
                }
            }
        }

        resp.sendRedirect("login");

    }
}
