package com.example.JpaQueryMethod.Repository;

import com.example.JpaQueryMethod.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Integer> {
    //Frond KeyWord
    Optional<Product> findByProductName(String productName);
    List<Product> readByPrice(double price);
    List<Product> getByCategory(String category);
    Long countByCategory(String category);
    Boolean existsByproductName(String productName);
    @Transactional
    void deleteByProductName(String productName);
    List<Product> findByCategoryOrderByPriceDesc(String category);
    List<Product> findByCategoryOrderByPriceAsc(String category);

    //// middle KeyWord



}
