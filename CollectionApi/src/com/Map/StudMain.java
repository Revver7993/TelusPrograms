package com.Map;

import java.util.*;
import java.util.Map;

public class StudMain {

	public static void main(String[] args) {
		Map<Student,String> map = new HashMap<>();
		Student s1 = new Student(11, "Abhishek",90 );
	    Student s2 = new Student(21, "Swasti", 95);
	    Student s3 = new Student(31, "Manaz", 80);
	    Student s4 = new Student(41, "Rohit", 85);
	    Student s5 = new Student(51, "Akhil", 70);
	    
	    map.put(s1,"DPS");
	    map.put(s2,"Allen");
	    map.put(s3,"Naini");
	    map.put(s4,"Beer");
	    map.put(s5,"Nirma");
	    
	    System.out.println(map);
	    
		}

	}