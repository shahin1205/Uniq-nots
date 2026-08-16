package sessionPractice2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session=req.getSession(false);
//
//        if(session!=null){
//            session.invalidate();
//            resp.sendRedirect("login");
//        }
//        else {
//            resp.sendRedirect("login");
//        }

        Cookie[] cookies=req.getCookies();
        for(Cookie cookie:cookies){
//            System.out.println(cookie.getName());
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }
        resp.sendRedirect("login");
    }
}
