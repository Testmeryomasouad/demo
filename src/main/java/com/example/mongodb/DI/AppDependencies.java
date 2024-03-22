package com.example.mongodb.DI;

import com.example.mongodb.infra.repo.WalletRepository;
import com.example.mongodb.infra.service.IWalletService;
import com.example.mongodb.infra.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppDependencies {

//test
    static  WalletRepository walletRepository;
    @Bean
    public static IWalletService dependenciInjenctionService(){

        return new WalletService();

    }
}
