package com.example.BookShop.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ClientAccountDto {

    private Long idClientAccount;

    private String personName;

    private String userName;

    private String personEmail;

    private String userPassword;

    private String clientFirstName;

    private String clientLastName;

    private String clientMiddleName;

    private String payNumberDetails;

    private LocalDateTime timeCreateAccount;

    private LocalDateTime timeLastOnlinePerson;

}
