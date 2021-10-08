package com.sonata.day3.Q2;

public class ShapeTest {
	public static void main(String[] args) {
		RectangleShape r=new RectangleShape(2,3);
		Square s=new Square(2);
		Triangle t=new Triangle(4);
		r.area();
		s.area();
		t.area();
	}

}
