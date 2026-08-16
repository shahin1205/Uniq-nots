package com.moviebooking.servlet;

import com.moviebooking.dao.UserDAO;
import com.moviebooking.model.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet
        extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name =
                request.getParameter("name");

        String email =
                request.getParameter("email");

        String password =
                request.getParameter("password");

        String role =
                request.getParameter("role");

        User user =
                new User(name,email,password,role);

        UserDAO dao =
                new UserDAO();

        if(dao.saveUser(user)) {

            response.sendRedirect("login.jsp");

        } else {

            response.getWriter()
                    .println("Registration Failed");
        }
    }
}