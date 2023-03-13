package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.IStudentService;


@RestController
public class StudentController {

	@Autowired
	private IStudentService stdService;
	
	@GetMapping("/")
	public String init() {
		
		return "Page logined sucessfully.....!";
	}
	
	@GetMapping("/students")
	public List<Student> allStudent(Student student){
		
		return this.stdService.findStudent(student);
	}
	
	@GetMapping("student/{pageNo}/{pageSize}")
	public List<Student> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		
		
		return stdService.findpaginated(pageNo, pageSize);
	}
	
	
	
	
}
