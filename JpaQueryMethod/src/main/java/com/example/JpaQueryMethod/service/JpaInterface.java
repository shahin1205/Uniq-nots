package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.model.Product;

import java.util.List;

public interface JpaInterface {
    Product findProductByName(String name);
    List<Product> getProductByPrice(double price);
    List<Product> getProductCategory(String category);
    Long countCategory(String category);
    Boolean existProductName(String productName);
    void deleteByName(String productName);
    List<Product>categoryDisOrder(String category);
}
