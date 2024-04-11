package com.app.entity;

import java.util.Scanner;

public class Palindrome 
{
	private String rev =" ";
	private String str;
	private int count;
	public void accept(Scanner sc)
	{
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		
		int length = str.length();
		for(int i = length-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		
		if(str.equals(rev))
		{

			System.out.println("The string is Palindrome!");
		}
		else
		{
			
			System.out.println("The string is not a Palindrome!");
		}
		
		
	}
	



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palindrome p = new Palindrome();
		p.accept(sc);
		//p.check();

	}
}

