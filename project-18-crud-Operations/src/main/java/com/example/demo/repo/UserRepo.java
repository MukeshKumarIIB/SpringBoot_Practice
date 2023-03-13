package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity,Integer> {

}
