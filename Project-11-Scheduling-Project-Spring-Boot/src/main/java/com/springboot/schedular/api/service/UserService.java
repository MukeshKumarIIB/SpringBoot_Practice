package com.springboot.schedular.api.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.springboot.schedular.api.dao.UserDao;
import com.springboot.schedular.api.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	Logger log=(Logger) LoggerFactory.logger(UserService.class);
	
	//schedule a job to add object in DB EVERY 5 SEC
	@Scheduled(fixedRate = 5000)
	public void addJob() {
		
		User user=new User();
		
		user.setName("user"+new Random().nextInt(34345) );
		dao.save(user);
		System.out.println("add sevice call in "+new Date().toString());
	}
	
	
	@Scheduled(cron="0/15 * * * * *")
	public void fetchJob() {
		List<User> user=dao.findAll();
		System.out.println("fetch service call in"+new Date().toString());
		System.out.println("no of record fetched"+user.size());
		
		log.info("user",user);
	}
	
	
}
