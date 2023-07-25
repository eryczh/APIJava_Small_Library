package com.lec.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lec.demo.entities.Book;
import com.lec.demo.entities.Gender;

@RestController
@RequestMapping(value = "/books")
public class Controller {

    @GetMapping
    public List<Book> getObjects() {
        Gender d1 = new Gender(1L, "Philosophy");
        Gender d2 = new Gender(2L, "Classics");

        Book b1 = new Book(1L, "Virgil", "aineid", d2);
        Book b2 = new Book(2L, "Dante", "Divine Comede", d2);
        Book b3 = new Book(3L, "Nietzche", "ecce homo", d1);

        List<Book> list = Arrays.asList(b1, b2, b3);

        return list;
    }

    
}
