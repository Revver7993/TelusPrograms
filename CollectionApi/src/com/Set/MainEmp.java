package com.Set;

import java.util.HashSet;
import java.util.Set;

public class MainEmp {

	public static void main(String[] args) {
		
		Set<Employee> eSet=new HashSet<>();
		Employee e1 = new Employee(90, "Abhishek");
	    Employee e2 = new Employee(75, "Swasti");
	    Employee e3 = new Employee(80, "Raja");
	    Employee e4 = new Employee(76, "Shivam");
	    Employee e5 = new Employee(95, "Pravin");
	    
	    eSet.add(e1);
	    eSet.add(e2);
	    eSet.add(e3);
	    eSet.add(e4);
	    eSet.add(e5);
	    
	    System.out.println(eSet);
	    
		}

		
		

	}

