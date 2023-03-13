package com.example.repository;

import org.springframework.http.ResponseEntity;

import com.example.entity.BankEmployee;

public interface RestTemplateRepository  {

	
	public ResponseEntity<String> allEmployee();
	public ResponseEntity<BankEmployee> createEmployee(BankEmployee employee);
	public BankEmployee getEmployeeById(int employeeId);
	public void updateEmployee(BankEmployee employee);
	public void deleteEmployeeById(int employeeId);

}
