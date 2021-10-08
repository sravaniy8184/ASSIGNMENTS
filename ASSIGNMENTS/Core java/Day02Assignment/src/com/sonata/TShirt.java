package com.sonata;

public class TShirt{
	
String color;
String material;
String design;
 String size;

 TShirt(){}
 TShirt(String color, String material, String design){
	this.color = color;
	this.material = material;
	this.design = design;
	}
 
	public void display() {
	System.out.println("color:" + color);
	System.out.println("material:" + material);
	System.out.println("design:" + design);
	}
	 

public static void main(String[] args) {
	
	TShirt tee  = new TShirt();  
	tee.size = "small";
	
	 
	TShirt teel  = new TShirt();  
	teel.size = "large";
	
	TShirt teex  = new TShirt();  
	teex.size = "xtralarge";
	
	TShirt t = new TShirt("red", "cotton", "solid");
	
	 t.display();
	System.out.println(tee.size);
	System.out.println(teel.size);
	System.out.println(teex.size);
	//System.out.println(tshirt.color);
	
	

}
}
