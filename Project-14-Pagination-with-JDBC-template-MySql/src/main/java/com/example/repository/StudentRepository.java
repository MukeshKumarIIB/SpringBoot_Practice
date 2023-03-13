package com.example.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student,Integer>{
	
	

}
