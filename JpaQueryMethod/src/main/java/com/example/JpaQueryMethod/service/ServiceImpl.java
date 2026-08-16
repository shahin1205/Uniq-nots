package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.Repository.ProductRepository;
import com.example.JpaQueryMethod.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ServiceInterface {
    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> saveProducts(List<Product> product) {
        return repository.saveAllAndFlush(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product getByIdProduct(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product products=repository.getReferenceById(id);
        products.setPrice(product.getPrice());
        return repository.saveAndFlush(products);
    }

    @Override
    public String deleteProduct(int id) {
        Product product=null;
        try {
            product=repository.getReferenceById(id);
            repository.delete(product);
            return "successfully Deleted";
        }catch (RuntimeException e){
            e.getMessage();
        }
        return "id not found ";
    }
}
