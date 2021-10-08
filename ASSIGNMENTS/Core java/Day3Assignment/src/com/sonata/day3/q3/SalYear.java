package com.sonata.day3.q3;

public class SalYear {
	public void SalYear(int n) {
		try {			
			if(n<100000) {
				throw new ExceptionYear("Yearly salary cannot be less than 100000");
			}
			else {
				System.out.println("Yearly salary accepted");
			}
		}catch(ExceptionYear y) {
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		SalYear y1=new SalYear();
		y1.SalYear(10000);
	}
}
