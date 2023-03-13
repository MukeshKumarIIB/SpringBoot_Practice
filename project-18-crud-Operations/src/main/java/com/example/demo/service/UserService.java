package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepo;

public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	public Iterable<UserEntity> getUser(){
		
		return repo.findAll();
	}
	
	public Optional<UserEntity> getByUserId(int id) {
		return repo.findById(id);
	}
}
