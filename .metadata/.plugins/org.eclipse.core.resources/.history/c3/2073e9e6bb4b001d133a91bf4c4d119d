package com.Employee;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		SortedMap<Employee,String> sMap = new TreeMap<>((x,y)->x.getSalary()-y.getSalary());
		Employee e1=new Employee(1,"Abhi", 400000);
		Employee e2=new Employee(2,"Sohan", 200000);
		Employee e3=new Employee(3,"Mohan", 300000);
		Employee e4=new Employee(4,"Rohan", 100000);
		
		
		sMap.put(e1,"1");
        sMap.put(e2,"2");
		sMap.put(e3,"3");
		sMap.put(e4,"4");
		
		System.out.println(sMap);


	}

}
