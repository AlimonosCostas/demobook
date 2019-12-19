package com.bookself.demo.book;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookControler {

    private BookService bookService;

    public BookControler(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping (path = "create-book")
    public ResponseEntity<BookResponce> createBook(@RequestBody Book book){

        return new ResponseEntity<BookResponce>(bookService.createBook(book) , HttpStatus.CREATED);
    }

    @GetMapping (path = "get-all-books")
    public ResponseEntity<List<BookResponce>> getAllBooks(){

        return new ResponseEntity<List<BookResponce>>(bookService.getAllBooks() , HttpStatus.OK);
    }

    @GetMapping (path = "get-books-by-genter/{genter}")
    public ResponseEntity<List<BookResponce>> getBooksByGenter(@PathVariable  Genter genter){

        return new ResponseEntity<List<BookResponce>>(bookService.findBookByGenter(genter) , HttpStatus.OK);
    }
}




