package com.moviebooking.dao;

import com.moviebooking.model.User;
import com.moviebooking.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public boolean saveUser(User user) {

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "insert into users(name,email,password,role) values(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1,user.getName());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getRole());

            return ps.executeUpdate()>0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public User login(String email,String password){

        User user=null;

        try{

            Connection con=
                    DBConnection.getConnection();

            String sql=
                    "select * from users where email=? and password=?";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            ps.setString(1,email);
            ps.setString(2,password);

            ResultSet rs=
                    ps.executeQuery();

            if(rs.next()){

                user=new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("role"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return user;
    }

    ////-------------------------------------------------

    public List<User> getAllUsers(){

        List<User> list =
                new ArrayList<>();

        try{

            Connection con =
                    DBConnection.getConnection();

            String sql =
                    "select * from users";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            while(rs.next()){

                User user =
                        new User();

                user.setId(
                        rs.getInt("id"));

                user.setName(
                        rs.getString("name"));

                user.setEmail(
                        rs.getString("email"));

                user.setRole(
                        rs.getString("role"));

                list.add(user);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }
}