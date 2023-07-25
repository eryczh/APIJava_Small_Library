package com.lec.demo.entities;

public class Book {

    private Long id;
    private String author;
    private String title;

    private Gender gender;

    public Book () {}
    
    public Book (Long id, String author, String title, Gender gender) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.gender = gender;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public Gender getGender () {
        return gender;
    }

    public void setGender (Gender gender) {
        this.gender = gender;
    }
}
