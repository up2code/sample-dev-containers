package com.example.sb3pg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.sb3pg.entity.Book;
import com.example.sb3pg.repository.BookRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
}
