package com.example.LibraryManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private Double price;
    private Boolean availablity;

    public Books() {
    }

    public Books(Integer bookId, String bookName, double price, boolean availablity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.availablity = availablity;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }
}
