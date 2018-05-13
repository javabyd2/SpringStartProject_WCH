package com.sda.spring.demo.repository;

import com.sda.spring.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long>{

    public Book findByTitle(String title);

    Optional<Book> findAllById(Long id);
}
