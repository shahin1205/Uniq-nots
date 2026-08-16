package com.example.JpaQueryMethod.service;

import com.example.JpaQueryMethod.Repository.JPQLQueryRepository;
import com.example.JpaQueryMethod.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JPQLQuery  implements JPQLQueryInterface{

    @Autowired
    JPQLQueryRepository jpqlQueryRepository;
    @Override
    public List<Product> getAllProduct() {
        return jpqlQueryRepository.getAllProduct();
    }

    @Override
    public List<Product> getProductNameAndCategory(String productName, String category) {
        return jpqlQueryRepository.getProductByName(productName,category);
    }
}
