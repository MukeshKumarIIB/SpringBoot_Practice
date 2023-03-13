package com.eidiko.services;

import java.util.List;

import com.eidiko.controller.entity.Eidiko;

public interface EmpService {

	public List<Eidiko> getEmp();

	public Eidiko getEmpId(int empId);

	public Eidiko addEmp(Eidiko emp);

	public Eidiko update(Eidiko emp);

}
