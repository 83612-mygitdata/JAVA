package com.sunbeam.assig;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student(3,"Rose",80,"Kashmir"));
		studentList.add(new Student(1,"Lily",65,"Darjeeling"));
		studentList.add(new Student(4,"Jasmine",50,"Kanyakumari"));
		studentList.add(new Student(2,"Lotus",95,"Assam"));
		studentList.add(new Student(5,"Tulip",70,"Goa"));
		
		System.out.println("Before sorting:");
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		Collections.sort(studentList);
		
		System.out.println("After sorting:");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("****************************");
		System.out.println("Sorting based on names:");
		class StudentNameComp implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}
		Comparator<Student> NameComparator = new StudentNameComp();
		Collections.sort(studentList, NameComparator);
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("***************************");
		System.out.println("Sorting based on Marks:");
		class StudentMarksComp implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o2.getMarks(), o1.getMarks());
			}
		}
		Comparator<Student> MarksComparator = new StudentMarksComp();
		Collections.sort(studentList, MarksComparator);
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("******************************");
		System.out.println("Sorting based on city names:");
		class StudentCityComp implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getCity().compareTo(o2.getCity());
			}
		}
		Comparator<Student> CityComparator = new StudentCityComp();
		Collections.sort(studentList, CityComparator);
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		Student s1 = new Student();
		s1.setRollno(3);
		if(studentList.contains(s1))
		{
			System.out.println("Student with rollno 3 exists..");
		}
		else
		{
			System.out.println("Student with rollno 3 doesn't exists..");
		}
		
	}

}
