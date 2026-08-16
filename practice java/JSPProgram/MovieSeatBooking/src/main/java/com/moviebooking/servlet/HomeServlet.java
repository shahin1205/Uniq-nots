package com.moviebooking.servlet;

import com.moviebooking.model.User;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        HttpSession session =
                request.getSession(false);

        if(session == null){

            response.sendRedirect("login.jsp");
            return;
        }

        User user =
                (User) session.getAttribute("user");

        if(user == null){

            response.sendRedirect("login.jsp");
            return;
        }

        if(user.getRole()
                .equalsIgnoreCase("ADMIN")){

            response.sendRedirect(
                    "adminDashboard.jsp");

        }else{

            response.sendRedirect(
                    "userDashboard.jsp");
        }
    }
}