package com.CollectionClassDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(19);
		list.add(10);
		list.add(5);
		list.add(12);
	
//		Collections.sort(list); Sorting list using Collections
//		System.out.println(list);
		
//		List<Integer> collect = list.stream().sorted().collect(Collectors.toList()); // Sorting List using Lambda 
//		System.out.println(collect);
		
		
     	Collections.sort(list,Collections.reverseOrder()); // Sort in reverse order
		System.out.println(list);
		
//		Set<Integer> set = list.stream().collect(Collectors.toSet()); // Converting list to set
//		System.out.println(set);
		
//		Set<Integer> set= new HashSet<>(list);          // Converting list to set another method
//		System.out.println(set);
//		Set<Integer> collect=list.stream().collect(Collectors.toSet());
//		System.out.println(collect);
		

	}

}
