/*
 Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
display students
1. sorted on their city (asc)
2. sorted on their on marks (desc)
3. sorted on their on name (asc)
class Student {
private int roll;
private String name;
private String city;
private double marks;
}
 */


package com.sunbeam.s1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
		
	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public int compareTo(Student o)
	{
		return this.roll-o.roll;
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	
}



