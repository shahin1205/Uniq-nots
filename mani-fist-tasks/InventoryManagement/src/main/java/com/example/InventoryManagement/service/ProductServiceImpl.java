package com.example.InventoryManagement.service;

import com.example.InventoryManagement.model.Product;
import com.example.InventoryManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductServiceInterface{
    @Autowired
    ProductRepository repository;
    @Override
    public Product saveProduct(Product product) {
        return repository.save(product) ;
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product products=repository.findById(id).get();
        products.setStockAvailable(product.getStockAvailable());
        return repository.save(products);
    }

    @Override
    public String deleteProduct(int id) {
        Product product=null;
        try{
            product=repository.findById(id).orElseThrow(
                    ()->{throw new RuntimeException("id not found");}
            );
            repository.delete(product);
            return "successfully deleted ";
        }catch (RuntimeException e){
            e.getMessage();
        }
        return "id not found";
    }
}
