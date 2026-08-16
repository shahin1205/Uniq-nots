package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.Books;

import java.util.List;

public interface BookInterface {
    Books addBook(Books books);
    Books getBookById(int id);
    List<Books> getAllBook();
    Books updateBooks(int id , Books books);
    String deleteBook(int id);
}
