package com.sonata.day3.Q1;

public class Test extends Employee {
	private int empId;
	private String empName;
	private double empSal;
	public Test(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*12;
		System.out.println("After salary calculation:"+empSal);
	}
}