package com.demo.bo;

public class Employee {

	private long id;
	private String name;
	private String department;
	private String designation;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(long id, String name, String department, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
}
