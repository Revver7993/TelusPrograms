package com.Employee1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee(01, "Abhi", 50000);
		Employee e2 = new Employee(02, "Rohan", 40000);
		Employee e3 = new Employee(03, "Sohan", 60000);
		Employee e4 = new Employee(04, "Mohan", 85000);
		Employee e5 = new Employee(05, "Raja", 75000);
		Employee e6 = new Employee(06, "Anshu", 35000);
		Employee e7 = new Employee(07, "Anshu", 70000);
		
		
		Map<Employee, String> map = new LinkedHashMap<>();
		map.put(e1, "comp1");
		map.put(e2, "comp2");
		map.put(e3, "comp3");
		map.put(e4, "comp4");
		map.put(e5, "comp5");
		map.put(e6, "comp6");
		
		System.out.println(map);
		System.out.println(map.hashCode());
		

	}

}


