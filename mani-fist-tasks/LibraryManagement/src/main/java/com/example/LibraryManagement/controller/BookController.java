package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.model.Books;
import com.example.LibraryManagement.service.BookInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class BookController {
    @Autowired
    BookInterface bookInterface;

    @PostMapping("/save")
    public Books addBooks(@RequestBody Books books){
        return bookInterface.addBook(books);
    }
    @GetMapping("/getById")
    public Books getById(@RequestParam ("id") int id){
        return bookInterface.getBookById(id);
    }

    @GetMapping("/getAll")
    public List<Books> getAllBook(){
        return bookInterface.getAllBook();
    }
    @PutMapping("/update")
    public Books update(@RequestParam ("id") int id,@RequestBody Books books){
        return bookInterface.updateBooks(id,books);
    }
    @DeleteMapping("delete")
    public String delete(@RequestParam ("id") int id){
        return  bookInterface.deleteBook(id);
    }

}
