package Dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection db_connection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_product","root","Shahin@1205");
        return connection;
    }
}
