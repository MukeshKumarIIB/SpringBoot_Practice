package com.bike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bike.dao.BikeDao;
import com.bike.entity.Bike;

public class Controller {
	
	
	@Autowired
	BikeDao dao;
	
	@GetMapping("/")
	public String insert() {
		
		return "you are now loginned....!";
	}
	
	
	@PostMapping("/post")
	public Bike addBike(@RequestBody Bike bike) {

		System.out.println("controller" + bike);
		return dao.addBike(bike);
	}

}
