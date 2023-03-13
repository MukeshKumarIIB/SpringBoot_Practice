package com.eidiko.controller.entity;

public class Eidiko {

	private int empId;
	private String name;
	private String possition;
	private double salary;

	public Eidiko(int empId, String name, String possition, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.possition = possition;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPossition() {
		return possition;
	}

	public void setPossition(String possition) {
		this.possition = possition;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Eidiko() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Eidiko [empId=" + empId + ", name=" + name + ", possition=" + possition + ", salary=" + salary + "]";
	}

}
