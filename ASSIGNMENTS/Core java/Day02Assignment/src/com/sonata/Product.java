package com.sonata;

public class Product {

	int proId;
	String proName;
	static float proPrice;
	int gst = 15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product p = new Product();
p.proId = 50;
p.proName = "Mobile";
Product.proPrice = 100;

double finalPrice = ((Product.proPrice*0.15)+Product.proPrice);
System.out.println("Product ID : "+ p.proId);
System.out.println("Name of the Product is :" + p.proName);
System.out.println("Price :" + Product.proPrice );
System.out.println("GST@19% :" + finalPrice);

	}

}