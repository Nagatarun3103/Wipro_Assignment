package com.javadeveloperzone.controller;

import com.javadeveloperzone.model.Book;
import com.javadeveloperzone.model.BookList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class BookController {

    @GetMapping(value = "/bookXYZ", produces = "application/xml")
    public BookList getBooks() {
        return new BookList(Arrays.asList(
            new Book(101, "Java Tutorials", "Krishna"),
            new Book(102, "Spring Tutorials", "Mahesh"),
            new Book(103, "Angular Tutorials", "Shiva")
        ));
    }
}
