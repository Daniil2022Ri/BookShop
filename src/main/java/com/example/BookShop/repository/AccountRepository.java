package com.example.BookShop.repository;

import com.example.BookShop.model.ClientAccountData;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface AccountRepository extends JpaRepository<ClientAccountData , Long> {
    Optional<ClientAccountData> findByClient(String accountName);

}
