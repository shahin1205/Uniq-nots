package com.SetBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    public  static void userLogin() throws SQLException {

        Scanner sc=new Scanner(System.in);
        Connection connection=null;
        System.out.println("enter the email");
        String email=sc.nextLine();
        System.out.println("Enter the password");
        String password= sc.nextLine();
        try {
            connection=DbConnection.db_connection();
            String LoginQuery="select * from user_details where email=? and password=?";

            PreparedStatement ps=connection.prepareStatement(LoginQuery);
            ps.setString(1,email);
            ps.setString(2,password);

            ResultSet executed=ps.executeQuery();

            if (executed.next()) {
                int id=executed.getInt("id");
                String name = executed.getString("name");
                String mail = executed.getString("email");
                String pass = executed.getString("password");
                String role = executed.getString("role");
                Role userRole = Role.valueOf(role);

//                System.out.println("name - " + name + " email - " + mail + " password - " + pass);
                UserDetails user = new UserDetails(id,name, mail, pass, userRole);
                if (userRole == Role.ADMIN){
                    LoginOperation.adminLogin(user);
                }
                else if (userRole == Role.USER)
                {
                    LoginOperation.userLogin(user);
//                    System.out.println("user");
                }
                else {
                    System.out.println("Invalit roles");
                }
            }
            else {
                System.out.println("Invalid user");
            }


            ps.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();

        }

    }
}
