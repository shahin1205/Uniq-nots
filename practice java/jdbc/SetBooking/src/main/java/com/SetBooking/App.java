package com.SetBooking;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("pres 1 for register and 2 for login");
        int regLogin=sc.nextInt();

        switch (regLogin){
            case 1:
                try {
                    Register.userRegister();
                }catch (SQLException e){
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    Login.userLogin();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Please choose correct option");
        }

//        try {
//            Register.userRegister();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Login.userLogin();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
