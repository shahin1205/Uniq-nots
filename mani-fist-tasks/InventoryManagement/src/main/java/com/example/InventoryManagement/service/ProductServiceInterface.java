package com.example.InventoryManagement.service;

import com.example.InventoryManagement.model.Product;

import java.util.List;

public interface ProductServiceInterface {

    Product saveProduct(Product product);
    Product getProductById(int id);
    List<Product> getAllProduct();
    Product updateProduct(int id, Product product);
    String deleteProduct(int id);

}
