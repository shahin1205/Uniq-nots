package com.moviebooking.servlet;

import com.moviebooking.dao.MovieDAO;
import com.moviebooking.dao.SeatDAO;
import com.moviebooking.model.Movie;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/addMovie")
public class AddMovieServlet
        extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        String movieName=
                request.getParameter("movieName");

        String showDate=
                request.getParameter("showDate");

        String showTime=
                request.getParameter("showTime");

        double price=
                Double.parseDouble(
                        request.getParameter("price"));

        int rows=
                Integer.parseInt(
                        request.getParameter("rowsCount"));

        int seats=
                Integer.parseInt(
                        request.getParameter("seatsPerRow"));

        Movie movie=
                new Movie(
                        movieName,
                        showDate,
                        showTime,
                        price,
                        rows,
                        seats);

        MovieDAO movieDAO=
                new MovieDAO();

        int movieId=
                movieDAO.addMovie(movie);

        SeatDAO seatDAO=
                new SeatDAO();

        seatDAO.generateSeats(
                movieId,
                rows,
                seats);

        response.sendRedirect(
                "adminDashboard.jsp");
    }
}