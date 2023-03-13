package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.model.Employee;

public interface EmployeeRepositoryImplemented{

	
	public Employee findById(int id);
	public List<Employee> findAll();
	public int updateEmployee(String name,int age);
	public int deleteEmp(String name,int age);
	public List<Employee> getEmployeeByPage(int pageId, int pageSize);
	 
}
