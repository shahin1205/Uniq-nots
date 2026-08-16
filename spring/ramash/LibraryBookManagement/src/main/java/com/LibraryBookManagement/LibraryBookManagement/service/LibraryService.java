package com.LibraryBookManagement.LibraryBookManagement.service;


import com.LibraryBookManagement.LibraryBookManagement.modul.BookDetails;
import com.LibraryBookManagement.LibraryBookManagement.modul.IssueRecord;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    List<BookDetails> bookDetails=new ArrayList<>();
    List<IssueRecord> issueRecords=new ArrayList<>();

    public String addBook(BookDetails bookDetail){
        bookDetails.add(bookDetail);
        return "book successfully added";
    }

    public List<BookDetails> getBook(){
        return bookDetails;
    }

    public String issueBook(IssueRecord issueRecord){
        issueRecords.add(issueRecord);
        issueRecord.setReturnDate(LocalDate.now());
        for (BookDetails bookDetails1:bookDetails){
           if( bookDetails1.getBookId()==issueRecord.getBookId()){
               bookDetails1.setAvailable(false);
           }
        }
        return  "Book Issued";

    }


    public String returnBook(int bookId,IssueRecord issueRecord){

        for (IssueRecord issueRecord2:issueRecords){
        if (issueRecord2.getBookId()==bookId){
            issueRecord2.setReturnDate(issueRecord.getReturnDate());
            for (BookDetails bookDetails1:bookDetails){
                if( bookDetails1.getBookId()==issueRecord2.getBookId()){
                    bookDetails1.setAvailable(true);
                }

            }
            return  "Book return";
        }
        return  "Book Id is not match";
    }
        return null;
    }


    public List<IssueRecord> recordsDetail(){
        return issueRecords;
    }

    public String checkAvailability(int bookID){

        for (BookDetails bookDetails1:bookDetails){
            if (bookDetails1.getBookId()==bookID){
                if(bookDetails1.isAvailable()==true){
                    return "Book is Available";
                }
                else if (bookDetails1.isAvailable()==false){
                    return "Book is not available";
                }
            }

        }
        return "id is not match";

    }

    public String fineAmount(int iID){

        for (IssueRecord issueRecord:issueRecords){
            if (issueRecord.getBookId()==iID){
                long returnDays= ChronoUnit.DAYS.between(issueRecord.getIssueDate(),issueRecord.getReturnDate());
                String sreturnDays=String.valueOf(returnDays);
                if(3<=returnDays){
                    return  "return day "+ sreturnDays+ "fine amount 200";
                }

            }
        }

        return "no fine amount";
    }

}
