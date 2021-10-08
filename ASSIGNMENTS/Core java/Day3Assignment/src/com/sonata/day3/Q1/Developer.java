package com.sonata.day3.Q1;

public class Developer {
	private int empId;
    private String empName;
    private double empSal;
    
    public Developer(final int eid, final String ename, final double esal) {
        super(eid, ename, esal);
        this.empId = eid;
        this.empName = ename;
        this.empSal = esal;
    }
    
    public void salCal() {
        this.empSal = this.empSal * 12;
        System.out.println("After salary calculation:" + this.empSal);
    }

}
