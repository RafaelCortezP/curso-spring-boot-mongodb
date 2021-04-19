package com.rafaelcortez.cursospringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rafaelcortez.cursospringbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
