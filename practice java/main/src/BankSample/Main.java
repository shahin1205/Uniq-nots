package BankSample;


import java.util.ArrayList;
import java.util.Scanner;

 class User {
    int userId;
    String password;
    double balance;

    public User(int userId, String password) {
        this.userId = userId;
        this.password = password;
        this.balance = 0.0;
    }
}


 class Bank {

    // Deposit amount
    public void deposit(ArrayList<User> users, int userId, double amount) {
        for (User u : users) {
            if (u.userId == userId) {
                u.balance += amount;
                System.out.println("Amount deposited successfully!");
                return;
            }
        }
        System.out.println("User not found!");
    }
    public void checkBalance(ArrayList<User> users, int userId,String passwored) {
        for (User u : users) {
            if (u.userId == userId) {
                if(u.password.equals(passwored)) {
                    System.out.println("Balance: " + u.balance);
                    }
                else{
                    System.out.println("Invalid password");
                }
                return;
            }
        }
        System.out.println("User not found!");
    }
}

public class Main {
    public static void main(String [] args){
        ArrayList<User> userList = new ArrayList<>();
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add User");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    userList.add(new User(id, pass));
                    System.out.println("User added successfully!");
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int dId = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();

                    bank.deposit(userList, dId, amount);
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    int cId = sc.nextInt();

                    System.out.println("Enter the Password");
                    String passCheck=sc.next();
                    bank.checkBalance(userList, cId, passCheck);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
