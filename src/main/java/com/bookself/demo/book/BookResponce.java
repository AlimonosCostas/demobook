package com.bookself.demo.book;

public class BookResponce {

    private Integer id;
    private String title;
    private String desc;
    private String authorFullName;
    private Genter genter;
    private Integer numberOfPages;
    private Size size;

    public BookResponce() {
    }

    public BookResponce(Integer id, String title, String desc, String authorFullName, Genter genter, Integer numberOfPages, Size size) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.authorFullName = authorFullName;
        this.genter = genter;
        this.numberOfPages = numberOfPages;
        this.size = size;
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

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}



