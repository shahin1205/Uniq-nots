package Controler;

import model.Prodect;

import java.util.ArrayList;

public class ControlClass {

   public static ArrayList<Prodect> list=new ArrayList<>();

   static int next=1;
    public static void addProduct( String name, int price, int quantity){

        list.add(new Prodect( next++ , name,price, quantity));
        System.out.println("id - "+next + " name - "+ name+" price - "+ price +" quantity -" +quantity);
    }

    public  static ArrayList<Prodect> getProduct(){
        return list;
    }
    public static void updateProduct(int id,String name, int price, int quantity){
//                list.set(0,new Prodect( id, name,price, quantity));

        for (Prodect p : list) {

            if (p.getId() == id) {

                p.setName(name);
                p.setPrice(price);
                p.setQuantity(quantity);

                System.out.println("Product Updated");
                return;
            }
        }
        System.out.println("Product Not Found");
    }

    public static void deleteProduct(int id){

        for (int i=0; i<list.size();i++){
        if (list.get(i).getId() == id) {

            list.remove(i);

            System.out.println("Product Delete");
             return;
        }
    }
        System.out.println("Product Not Found");
    }

}