package com.List;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Abhishek");
		Student s2 = new Student(2, "Sakshi");
		Student s3 = new Student(3, "Swasti");
		Student s4 = new Student(4, "Akhil");
		Student s5 = new Student(5, "Manaz");
		
		List<Student> nameOfStudent = new LinkedList<>();
		nameOfStudent.add(s1);
		nameOfStudent.add(s2);
		nameOfStudent.add(s3);
		nameOfStudent.add(s4);
		nameOfStudent.add(s5);
		
		System.out.println(nameOfStudent);
		

	}

}
