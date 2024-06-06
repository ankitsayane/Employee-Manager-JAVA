package com.core;

import java.time.LocalDate;

public class FTEmployee extends Employee {
	private double ftSalary;
	
	public FTEmployee(String empName, LocalDate joinDate, long empPhone, String empAadhar, double ftSalary) {
		super(empName, joinDate, empPhone, empAadhar);
		this.ftSalary = ftSalary;
	}
	
	public double getFtSalary() {
		return ftSalary;
	}
	public void setFtSalary(double ftSalary) {
		this.ftSalary = ftSalary;
	}

	@Override
	public String toString() {
		return super.toString()+", Salary=" + ftSalary + "}";
	}

}
