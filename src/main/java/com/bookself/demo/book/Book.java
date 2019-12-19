package com.bookself.demo.book;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String desc;
    private String authorName;
    private String authorLastName;
    private Genter genter;
    private Integer numberOfPages;

    public Book() {
    }

    public Book(String title, String desc, String authorName, String authorLastName, Genter genter, Integer numberOfPages) {
        this.title = title;
        this.desc = desc;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.genter = genter;
        this.numberOfPages = numberOfPages;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Genter getGenter() {
        return genter;
    }

    public void setGenter(Genter genter) {
        this.genter = genter;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}


