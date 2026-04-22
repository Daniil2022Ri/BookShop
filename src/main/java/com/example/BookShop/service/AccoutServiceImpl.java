package com.example.BookShop.service;

import com.example.BookShop.model.ClientAccountData;
import com.example.BookShop.repository.AccountRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AccoutServiceImpl implements accountService{

    private final AccountRepository accountRepository;


    @Override
    public List<ClientAccountData> findAllClient() {
        return List.of();
    }

    @Override
    public void deleteClient(Long id) {
        accountRepository.delete();
    }

    @Override
    public ClientAccountData addNewClient(String UserName, String Email, String UserPassword) {
        return null;
    }

    @Override
    public ClientAccountData createNewAccount(ClientAccountData clientAccountData) {
        return null;
    }

    @Override
    public ClientAccountData updateAccountClient(ClientAccountData clientAccountData) {
        return null;
    }

    @Override
    public ClientAccountData saveClient() {
        return null;
    }
}
