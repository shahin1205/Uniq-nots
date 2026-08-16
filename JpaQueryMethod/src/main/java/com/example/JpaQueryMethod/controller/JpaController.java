package com.example.JpaQueryMethod.controller;

import com.example.JpaQueryMethod.model.Product;
import com.example.JpaQueryMethod.service.JpaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Jpa")
public class JpaController {
    @Autowired
    JpaInterface jpaInterface;

    public JpaController(JpaInterface jpaInterface) {
        this.jpaInterface = jpaInterface;
    }

    @GetMapping("/getProductByName")
    public Product getProductByName(@RequestParam("name") String name){
        return jpaInterface.findProductByName(name);
    }

    @GetMapping("/getProductByPrice/{price}")
    public List<Product> getProductByPrice(@PathVariable("price") double price){
        return jpaInterface.getProductByPrice(price);
    }

    @GetMapping("/category")
    public List<Product> getProductByCategory(@RequestParam ("category") String category){
        return jpaInterface.getProductCategory(category);
    }
    @GetMapping("/countCategory")
    public Long countCategory(@RequestParam ("category") String category){
        return jpaInterface.countCategory(category);
    }

    @GetMapping("/existsproduct")
    public Boolean existsProduct(@RequestParam ("productName") String productName){
        return jpaInterface.existProductName(productName);
    }

    @GetMapping("/desOrderCategory")
    public List<Product> desOrderCategory(@RequestParam("category") String category){
        return jpaInterface.categoryDisOrder(category);
    }

    @DeleteMapping("/delete")
    public String deleteByproductName(@RequestParam("productName") String productName){
        jpaInterface.deleteByName(productName);
        return  productName+" deleted Successfully";
    }

}
