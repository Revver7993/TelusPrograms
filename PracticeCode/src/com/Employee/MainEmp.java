package com.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainEmp {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(111, "Abhi", 25000);
		Employee e2 = new Employee(112, "Raja", 20000);
		Employee e3 = new Employee(113, "Pravin", 18000);
		Employee e4 = new Employee(114, "Shivam", 15000);
		Employee e5 = new Employee(115, "Anoop", 21000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
//		Collections.sort(list,(x,y)->x.id-y.id); Sorting with Collections 
//		System.out.println(list);
		
//		System.out.println(Collections.max(list,(x,y)->x.getId()-y.getId())); Finding Max Using Collections Class
		
//		Collections.sort(list,Collections.reverseOrder((x,y)->x.getSal()-y.getSal()));	Sorting according Salary with Collection Class in reverse order
//		System.out.println(list);
		
//		list.stream().filter(x->x.getSal()<20000).forEach(x->x.setSal(x.getSal()+5000)); // Adding Bonus Using Lambda
//		System.out.println(list);
		
//		Set<Employee> set = list.stream().collect(Collectors.toSet()); // Converting list to set
//		System.out.println(set);
		
		for(Employee e:list) {             // Adding bonus with Enhanced for loop
			if (e.getSal()<20000) {
				e.setSal(e.getSal()+5000);
			}
			
		}
		System.out.println(list);
	}

}
