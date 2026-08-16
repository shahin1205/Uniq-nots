package com.InsertImage;

import java.io.*;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class InsertImage
{
    public static void main( String[] args ) throws SQLException, IOException {
      Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/insert_image","root","Shahin@1205");
      String query= "insert into image value (?,?,?)";

      PreparedStatement statement= connection.prepareStatement(query);

      statement.setInt(1, 101);
      statement.setString(2,"shahin");
      InputStream inputStream=new FileInputStream(new File("C:\\Users\\shahin\\OneDrive\\Pictures\\Screenshots\\voteId.png"));
      statement.setBlob(3,inputStream,inputStream.available());

      int a=statement.executeUpdate();
      System.out.println(a+"rows(s) affected");

    }
}
