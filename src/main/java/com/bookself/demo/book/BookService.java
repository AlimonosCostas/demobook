package com.bookself.demo.book;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookResponce createBook(Book book){
        Book returnedBook;
        MapBookToBookResponce mapBookToBookResponce = new MapBookToBookResponce();
        returnedBook = bookRepository.save(book);
        return mapBookToBookResponce.apply(returnedBook);
    }

    public List<BookResponce> getAllBooks() {
        List<BookResponce> bookListToReturn = new ArrayList<BookResponce>();
        MapBookToBookResponce mapBookToBookResponce = new MapBookToBookResponce();
        Iterable<Book> iterable = bookRepository.findAll();

        for (Book book : iterable) {
            bookListToReturn.add(mapBookToBookResponce.apply(book));
        }
        return bookListToReturn;
    }

    public List<BookResponce> findBookByGenter(Genter genter){

        List<BookResponce> bookListToReturn = new ArrayList<BookResponce>();
        MapBookToBookResponce mapBookToBookResponce = new MapBookToBookResponce();
        Iterable<Book> iterable = bookRepository.findByGenter(genter);

        for (Book book : iterable) {
            bookListToReturn.add(mapBookToBookResponce.apply(book));
        }

        System.out.println(bookListToReturn);
        return bookListToReturn;

    }
}
