package com.moviebooking.servlet;

import com.moviebooking.dao.MovieDAO;
import com.moviebooking.model.User;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/deleteMovie")
public class DeleteMovieServlet extends HttpServlet {

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

        // ADMIN ONLY
        if(!user.getRole().equalsIgnoreCase("ADMIN")){

            response.getWriter().println(
                    "<h2>Access Denied</h2>"
            );

            return;
        }

        int movieId =
                Integer.parseInt(
                        request.getParameter("id"));

        MovieDAO dao =
                new MovieDAO();

        dao.deleteMovie(movieId);

        response.sendRedirect("viewMovies.jsp");
    }
}