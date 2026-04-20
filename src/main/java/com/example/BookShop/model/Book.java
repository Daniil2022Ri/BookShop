package com.example.BookShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long idBook;

    @Column(name = "Name_Book")
    private String bookName;

    @Column(name = "Description_Book")
    private String bookDescription;

    @Column(name = "Name_Author_Book")
    private String nameAuthorBook;

    @Column(name = "All_Page_Book")
    private int bookNumberAllPage;

    @Column(name = "Price_Book")
    private double sellBookDollars;

    @Column(name = "Date_and_Time_Create_Author_Book")
    private LocalDateTime dateAndTimeBookAddStore;


}
