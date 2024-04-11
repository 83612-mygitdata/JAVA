package com.app.entity;

import java.util.Scanner;

public class CharLength 
{
	public CharLength() {}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("Enter the string : ");
		str = sc.nextLine();
		String arr[] = str.split(" ");
		//for(String element:arr)
			//System.out.println(element.length());
		
		System.out.println("Number of string word is:"+str+" "+arr.length);
		
	}

}
