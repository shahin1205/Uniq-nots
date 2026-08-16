package com.SetBooking;

import java.sql.*;
import java.util.Scanner;

public class CancelBooking {

    public static void cancel(UserDetails user){
        Scanner sc=new Scanner(System.in);
        try {
            Connection connection=DbConnection.db_connection();
            String q="select * from bookings where user_id=?";
            PreparedStatement ps=connection.prepareStatement(q);
            ps.setInt(1,user.getId());
            ResultSet rs=ps.executeQuery();
            ;
            while (rs.next()){
                String movieName=rs.getString("movie_name");
                 int seatCount= rs.getInt("seats_booked");

                System.out.println("Movie name - "+ movieName+" seat count - "+seatCount);
            }

            System.out.println("which move do you want cancel");
            String movieName=sc.nextLine();
///=----------------------------------------------------------------------
            String seatQuery =
                    "select seats_booked from bookings where user_id=? and movie_name=?";

            PreparedStatement seatPs =
                    connection.prepareStatement(seatQuery);

            seatPs.setInt(1, user.getId());
            seatPs.setString(2, movieName);

            ResultSet seatRs = seatPs.executeQuery();

            int seatCount1 = 0;

            if(seatRs.next()){
                seatCount1 = seatRs.getInt("seats_booked");
            }

            ///---------------------------------------------------------------------------


            String cancelQuery= "delete from bookings where user_id =? and movie_name = ?";
            PreparedStatement ps1=connection.prepareStatement(cancelQuery);
            ps1.setInt(1,user.getId());
            ps1.setString(2,movieName);


                int successCancel=ps1.executeUpdate();

                String allMovie="select available_seats from movies where movie_name=?";
                PreparedStatement ps2=connection.prepareStatement(allMovie);
                ps2.setString(1,movieName);
                ResultSet rss=ps2.executeQuery();


                int available_seats=0;
                while (rss.next()){
                    available_seats=rss.getInt("available_seats");
                }


                String updateSeat="update movies set available_seats=? where movie_name=?";
                PreparedStatement ps3=connection.prepareStatement(updateSeat);
                ps3.setInt(1,available_seats+seatCount1);
                ps3.setString(2,movieName);
                int cancelRow=ps3.executeUpdate();
// -------------------------------------------------------------------------

            // get all move data


        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
