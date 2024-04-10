package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.excep.ExceptionLineTooLong;

public class Long_str 
{
	String word;
	
	
	
	public void accept(Scanner sc) throws ExceptionLineTooLong
	{
		System.out.println("Enter the string : ");
		word = sc.next();
		if(word.length() > 80)
		{
			throw new ExceptionLineTooLong("The string is too long!",word.length());
		}
		else
		{
			this.word=word;
		}
	}


}
