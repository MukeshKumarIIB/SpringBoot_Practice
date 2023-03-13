package com.eidiko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.controller.entity.Eidiko;
import com.eidiko.services.EmpService;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String getData() {
		
		return "Data retrieving successfully";
	}
	
	//creating object for EmpService through @Autowired
	@Autowired
	EmpService empservice;
	
	//retrieving the employees
	
	@GetMapping("/employee")
	public List<Eidiko> getEmp(){
		
		return this.empservice.getEmp();
		
	}
	
	//retrieving the employees by id
	@GetMapping("/employee/{empId}")
	public Eidiko getEmpId(@PathVariable String empId) {
		
		return this.empservice.getEmpId(Integer.parseInt(empId));
	}
	
	//add employee to Eidiko
	@PostMapping("/addEmp")
	public Eidiko addEmp(@RequestBody Eidiko emp){
	
		return this.empservice.addEmp(emp);
	}
	
	//update employees at Eidiko
	
	public Eidiko update(@RequestBody Eidiko emp) {
		
		this.empservice.update(emp);
		
		return null;
	}
	
	

}




