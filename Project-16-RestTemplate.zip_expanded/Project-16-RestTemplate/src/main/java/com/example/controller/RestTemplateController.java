package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.BankEmployee;
import com.example.service.RestTemplateService;

@RestController
//@RequestMapping("/template")
public class RestTemplateController {
	
	@Autowired
	private RestTemplateService restTempService;
	
	
	@GetMapping("/run")
	public String runApp() {
		return "Application is running";
	}
	
	@GetMapping("/getAllEmployee")
	public ResponseEntity<String> getAllEmployee(){
		return (ResponseEntity<String>) restTempService.allEmployee(); 
	}
	
	
	
	@PostMapping("/createEmployee")
	public ResponseEntity<String> createEmployee(@RequestBody BankEmployee employee){
		
		return restTempService.createEmployee(employee);
	}
	
	
	@GetMapping("/getEmployee/{id}")
	public String getEmployeeById(@PathVariable Integer id) {
		System.out.println("controller");
		return restTempService.getEmployeeById(id);
	}
	
	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody BankEmployee employee){
		
		 restTempService.updateEmployee(employee);
	}
    
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public void deleteById(@PathVariable String employeeId) {
		
		 restTempService.deleteEmployeeById(employeeId);
	}
}
