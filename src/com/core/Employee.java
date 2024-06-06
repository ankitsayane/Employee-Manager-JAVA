package com.core;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private LocalDate joinDate;
	private long empPhone;
	private String empAadhar;
	
	public static int count=0;
	
	public Employee(String empName, LocalDate joinDate, long empPhone, String empAadhar) {
		super();
		this.empId = ++count;
		this.empName = empName;
		this.joinDate = joinDate;
		this.empPhone = empPhone;
		this.empAadhar = empAadhar;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpAadhar() {
		return empAadhar;
	}
	public void setEmpAadhar(String empAadhar) {
		this.empAadhar = empAadhar;
	}
	@Override
	public String toString() {
		return "Employee {Id: " + empId + ", Name: " + empName + ", JoiningDate: " + joinDate + ", Phone: " + empPhone
				+ ", Aadhar: " + empAadhar ;
	}
	
	
}
