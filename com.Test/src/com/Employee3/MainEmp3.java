package com.Employee3;

import java.util.HashSet;
import java.util.Set;

public class MainEmp3 {

	public static void main(String[] args) {
		
		Set<Employee3> elist = new HashSet<>();
		Employee3 e1 = new Employee3(01, "Abhi", 15000);
		Employee3 e2 = new Employee3(02, "Rohan", 10000);
		Employee3 e3 = new Employee3(03, "Sohan", 5000);
		Employee3 e4 = new Employee3(04, "Mohan", 8000);
		Employee3 e5 = new Employee3(05, "Goldy", 12000);
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		
		elist.stream().filter(a->a.getSal()<10000).forEach(a->a.setSal(a.getSal()+5000));
		System.out.println(elist);
		

	}

}
