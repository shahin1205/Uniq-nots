package com.example.InventoryManagement.controller;


import com.example.InventoryManagement.model.Product;
import com.example.InventoryManagement.service.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ProductController {
    @Autowired
    ProductServiceInterface productServiceInterface;
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productServiceInterface.saveProduct(product);
    }

    @GetMapping("getById")
    public Product getById(@RequestParam ("id") int id){
        return productServiceInterface.getProductById(id);
    }
    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productServiceInterface.getAllProduct();
    }
    @PutMapping("/update")
    public Product update(@RequestParam("id") int id,@RequestBody Product product){
        return productServiceInterface.updateProduct(id,product);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") int id){
        return productServiceInterface.deleteProduct(id);
    }
}
