package com.bike.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bike.entity.Bike;
import com.bike.repository.BikeReository;


@Service
public class BikeDao {
	
	
	@Autowired
	BikeReository bikerepo;
	
	
	public Bike addBike(Bike bike) {
		
		this.bikerepo.saveBike(bike);
		
		System.out.println("Bike Added...");
		return bike;
	}
	
	public List<Bike> getAllBikes() {

		List<Bike> allBikes = new ArrayList<>();
		allBikes = bikerepo.findAll();
		return allBikes;
	}
	
	
	
	
	public void updateStudents(Bike bike, int bikeId)
	{
		bikerepo.save(bike);
	}
	
	
	
	
}
