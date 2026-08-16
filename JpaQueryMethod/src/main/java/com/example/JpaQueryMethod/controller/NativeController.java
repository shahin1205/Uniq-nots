package com.example.JpaQueryMethod.controller;


import com.example.JpaQueryMethod.model.Product;
import com.example.JpaQueryMethod.service.NativeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/native")
public class NativeController {
    @Autowired
    NativeInterface nativeInterface;

    @GetMapping("/get")
    public List<Product> getAllProduct(){
        return nativeInterface.getAllProduct();
    }
}
