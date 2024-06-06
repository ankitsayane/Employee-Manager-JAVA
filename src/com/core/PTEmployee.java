package com.core;

import java.time.LocalDate;

public class PTEmployee extends Employee {
	private double hourPay;
	public PTEmployee(String empName, LocalDate joinDate, long empPhone, String empAadhar, double hourPay) {
		super(empName, joinDate, empPhone, empAadhar);
		this.hourPay = hourPay;	
	}
	public double getHourPay() {
		return hourPay;
	}
	public void setHourPay(double hourPay) {
		this.hourPay = hourPay;
	}
	@Override
	public String toString() {
		return super.toString()+", HourPay: " + hourPay + "}";
	}
	

}
