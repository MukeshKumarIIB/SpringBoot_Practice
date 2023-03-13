package com.example.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

public  class EmployeeRowMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
		Employee employee=new Employee();
		
		employee.setId(rs.getInt("id"));
		employee.setName(rs.getString("name"));
		employee.setAge(rs.getInt("age"));
		employee.setSalary(rs.getInt("salary"));
		
		return employee;
	}





	

}
