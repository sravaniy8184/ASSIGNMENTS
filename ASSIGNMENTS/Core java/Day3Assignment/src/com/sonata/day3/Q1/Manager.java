package com.sonata.day3.Q1;

public class Manager extends Employee {
	private double empSal;
	public Manager(int eid, String ename, double esal) {
		super(eid,ename,esal);
		this.empSal=esal;
	}

	public void salCal() {
		empSal=empSal*12;
		System.out.println("After salary calculation:"+empSal);
	}
}