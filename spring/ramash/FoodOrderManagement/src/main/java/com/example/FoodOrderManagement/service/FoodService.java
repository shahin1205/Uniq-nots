package com.example.FoodOrderManagement.service;


import com.example.FoodOrderManagement.modul.MenuItem;
import com.example.FoodOrderManagement.modul.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {

    List<MenuItem> menuItems=new ArrayList<>();
    List<Customer> customers=new ArrayList<>();

    public List<MenuItem> addMenu(List<MenuItem> menuItem){
        menuItems.addAll(menuItem);
        return  menuItem;
    }

    public List<MenuItem> getAllMenuItems(){
        return menuItems;
    }

    public List<Customer> addCustomer(List<Customer> customer){

        customers.addAll(customer);

        return customer;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

//    public String placeOrder(int orderId,int itemId){
//        for (Customer customer : customers) {
//
//            if (customer.getOrderID() == orderId) {
//
//                for (MenuItem menuItem : menuItems) {
//
//                    if (menuItem.getItemId() == itemId) {
//
//                        customer.getMenuItem().add(menuItem);
//
//                        double total =
//                                customer.getTotalAmount() + menuItem.getPrice();
//                        customer.setStatus("Order");
//                        customer.setTotalAmount(total);
//
//                        return "order successfully";
//                    }
//                }
//                return "menu id not found";
//            }
//        }
//        return "customer id not found";
//        }
public String placeOrder(int orderId,int itemId){

        Customer customer= customers.stream()
                .filter(c->c.getOrderID()==orderId)
                .findFirst()
                .orElse(null);
        if (customer==null){
            return "User not found";
        }

        MenuItem menuItem = menuItems.stream()
                .filter(m->m.getItemId()==itemId)
                .findFirst()
                .orElse(null);
        if (menuItem==null){
            return "Menu Id not foud ";
        }
        customer.getMenuItem().add(menuItem);
    double total = customer.getTotalAmount() + menuItem.getPrice();
    customer.setStatus("Order");
    customer.setTotalAmount(total);

    return "order successfully";

}
        public String cancelOrder(int orderId,int itemId){
            for (Customer customer : customers) {
                if (customer.getOrderID() == orderId) {
                    for (MenuItem menuItem : menuItems) {
                        if (menuItem.getItemId() == itemId) {
                            customer.getMenuItem().remove(menuItem);
                            double total = customer.getTotalAmount() - menuItem.getPrice();
                            String cancelItem=menuItem.getItemName();
                            customer.setTotalAmount(total);
                            return cancelItem+" - canceled ";
                        }
                    }
                    return "Menu Id is not match ";
                }
            }
            return "customer id not found";
        }
    }


