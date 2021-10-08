package com.sonata.day3.Q1;

public class EmployeeT {
	public static void main(String[] args) {
		Manager m=new Manager(1,"sravani",50000d);
		Developer d=new Developer(2,"yanamala",75000d);
		Tester t=new Tester(3,"siva",30000d);
		m.display();
		m.salCal();
		d.display();
		d.salCal();
		t.display();
		t.salCal();
	}


}
