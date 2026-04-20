package com.example.BookShop.service;

import com.example.BookShop.model.ClientAccountData;

import java.util.List;

public class AccoutServiceImpl implements accountService{

    @Override
    public List<ClientAccountData> findAllClient() {
        return List.of();
    }

    @Override
    public void deleteClient(Long id) {

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
