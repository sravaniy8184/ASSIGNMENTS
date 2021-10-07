package com.sonata.one;
import java.util.Scanner;

public class sumArray {
	public static void main(String args[]){
	      int[] array = {100, 200, 300, 400, 500};
	      int sum = 0;
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }

}
