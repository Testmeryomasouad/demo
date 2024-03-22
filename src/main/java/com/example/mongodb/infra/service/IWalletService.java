package com.example.mongodb.infra.service;


import com.example.mongodb.infra.entities.Wallet;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IWalletService {

    List<Wallet> getWallets();

    void createWallet(Wallet w);

    void deleteWallet(Wallet wallet);
}
