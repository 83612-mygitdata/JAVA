package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.excep.ExceptionLineTooLong;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		Long_str l = new Long_str(); 
		try 
		{
			l.accept(sc);
			
	    }
		catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println("Program executed successfully!");

}
}
