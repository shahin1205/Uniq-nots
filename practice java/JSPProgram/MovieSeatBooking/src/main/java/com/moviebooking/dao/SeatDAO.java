package com.moviebooking.dao;

import com.moviebooking.model.Seat;
import com.moviebooking.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SeatDAO {

    public void generateSeats(
            int movieId,
            int rows,
            int seatsPerRow){

        try{

            Connection con=
                    DBConnection.getConnection();

            for(int i=0;i<rows;i++){

                char row=
                        (char)('A'+i);

                for(int j=1;
                    j<=seatsPerRow;
                    j++){

                    String seat=
                            row+""+j;

                    String sql=
                            "insert into seats(movie_id,seat_number,status) values(?,?,?)";

                    PreparedStatement ps=
                            con.prepareStatement(sql);

                    ps.setInt(1,movieId);
                    ps.setString(2,seat);
                    ps.setString(3,"AVAILABLE");

                    ps.executeUpdate();
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Seat> getSeatsByMovieId(
            int movieId){

        List<Seat> list =
                new ArrayList<>();

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from seats where movie_id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,movieId);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                Seat seat =
                        new Seat();

                seat.setId(
                        rs.getInt("id"));

                seat.setMovieId(
                        rs.getInt("movie_id"));

                seat.setSeatNumber(
                        rs.getString("seat_number"));

                seat.setStatus(
                        rs.getString("status"));

                list.add(seat);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public void updateSeatStatus(
            int movieId,
            String seatNumber){

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "update seats set status='BOOKED' where movie_id=? and seat_number=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,movieId);
            ps.setString(2,seatNumber);

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    ////-----------------------------------------

    public void releaseSeat(
            int movieId,
            String seatNumber){

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "update seats set status='AVAILABLE' where movie_id=? and seat_number=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1,movieId);

            ps.setString(2,seatNumber);

            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}