package repository;

import Dbconnection.DbConnection;
import model.Prodect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ControlClass {

    public static void addProduct( String name, int price, int quantity){

        Connection connection = null;

        try {
            connection = DbConnection.db_connection();
            String adddata="insert into prodect(name,price,quantity) value(?,?,?) ";
            PreparedStatement ps=connection.prepareStatement(adddata);

        ps.setString(1,name);
        ps.setInt(2,price);
        ps.setInt(3,quantity);

        int addproduct=ps.executeUpdate();
            System.out.println("successfully add the product db" + addproduct);
            connection.close();
            ps.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }


        System.out.println(  " name - "+ name+" price - "+ price +" quantity -" +quantity);

    }

    public  static List<Prodect> getProduct(){
        List<Prodect> products = new ArrayList<>();
        Connection connection = null;

        try {
            connection = DbConnection.db_connection();
            String getProduct = "select *from prodect";
            PreparedStatement ps = connection.prepareStatement(getProduct);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                products.add(
                        new Prodect(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getInt("price"),
                                rs.getInt("quantity")
                        )
                );
            }
            connection.close();
            ps.close();
            rs.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
            return products;
    }
    public static void updateProduct(int id,String name, int price, int quantity){

        Connection connection = null;
        try {
            connection = DbConnection.db_connection();

            String update = "update prodect set name=?,price=?,quantity=? where id = ?";
            PreparedStatement ps = connection.prepareStatement(update);

            ps.setString(1, name);
            ps.setInt(2, price);
            ps.setInt(3, quantity);
            ps.setInt(4, id);
            int executeUpdate = ps.executeUpdate();
            System.out.println("update "+ executeUpdate);
        }catch (Exception e){
            e.printStackTrace();
        }
        }

    public static void deleteProduct(int id) {
        Connection connection = null;
        try {
            connection = DbConnection.db_connection();

            String update = "delete from prodect  where id = ?";
            PreparedStatement ps = connection.prepareStatement(update);

            ps.setInt(1 ,id);

            int delete=ps.executeUpdate();
            System.out.println("delete "+ delete);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}