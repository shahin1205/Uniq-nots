package servletcookies1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie1")
public class class1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username="raja";
        String password="123";

        Cookie cookie=new Cookie("username",username);
        Cookie cookie1=new Cookie("password",password);

        cookie.setMaxAge(200);
        cookie1.setMaxAge(200);

//        cookie.setHttpOnly(true);
//        cookie1.setHttpOnly(true);
//
//        cookie.setSecure(true);
//        cookie1.setSecure(true);
//
//        cookie.setPath(username);
//        cookie1.setPath(password);
//
//        cookie.setDomain("shahin");
//        cookie1.setDomain("shahin");

        resp.addCookie(cookie);
        resp.addCookie(cookie1);



    }
}
