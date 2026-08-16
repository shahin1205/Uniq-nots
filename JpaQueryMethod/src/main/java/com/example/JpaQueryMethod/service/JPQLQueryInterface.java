package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.model.Product;

import java.util.List;

public interface JPQLQueryInterface {
    List<Product> getAllProduct();
    List<Product> getProductNameAndCategory(String productName,String category);
}
