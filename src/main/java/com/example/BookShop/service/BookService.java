package com.example.BookShop.service;

import com.example.BookShop.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> bookCategory(String bookCategory);

    List<Book> findAllBook();

    public void findBookByName(String bookName);

    public void deleteBook(Long id);

    Book addNewBook(Book book);
}
