package com.SetBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static com.SetBooking.Role.ADMIN;

public class Register {

    public static void userRegister() throws SQLException {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the email");
        String email=sc.nextLine();
        System.out.println("Enter the password");
        String password=sc.nextLine();
        System.out.println("Enter USER or ADMIN");
        String role=sc.nextLine();
        Role userRole = Role.valueOf(role);

        UserDetails userDetails = new UserDetails(name,email,password,userRole);
        Connection connection = null;

        try {
            connection = DbConnection.db_connection();

            String registerQuery="insert into user_details(name,email,password,role) value(?,?,?,?) ";
            PreparedStatement ps=connection.prepareStatement(registerQuery);

            ps.setString(1,userDetails.getName());
            ps.setString(2,userDetails.getEmail());
            ps.setString(3,userDetails.getPassword());
            ps.setString(4,userDetails.getRole().toString());

            int registerRows= ps.executeUpdate();
            System.out.println("Successfully register " + registerRows);
            Login.userLogin();
            ps.close();
            connection.close();



        } catch(Exception e) {
            e.printStackTrace();

        }
    }
}