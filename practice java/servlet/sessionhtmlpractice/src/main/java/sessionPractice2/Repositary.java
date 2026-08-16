package sessionPractice2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repositary {
//    static ArrayList<User> list=new ArrayList<>();

    public static void saveUser(String name ,String password){
//        list.add(new User(name,pass));

        Connection connection = null;

        try {
            connection = Db_Connection.db_connection();
            String adddata="insert into users(name,password) value(?,?) ";
            PreparedStatement ps=connection.prepareStatement(adddata);

            ps.setString(1,name);
            ps.setString(2,password);


            int addproduct=ps.executeUpdate();
            System.out.println("successfully add the User" + addproduct);
            connection.close();
            ps.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println(  " name - "+ name+" password - "+ password);

    }


    public  static List<User> findByUser(){
        List<User> users = new ArrayList<>();
        Connection connection = null;

        try {
            connection = Db_Connection.db_connection();
            String findUser = "select *from users";
            PreparedStatement ps = connection.prepareStatement(findUser);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                users.add(
                        new User(
                                rs.getString("name"),
                                rs.getString("password")
                        )
                );
            }
            connection.close();
            ps.close();
            rs.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
