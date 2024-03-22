package com.example.mongodb.infra.repo;


import com.example.mongodb.infra.entities.Wallet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<Wallet,Long> {


}
