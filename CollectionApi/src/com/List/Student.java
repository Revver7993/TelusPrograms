package com.List;

public class Student {
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}
	

}
