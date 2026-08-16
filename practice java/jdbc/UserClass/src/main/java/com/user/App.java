package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class User{
private  int id;
private String name;
private float salary;

    public User() {
    }

    public User(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class App 
{
    public static void main( String[] args ) throws SQLException
    {

        User user=new User(1,"shahin",20000);

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data","root","Shahin@1205");

        String query="insert into user value (?,?,?)";
         PreparedStatement ps= connection.prepareStatement(query);

         ps.setInt(1,user.getId());
         ps.setString(2,user.getName());
         ps.setFloat(3,user.getSalary());

        int rows=ps.executeUpdate();

        System.out.println(rows+" data successfully added");
        ps.close();
        connection.close();


    }
}
