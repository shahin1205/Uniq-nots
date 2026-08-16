package com.moviebooking.dao;

import com.moviebooking.model.Movie;
import com.moviebooking.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    public int addMovie(Movie movie){

        int movieId=0;

        try{

            Connection con=
                    DBConnection.getConnection();

            String sql=
                    "insert into movies(movie_name,show_date,show_time,price,rows_count,seats_per_row) values(?,?,?,?,?,?)";

            PreparedStatement ps=
                    con.prepareStatement(
                            sql,
                            Statement.RETURN_GENERATED_KEYS
                    );

            ps.setString(1,
                    movie.getMovieName());

            ps.setString(2,
                    movie.getShowDate());

            ps.setString(3,
                    movie.getShowTime());

            ps.setDouble(4,
                    movie.getPrice());

            ps.setInt(5,
                    movie.getRowsCount());

            ps.setInt(6,
                    movie.getSeatsPerRow());

            ps.executeUpdate();

            ResultSet rs=
                    ps.getGeneratedKeys();

            if(rs.next()){

                movieId=
                        rs.getInt(1);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return movieId;
    }
////--------------------------------------------------------
    public List<Movie> getAllMovies(){

        List<Movie> list =
                new ArrayList<>();

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from movies";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                Movie movie =
                        new Movie();

                movie.setId(
                        rs.getInt("id"));

                movie.setMovieName(
                        rs.getString("movie_name"));

                movie.setShowDate(
                        rs.getString("show_date"));

                movie.setShowTime(
                        rs.getString("show_time"));

                movie.setPrice(
                        rs.getDouble("price"));

                list.add(movie);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public String getMovieNameById(int movieId){

        String movieName = "";

        try{

            Connection con = DBConnection.getConnection();

            String sql = "select movie_name from movies where id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, movieId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                movieName = rs.getString("movie_name");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return movieName;
    }

    public boolean deleteMovie(int movieId){

        try{

            Connection con =
                    DBConnection.getConnection();

            // Delete bookings
            PreparedStatement ps1 =
                    con.prepareStatement(
                            "delete from bookings where movie_id=?");

            ps1.setInt(1,movieId);
            ps1.executeUpdate();

            // Delete seats
            PreparedStatement ps2 =
                    con.prepareStatement(
                            "delete from seats where movie_id=?");

            ps2.setInt(1,movieId);
            ps2.executeUpdate();

            // Delete movie
            PreparedStatement ps3 =
                    con.prepareStatement(
                            "delete from movies where id=?");

            ps3.setInt(1,movieId);

            return ps3.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}