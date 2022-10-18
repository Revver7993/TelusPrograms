package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> nameOfStudent = new LinkedList <>();
		nameOfStudent.add("Lalu");
		nameOfStudent.add("Swasti");
		nameOfStudent.add("Sakshi");
		nameOfStudent.add(1, "Abhishek");
		System.out.println(nameOfStudent);
		
		List<String> alist = new ArrayList<>(nameOfStudent);
		alist.add("Manish");
		System.out.println(alist);
		
		List<Integer> list = List.of(1,3,4,5);
		System.out.println(list);
		

	}

}
