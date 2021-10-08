package com.sonata.day3.Q2;

public class RectangleShape extends shape {
	private int l,b;
	RectangleShape(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	public void area() {
		double area=l*b;
		System.out.printf("Rectangle Area:%.2f\n",area);
	}

}
