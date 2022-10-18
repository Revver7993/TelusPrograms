package com.Set;

public class Employee {
	int marks;
	String name;
	public Employee(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Employee emp = (Employee) obj;
		return this.name.equals(emp.name);
	}
	


}
