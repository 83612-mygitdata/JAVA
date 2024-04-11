package com.app.entity;

import java.util.Scanner;

public class StringsRev 
{
	  private String rev="";
	
	public StringsRev() {
		
	}

	public void accept(Scanner sc)
	{
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String rev =" ";
		int length = str.length();
		for(int i = length-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		//String str[] = new String[10];
	}
	


}
