package com.springboot.schedular.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.schedular.api.model.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
