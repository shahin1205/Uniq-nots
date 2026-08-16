package com.example.JpaQueryMethod.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private Double price;
    private String category;
    private  Boolean availabelity;

    public Product() {
    }

    public Product(Integer id, String productName, Double price, String category, Boolean availabelity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.availabelity = availabelity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAvailabelity() {
        return availabelity;
    }

    public void setAvailabelity(Boolean availabelity) {
        this.availabelity = availabelity;
    }
}
