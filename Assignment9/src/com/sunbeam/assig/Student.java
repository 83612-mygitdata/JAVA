package com.sunbeam.assig;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	private double marks;
	private String city;
	
	
	public Student() {
		
	}

	public Student(int rollno, String name, double marks, String city) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public boolean equals(Object obj)
	{
		if(obj==null)
		{
			return false;
		}
		else if(this==obj)
		{
			return true;
		}
		else if(obj instanceof Student)
		{
			Student s = (Student)obj;
			return s.rollno==this.rollno;
		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.rollno - o.rollno;
	}
	
}
