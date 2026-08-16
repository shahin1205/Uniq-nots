package com.example.JpaQueryMethod.controller;

import com.example.JpaQueryMethod.model.Product;
import com.example.JpaQueryMethod.service.JPQLQueryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jpql")
public class JPQLQueryController {
    @Autowired
    JPQLQueryInterface jpqlQueryInterface;

    @GetMapping("/get")
    public List<Product> getAllProduct(){
        return jpqlQueryInterface.getAllProduct();
    }

    @GetMapping("/getproductByName/{productName}/{category}")
    public List<Product> getproductByName(@PathVariable String productName,@PathVariable String category){
        return jpqlQueryInterface.getProductNameAndCategory(productName,category);
    }
}
