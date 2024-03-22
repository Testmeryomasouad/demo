package com.example.mongodb.infra.service;


import com.example.mongodb.infra.entities.Wallet;
import com.example.mongodb.infra.repo.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WalletService implements IWalletService{

    @Autowired
    WalletRepository walletRepository;

    @Override
    public List<Wallet> getWallets() {
        return walletRepository.findAll();
    }

    @Override
    public void createWallet(Wallet wallet) {
        walletRepository.save(wallet);

    }

    @Override
    public void deleteWallet(Wallet wallet) {

        walletRepository.delete(wallet);

    }
}
