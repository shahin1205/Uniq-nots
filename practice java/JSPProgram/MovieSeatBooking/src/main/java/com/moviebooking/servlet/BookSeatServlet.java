package com.moviebooking.servlet;

import com.moviebooking.dao.BookingDAO;
import com.moviebooking.dao.SeatDAO;
import com.moviebooking.model.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/bookSeat")
public class BookSeatServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        HttpSession session = request.getSession();

        User user =
                (User) session.getAttribute("user");

        if(user == null){
            response.sendRedirect("login.jsp");
            return;
        }

        int movieId =
                Integer.parseInt(
                        request.getParameter("movieId"));

        String[] seats =
                request.getParameterValues("seat");

        // Important Fix
        if(seats == null || seats.length == 0){

            response.getWriter().println(
                    "<h2>Please select at least one seat!</h2>" +
                            "<br>" +
                            "<a href='javascript:history.back()'>Go Back</a>"
            );

            return;
        }

        BookingDAO bookingDAO =
                new BookingDAO();

        SeatDAO seatDAO =
                new SeatDAO();

        for(String seat : seats){

            bookingDAO.bookSeat(
                    user.getId(),
                    movieId,
                    seat);

            seatDAO.updateSeatStatus(
                    movieId,
                    seat);
        }

        response.sendRedirect("myBookings.jsp");
    }
}