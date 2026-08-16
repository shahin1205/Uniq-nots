package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.Repository.ProductRepository;
import com.example.JpaQueryMethod.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaService implements JpaInterface {
    @Autowired
    ProductRepository repository;

    @Override
    public Product findProductByName(String name) {
        return repository.findByProductName(name).get();
    }

    @Override
    public List<Product> getProductByPrice(double price) {
        return repository.readByPrice(price);
    }

    @Override
    public List<Product> getProductCategory(String category) {
        return repository.getByCategory(category);
    }

    @Override
    public Long countCategory(String category) {
        return repository.countByCategory(category);
    }

    @Override
    public Boolean existProductName(String productName) {
        return repository.existsByproductName(productName);
    }

    @Transactional
    @Override
    public void deleteByName(String productName) {
        repository.deleteByProductName(productName);
    }

    @Override
    public List<Product> categoryDisOrder(String category) {
        return repository.findByCategoryOrderByPriceDesc(category);
    }


}
