package com.example.BookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BookShop.model.Book;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book , Long> {
    Optional<Book> findByBook(String bookName);
}
