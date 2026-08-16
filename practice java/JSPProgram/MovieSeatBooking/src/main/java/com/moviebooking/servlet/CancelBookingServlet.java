package com.moviebooking.servlet;

import com.moviebooking.dao.BookingDAO;
import com.moviebooking.dao.SeatDAO;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/cancelBooking")
public class CancelBookingServlet
        extends HttpServlet{

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException{

        int bookingId =
                Integer.parseInt(
                        request.getParameter("id"));

        int movieId =
                Integer.parseInt(
                        request.getParameter("movieId"));

        String seat =
                request.getParameter("seat");

        BookingDAO bookingDAO =
                new BookingDAO();

        SeatDAO seatDAO =
                new SeatDAO();

        bookingDAO.deleteBooking(
                bookingId);

        seatDAO.releaseSeat(
                movieId,
                seat);

        response.sendRedirect(
                "myBookings.jsp");
    }
}