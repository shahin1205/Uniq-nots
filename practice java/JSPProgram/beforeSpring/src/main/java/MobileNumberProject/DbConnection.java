package MobileNumberProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection dbConnection () throws SQLException {

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mobileNumber","root","Shahin@1205");
            return connection;


    }
}
