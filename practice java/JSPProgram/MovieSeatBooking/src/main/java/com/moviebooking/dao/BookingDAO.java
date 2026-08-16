package com.moviebooking.dao;

import com.moviebooking.model.Booking;
import com.moviebooking.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    public boolean bookSeat(
            int userId,
            int movieId,
            String seatNumber){

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "insert into bookings(user_id,movie_id,seat_number) values(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,userId);
            ps.setInt(2,movieId);
            ps.setString(3,seatNumber);

            ps.executeUpdate();

            return true;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }


    ///------------------------------------------

    public List<Booking> getBookingsByUserId(
            int userId){

        List<Booking> list =
                new ArrayList<>();

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from bookings where user_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,userId);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                Booking booking =
                        new Booking();

                booking.setId(
                        rs.getInt("id"));

                booking.setUserId(
                        rs.getInt("user_id"));

                booking.setMovieId(
                        rs.getInt("movie_id"));

                booking.setSeatNumber(
                        rs.getString("seat_number"));

                list.add(booking);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    //---------------------------------

    public void deleteBooking(
            int bookingId){

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "delete from bookings where id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,bookingId);

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    ////------------------------------
    public List<Booking> getAllBookings(){

        List<Booking> list =
                new ArrayList<>();

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from bookings";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                Booking booking =
                        new Booking();

                booking.setId(
                        rs.getInt("id"));

                booking.setUserId(
                        rs.getInt("user_id"));

                booking.setMovieId(
                        rs.getInt("movie_id"));

                booking.setSeatNumber(
                        rs.getString("seat_number"));

                list.add(booking);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
