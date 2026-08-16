package com.InsertImage;

import java.io.*;
import java.sql.*;
import java.util.Arrays;

public class Download {
    public static void main(String[] args) throws SQLException, IOException {
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/insert_image","root","Shahin@1205");
        String query="select * from image";
        PreparedStatement ps=  connection.prepareStatement(query);
       ResultSet resultSet= ps.executeQuery();

       while(resultSet.next()){
           Blob blob=resultSet.getBlob(3);
           InputStream input=blob.getBinaryStream();
           FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\practice java\\jdbc\\out.png"));

           byte[] bytes = new byte[1024]; // 1024 = 1KB

           int s;
           while((s = input.read(bytes)) != -1)
           {
               System.out.println(Arrays.toString(bytes));
               fileOutputStream.write(bytes, 0, s);
           }

       }
    }
}
