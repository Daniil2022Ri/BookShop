package com.example.BookShop.Security;

import com.example.BookShop.model.ClientAccountData;
import com.example.BookShop.service.AccoutServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class CrypPassword {

    ClientAccountData clientAccountPassword;
    AccoutServiceImpl accountImpl;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public void saveUserEncoderPassword(String password){
        String encodePassword = passwordEncoder().encode(password);
        clientAccountPassword.setUserPassword(encodePassword);
        accountImpl.saveClient();
    }
}
