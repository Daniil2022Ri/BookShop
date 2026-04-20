package com.example.BookShop.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name  = "All_Book_Library")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BookLibrary {

    @Id
    private Long IdBook;

    @Column(name ="Name_Book" , nullable = false)
    private String bookName;

    @Column(name ="Category_Book" , nullable = false)
    private String bookCategory;

    @Column(name = "Description_Book")
    private String descriptionBook;

    @Column(name ="Book_Page" , nullable = false)
    private int bookPage;

    @Column(name ="Date_and_Time_Book" , nullable = false)
    private LocalDateTime DateAndTimeBook;
}
