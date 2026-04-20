package com.example.BookShop.service;

import com.example.BookShop.model.ClientAccountData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface accountService {

    List<ClientAccountData> findAllClient();


    public void deleteClient(Long id);

    ClientAccountData addNewClient(String UserName , String Email, String UserPassword);

    ClientAccountData createNewAccount(ClientAccountData clientAccountData);

    ClientAccountData updateAccountClient(ClientAccountData clientAccountData);

    ClientAccountData saveClient();

}
