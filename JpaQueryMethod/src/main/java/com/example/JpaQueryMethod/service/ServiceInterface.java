package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.model.Product;

import java.util.List;

public interface ServiceInterface {
    List<Product> saveProducts(List<Product> product);
    List<Product> getAllProduct();
    Product getByIdProduct(int id);
    Product updateProduct(int id,Product product);
    String deleteProduct(int id);
}
