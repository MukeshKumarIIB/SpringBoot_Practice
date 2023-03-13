package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface IStudentService {
	
	List<Student> findpaginated(int pageNo,int pageSize);

	
	List<Student> findStudent(Student student);


	
}
