package com.bookself.demo.book;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book , Integer> {
    public Iterable<Book> findByGenter(Genter genter);
}
