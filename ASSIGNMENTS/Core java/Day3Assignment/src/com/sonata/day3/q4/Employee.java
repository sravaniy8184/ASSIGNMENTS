package com.sonata.day3.q4;

public abstract class Employee {
	protected int EmployeeID;
	protected String EmployeeName;
	protected Address address;
	protected double basicPay;
	protected int leaves;
	public abstract void calculateSalary();

}
