package com.SetBooking;



import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

class Movie{
   private int movie_id;
   private String movie_name ;
   private int total_seats;
   private int available_seats ;
   private LocalDate update_date;

    public Movie() {
    }

    public Movie(String movie_name, int total_seats, int available_seats,LocalDate update_date) {
        this.movie_name = movie_name;
        this.total_seats = total_seats;
        this.available_seats = available_seats;
        this.update_date=update_date;
    }

    public LocalDate getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDate update_date) {
        this.update_date = update_date;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", movie_name='" + movie_name + '\'' +
                ", total_seats=" + total_seats +
                ", available_seats=" + available_seats +
                ", update_date=" + update_date +
                '}';
    }
}
public class Movies {

    public static void addMove(UserDetails user)  {

        if (user.getRole()==Role.ADMIN){
            Movie movie=new Movie();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the move name");
            String moveName=sc.nextLine();
            System.out.println("Enter the seat count ");
            int totalSeat=sc.nextInt();
            System.out.println("Enter the available seat");
            int availableSeats=sc.nextInt();
            LocalDate updateDate=LocalDate.now();
            try {
                Connection connection=DbConnection.db_connection();
                String moveAdd="insert into movies (movie_name,total_seats,available_seats,update_date) value(?,?,?,?)";
                PreparedStatement ps=connection.prepareStatement(moveAdd);
                ps.setString(1,moveName);
                ps.setInt(2,totalSeat);
                ps.setInt(3,availableSeats);
                ps.setDate(4, Date.valueOf(updateDate));


                ps.executeUpdate();
                System.out.println("Move successfully added");
                ps.close();
                connection.close();

            }catch (SQLException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("Only ADMIN use");
        }
    }

    public static void showMove(UserDetails user) {
        try {
            Connection connection= DbConnection.db_connection();
            String showMove="select * from movies";

            Statement ps=connection.createStatement();
             ResultSet rs= ps.executeQuery(showMove);

             while (rs.next()){
                 String moveName=rs.getString("movie_name");
                 int totalSeats=rs.getInt("total_seats");
                 int availableSeats= rs.getInt("available_seats");
                 LocalDate updatedate= rs.getDate("update_date").toLocalDate();
                 System.out.println("Move Name- "+ moveName+" Total Seat- "+totalSeats+" Available Seat- "+availableSeats+" update date - "+updatedate);
             }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }



}
