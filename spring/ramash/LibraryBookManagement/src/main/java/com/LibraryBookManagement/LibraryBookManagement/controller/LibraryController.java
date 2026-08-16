package com.LibraryBookManagement.LibraryBookManagement.controller;


import com.LibraryBookManagement.LibraryBookManagement.modul.BookDetails;
import com.LibraryBookManagement.LibraryBookManagement.modul.IssueRecord;
import com.LibraryBookManagement.LibraryBookManagement.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class LibraryController {
    @Autowired
    LibraryService libraryService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody BookDetails bookDetails){
        return  libraryService.addBook(bookDetails);
    }

    @GetMapping("/getBook")
    public List<BookDetails> getBook(){
        return libraryService.getBook();
    }

    @PostMapping("/issueBook")
    public String issueBooks(@RequestBody IssueRecord issueRecord){
        return libraryService.issueBook(issueRecord);
    }

    @PatchMapping("/return/{bookID}")
    public String returnBooks(@PathVariable ("bookID") int bookID,@RequestBody IssueRecord issueRecord){
        return libraryService.returnBook(bookID,issueRecord);
    }

    @GetMapping("/getIssueRecords")
    public List<IssueRecord> records(){
        return libraryService.recordsDetail();
    }

    @GetMapping("checkAvailability/{bookid}")
    public String checkAvailabilitys(@PathVariable ("bookid") int bookid){
        return libraryService.checkAvailability(bookid);
    }

    @GetMapping("/fineAmount/{bID}")
    public String  fineAmounts(@PathVariable ("bID" ) int bID){
        return libraryService.fineAmount(bID);
    }
}
