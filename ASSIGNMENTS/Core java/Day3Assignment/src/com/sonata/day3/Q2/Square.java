package com.sonata.day3.Q2;

public class Square extends shape {
		private int l;
		Square(int l){
			this.l=l;
		}
		public void area() {
			double area=l*l;
			System.out.printf("Square area:%.2f\n",area);
		}

}
