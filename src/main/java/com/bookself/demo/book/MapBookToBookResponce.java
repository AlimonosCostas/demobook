package com.bookself.demo.book;

import java.util.function.Function;

public class MapBookToBookResponce implements Function<Book , BookResponce> {
    @Override
    public BookResponce apply(Book book) {
        BookResponce bookResponce = new BookResponce();
        bookResponce.setId(book.getId());
        bookResponce.setTitle(book.getTitle());
        bookResponce.setDesc(book.getDesc());
        bookResponce.setAuthorFullName(book.getAuthorName() + " " + book.getAuthorLastName());
        bookResponce.setGenter(book.getGenter());
        bookResponce.setNumberOfPages(book.getNumberOfPages());

        if(book.getNumberOfPages() <= 100)
          bookResponce.setSize(Size.SMALL);
        else if(book.getNumberOfPages() <= 200)
            bookResponce.setSize(Size.MEDIUM);
        else  bookResponce.setSize(Size.LARGE);
        return bookResponce;
    }
}





