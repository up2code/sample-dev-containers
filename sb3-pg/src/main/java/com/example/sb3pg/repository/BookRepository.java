package com.example.sb3pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sb3pg.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    
}
