package com.example.FoodOrderManagement.controller;


import com.example.FoodOrderManagement.modul.Customer;
import com.example.FoodOrderManagement.modul.MenuItem;
import com.example.FoodOrderManagement.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class FoodController {
    @Autowired
    FoodService foodService;

    @PostMapping("/addMenu")
    public List<MenuItem> addMenus(@RequestBody List<MenuItem> menuItem){
        return foodService.addMenu(menuItem);
    }

    @PostMapping("/addCustomer")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return foodService.addCustomer(customers);
    }

    @GetMapping("/getMenue")
    public List<MenuItem> getMenus(){
        return foodService.getAllMenuItems();
    }

    @GetMapping("/getCustomer")
    public List<Customer> getCustomer(){
        return foodService.getCustomers();
    }

    @PatchMapping("/order/{customerId}/{menueID}")
    public String order(@PathVariable("customerId") int orderId, @PathVariable("menueID") int menuId){
        return foodService.placeOrder(orderId,menuId);
    }

    @DeleteMapping("cancel/{orderId}/{menueID}")
    public String cancel(@PathVariable("orderId") int orderId, @PathVariable("menueID") int menuId){
        return foodService.cancelOrder(orderId,menuId);
    }

}
