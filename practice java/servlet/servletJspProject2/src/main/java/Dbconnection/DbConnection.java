package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
//    public static Connection db_connection() throws SQLException {
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_product","root","Shahin@1205");
//        return connection;
//    }

    public static Connection db_connection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jsp_product",
                "root",
                "Shahin@1205");
    }
}
