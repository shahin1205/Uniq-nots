package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/my_database ";
        String user= "root";
        String password ="Shahin@1205";



        try(Connection connection= DriverManager.getConnection(url,user,password)) {

            String sql1="insert into users value(3,'visal') ";
             PreparedStatement preparedStatement= connection.prepareStatement(sql1);
            int resultSet1=preparedStatement.executeUpdate();
            System.out.println(resultSet1);

            String sql="select id,name from users ";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(" id " + id + " name " + name);
            }
        }
        catch (SQLException e){
            System.out.println("mgjhvjhsg v"+ e.getMessage());
            e.printStackTrace();
        }
    }
}
