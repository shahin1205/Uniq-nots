package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.Repository.NativeQueryRepository;
import com.example.JpaQueryMethod.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NativeService implements NativeInterface {

    @Autowired
    NativeQueryRepository repository;
    @Override
    public List<Product> getAllProduct() {
        return repository.getAllProduct();
    }
}
