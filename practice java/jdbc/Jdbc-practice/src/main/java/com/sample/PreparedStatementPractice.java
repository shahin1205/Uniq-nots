package com.sample;

import java.sql.*;

public class PreparedStatementPractice {
    public static void main( String[] args )
    {
        String url="jdbc:mysql://localhost:3306/my_database ";
        String user= "root";
        String password ="Shahin@1205";


        String sql="select id,name from users where id = 1";



        try(Connection connection= DriverManager.getConnection(url,user,password)) {

            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

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
