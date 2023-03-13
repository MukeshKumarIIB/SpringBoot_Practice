package com.eidiko.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.eidiko.controller.entity.Eidiko;



@Service
public class EmpService_implemented implements EmpService{
	
	public List<Eidiko> list;
	public EmpService_implemented() {
		  list=new ArrayList<>();
		list.add(new Eidiko(123,"harish","java developer",50000));
		list.add(new Eidiko(124,"mahesh","ui developer",50000));
		list.add(new Eidiko(125,"bala","python developer",50000));
	}
	
	@Override
	public List<Eidiko> getEmp(){
		
		return list;
	}
	
	@Override
	public Eidiko getEmpId(int empId) {
	
		
		Eidiko edk=null;
		for(Eidiko e:list) {
			if(e.getEmpId()==empId){
				edk=e;
			}
			
		}
			return edk;
		
		
	}
	
	@Override
	public Eidiko addEmp(Eidiko emp){
		list.add(emp);
		
		return emp;
		
	}

	
	@Override
	public Eidiko update(Eidiko emp) {
		
	
		return null;
	}
}
