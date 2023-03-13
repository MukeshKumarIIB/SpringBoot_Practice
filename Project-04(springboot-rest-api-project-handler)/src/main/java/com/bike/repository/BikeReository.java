package com.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bike.entity.Bike;

public interface BikeReository extends JpaRepository<Bike,Integer>{

	public void saveBike(Bike bike);

}
