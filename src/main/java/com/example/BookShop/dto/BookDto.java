package com.example.BookShop.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookDto {

    private Long idBook;

    private String bookName;

    private String bookDescription;

    private String nameAuthorBook;

    private int bookNumberAllPage;

    private double sellBookDollars;

    private LocalDateTime dateAndTimeBookAddStore;


}
