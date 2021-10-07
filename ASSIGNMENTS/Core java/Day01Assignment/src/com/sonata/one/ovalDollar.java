package com.sonata.one;
import java.util.Scanner;

public class ovalDollar {

	public static void main(String[] args) {                  
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
		{
		ch[i]='$';
		}
		}
		for(int i=0;i<ch.length;i++)
		{
		System.out.println(ch[i]);
		}
		}

		}


	
