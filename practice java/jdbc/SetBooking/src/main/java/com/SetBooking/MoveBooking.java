package com.SetBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MoveBooking {

    public  static void movieBooking(UserDetails user){


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movie name");
        String movieName=sc.nextLine();
        System.out.println("how many seat do you want");
        int bookingseat=sc.nextInt();
        String searchMovie="select * from movies where movie_name=?";

        try {
            Connection connection=DbConnection.db_connection();
            connection.setAutoCommit(false);
            PreparedStatement ps=connection.prepareStatement(searchMovie);
            ps.setString(1, movieName);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("movie_name");
                int availableSeats=rs.getInt("available_seats");
//                System.out.println(name);
                if (availableSeats>=bookingseat){
                    String bookingQuery="insert into bookings (user_id,movie_name,seats_booked) value (?,?,?)";
                    PreparedStatement ps1=connection.prepareStatement(bookingQuery);
                    ps1.setInt(1,user.getId());
                    ps1.setString(2,name);
                    ps1.setInt(3,bookingseat);
                    ps1.executeUpdate();

                    String updateAvailableSeat="update movies set available_seats=? where movie_name=? ";
                    PreparedStatement ps3=connection.prepareStatement(updateAvailableSeat);
                    ps3.setInt(1,availableSeats-bookingseat);
                    ps3.setString(2,name);
                    ps3.executeUpdate();

                    connection.commit();
                }
                else {
                    System.out.println("seat not available ");
                }
            }




        }catch (SQLException e){
            e.printStackTrace();
        }
    }



}
