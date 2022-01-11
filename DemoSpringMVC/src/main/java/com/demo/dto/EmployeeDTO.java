package com.demo.dto;

public class EmployeeDTO {

	private long empId;
	private String empName;
	private String empDepartment;
	private String empDesignation;
	private double empSalary;
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDTO(String empName, String empDepartment, String empDesignation, double empSalary) {
		super();
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empName=" + empName + ", empDepartment=" + empDepartment + ", empDesignation="
				+ empDesignation + ", empSalary=" + empSalary + "]";
	}
}
