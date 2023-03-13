package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRepositoryImplemented;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepositoryImplemented emprepoImp;

	@GetMapping("/")
	public String run() {
		return "logined successful";
	}

	@GetMapping("/findAll")
	public List<Employee> findall() {

		List<Employee> list = this.emprepoImp.findAll();

		return list;
	}

	@GetMapping("/find/{id}")
	public Employee findEmp(@PathVariable int id) {

		return this.emprepoImp.findById(id);
	}

	@PostMapping("/employee/{name}/{age}")
	public String update(@PathVariable String name, @PathVariable int age) {

		this.emprepoImp.updateEmployee(name, age);

		return "table updated sucessfully";
	}

	@DeleteMapping("/employee/{name}/{age}")
	public String delete(@PathVariable String name, @PathVariable int age) {

		this.emprepoImp.updateEmployee(name, age);

		return "data deleted sucessfully";
	}

	// showing pagination
	@GetMapping("/employee/{pageId}")
	public List<Employee> viewPage(@PathVariable int pageId, Model m) {
              int pageSize=4;
		if (pageId == 1){
			 System.out.println("entr valid page number");
		} 
		else{
			pageId = (pageId - 1) * pageSize + 1;
		}
		System.out.println(pageId);

		List<Employee> list = emprepoImp.getEmployeeByPage(pageId, pageSize);

		m.addAttribute("msg", list);
		return emprepoImp.getEmployeeByPage(pageId, pageSize);
	}

}
