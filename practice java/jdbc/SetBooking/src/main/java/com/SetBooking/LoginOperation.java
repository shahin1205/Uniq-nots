package com.SetBooking;

import java.util.Scanner;

public class LoginOperation {
    static Scanner sc=new Scanner(System.in);
    public static void adminLogin(UserDetails user){
        System.out.println("which one do you want");
        System.out.println("pres 1 for move added");
        int a=sc.nextInt();
        switch (a){
            case 1:
                Movies.addMove(user);
        }
    }
    public  static void userLogin(UserDetails user){
        while(true) {
            System.out.println("which one do you want");
            System.out.println("pres 1 for show all moves 2 for book movies 3 for cancel movie 4 for exit");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    Movies.showMove(user);
                    break;
                case 2:
                    MoveBooking.movieBooking(user);
                    break;
                case 3:
                    CancelBooking.cancel(user);
                    break;
                case 4:
                    return;
            }
        }
    }

}
