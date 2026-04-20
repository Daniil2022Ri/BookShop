package com.example.BookShop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;


@Table(name = "Clients_Book_Shop")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientAccountData {
    @Id
    private Long ID;

    @Column(name = "User_name" , nullable = false)
    private String personName;


    @Column(name = "User_Email" , nullable = false)
    private String userName;


    @Column(name = "User_Email" ,nullable = false)
    private String personEmail;


    @Column(name = "User_Password", nullable = false)
    private String userPassword;

    @Column(name = "First_Name_Client" , nullable = false)
    private String clientFirstName;

    @Column(name = "Last_Name_Client")
    private String clientLastName;

    @Column(name = "Middle_Name_Client")
    private String clientMiddleName;

    @Column(name = "Pay_Details_Client" , nullable = false)
    private String payNumberDetails;


    private LocalDateTime timeCreateAccount;

    private LocalDateTime timeLastOnlinePerson;


}
