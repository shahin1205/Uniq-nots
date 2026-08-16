 package com.moviebooking.servlet;

import com.moviebooking.dao.UserDAO;
import com.moviebooking.model.User;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        String email=
                request.getParameter("email");

        String password=
                request.getParameter("password");

        UserDAO dao=
                new UserDAO();

        User user=
                dao.login(email,password);

        if(user!=null){

            HttpSession session=
                    request.getSession();

            session.setAttribute("user",user);

            if(user.getRole()
                    .equalsIgnoreCase("ADMIN")){

                response.sendRedirect(
                        "adminDashboard.jsp");

            }else{

                response.sendRedirect(
                        "userDashboard.jsp");
            }

        }else{

            response.getWriter()
                    .println("Invalid Login");
        }
    }
}