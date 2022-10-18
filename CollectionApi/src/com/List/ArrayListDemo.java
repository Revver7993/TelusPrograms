package com.List;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> listOfNAmes;
		ArrayList list = new ArrayList();
		// type unsafe collection
		list.add("Abhi");
		list.add(11);
		System.out.println(list);
		
		ArrayList<String> listOfNames = new ArrayList<>();
		// type safe collection
		listOfNames.add("Abhishek");
		listOfNames.add("Manaz");
		
		List<Integer> listOfNumber = new ArrayList<Integer>(); //dynamic binding
        listOfNumber.add(11);
	}

}
