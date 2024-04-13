package com.sunbeam.s1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tester {
public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Student[] s1 = new Student[5];
		s1[0] = new Student(3,"Disha","Ichalkaranji",90.5);
		s1[1] = new Student(4,"Stuti","Pune",85);
		s1[2] = new Student(5,"Parth","Mumbai",80);
		s1[3] = new Student(1,"Chinu","Delhi",95);
		s1[4] = new Student(2,"Aditya","Jaipur",80.55);
		
		System.out.println("Before sorting:");
		for(Student student:s1)
			System.out.println(student);
		
		class StudentNameComp implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return value;
		}
		}
		class StudentMarksComp implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) {
				int value = Double.compare(o2.getMarks(), o1.getMarks());
				return value;
		}
		}
		class StudentCityComp implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getCity().compareTo(o2.getCity());
				return value;
		}	
		}
			
		do
		{
			System.out.println("0. Exit");
			System.out.println("1. Display Students sorted on their city in ascending order");
			System.out.println("2. Display Students sorted on their marks in descending order");
			System.out.println("3. Display Students sorted on their names in ascending order");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you!");
				break;
				
			case 1:
				Comparator<Student> city = new StudentCityComp();
				Arrays.sort(s1, city);
				System.out.println("Sorted according to city:");
				for(Student earr:s1)
					System.out.println(earr);
				break;
				
			case 2:
				Comparator<Student> Marks = new StudentMarksComp();
				Arrays.sort(s1, Marks);
				System.out.println("Sorted according to Marks:");
				for(Student earr:s1)
					System.out.println(earr);
				break;
				
			case 3:
				Comparator<Student> Name = new StudentNameComp();
				Arrays.sort(s1, Name);
				System.out.println("Sorted according to Name:");
				for(Student earr:s1)
					System.out.println(earr);
				break;
			}
		
		
	}while(choice!=0);

	

}

}
