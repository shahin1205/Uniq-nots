package com.example.JpaQueryMethod.controller;

import com.example.JpaQueryMethod.model.Product;
import com.example.JpaQueryMethod.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class ProductController {
    @Autowired
    private   ServiceInterface serviceInterface;

    public ProductController(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }

    @PostMapping("/save")
    public List<Product> saveProduct(@RequestBody List<Product> productList){
        return serviceInterface.saveProducts(productList);
    }

    @GetMapping("/getAll")
    public  List<Product> getAll(){
        return serviceInterface.getAllProduct();
    }

    @GetMapping("/getByID/{id}")
    public Product getById(@PathVariable ("id") int id){
        return  serviceInterface.getByIdProduct(id);
    }

    @PutMapping("/update/{id}")
    public  Product update(@PathVariable ("id") int id,@RequestBody Product product){
        return serviceInterface.updateProduct(id,product);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("id") int id){
        return serviceInterface.deleteProduct(id);
    }
}
