package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StuentService implements IStudentService{
	
	
	@Autowired
	private StudentRepository stdRepo;
	
	
    @Override
	public List<Student> findpaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		
		Pageable paging=PageRequest.of(pageNo,pageSize);
		
		Page<Student> pageRequest=stdRepo.findAll(paging);
		return pageRequest.toList();
	}
	@Override
    public List<Student> findStudent(Student student){
    	return (List<Student>) stdRepo.findAll();
    }

	

	

}
