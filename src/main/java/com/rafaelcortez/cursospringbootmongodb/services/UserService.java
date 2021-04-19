package com.rafaelcortez.cursospringbootmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelcortez.cursospringbootmongodb.domain.User;
import com.rafaelcortez.cursospringbootmongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
}
