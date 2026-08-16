package com.example.LibraryManagement.service;

import com.example.LibraryManagement.model.Books;
import com.example.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookInterface {
    @Autowired
    BookRepository repository;
    @Override
    public Books addBook(Books books) {
        return repository.save(books);
    }

    @Override
    public Books getBookById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Books> getAllBook() {
        return repository.findAll();
    }

    @Override
    public Books updateBooks(int id, Books books) {
        Books book=repository.findById(id).get();
        book.setAvailablity(book.isAvailablity());
        return repository.save(book);
    }

    @Override
    public String deleteBook(int id) {
        Books books=null;
        try{
            books= repository.findById(id).orElseThrow(
                    ()->{throw new RuntimeException("id not found");}
            );
            repository.delete(books);
            return "Success fully deleted";
        }catch (RuntimeException e){
            e.getMessage();
        }
        return "id not found";
    }
}
