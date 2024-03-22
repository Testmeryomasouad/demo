package com.example.mongodb;


import com.example.mongodb.infra.entities.Wallet;
import com.example.mongodb.infra.service.IWalletService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	//IWalletService walletService= AppDependencies.dependenciInjenctionService();
	@Bean
	public CommandLineRunner start(
			IWalletService walletService) {

		return args -> {
			Wallet wallet1 = new Wallet(1L, "John Doe", 1000.00);
			Wallet wallet2 = new Wallet(2L, "Jane Smith", 500.50);
			walletService.createWallet(wallet1);
			walletService.createWallet(wallet2);

		};
	}
}
