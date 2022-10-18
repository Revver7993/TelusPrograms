package com.Map;

import java.util.HashMap;
import java.util.Map;

public class MainClassEmp {

	public static void main(String[] args) {
    Employee e1 = new Employee(111, "Abhishek", 25000);
    Employee e2 = new Employee(112, "Rahul", 10000);
    Employee e3 = new Employee(113, "Rohan", 15000);
    Employee e4 = new Employee(114, "Sohan", 18000);
    Employee e5 = new Employee(115, "Mohan", 19000);
    
    Map<Employee, Integer > map = new HashMap<>();
    map.put(e1, 1);
    map.put(e2, 2);
    map.put(e3, 3);
    map.put(e4, 4);  
    map.put(e5 ,5);
    
    System.out.println(map);
    
	}

}