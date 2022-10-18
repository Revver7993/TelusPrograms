package com.ComparableDemo;

public class Student implements Comparable<Student> {
	private Integer marks;
	private String name;
	
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student o) {
		return this.marks.compareTo(o.marks);
	}
	
	

}

