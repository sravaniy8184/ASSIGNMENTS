package com.sonata.one;

public class duplicateValue {

	public static void main(String[] args) {
		int [] array=new int[] {1,2,3,3,5};
		System.out.println("Duplicate values");
		for(int i=0;i<array.length;i++)
		{
		for(int j=i+1;j<array.length;j++)
		{
		if(array[i]==array[j])
		{
		System.out.println(array[j]);
		}
		}
		}
		
	}
}

		



