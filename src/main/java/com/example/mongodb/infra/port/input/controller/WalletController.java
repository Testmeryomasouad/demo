package com.example.mongodb.infra.port.input.controller;



import com.example.mongodb.infra.entities.Wallet;
import com.example.mongodb.infra.service.IWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class WalletController {


   // IWalletService walletService= AppDependencies.dependenciInjenctionService();

    @Autowired
    IWalletService walletService;


    @PostMapping(path = "/create")
    void createWallet(Wallet wallet){
        walletService.createWallet(wallet);
    }
    @GetMapping("/allWallets")

    public List<Wallet> getAllWallets()
    {
        return walletService.getWallets();

    }
    @DeleteMapping(path = "/delete")
    public void deleteWallet(@RequestBody Wallet wallet){

        walletService.deleteWallet(wallet);


    }

}
