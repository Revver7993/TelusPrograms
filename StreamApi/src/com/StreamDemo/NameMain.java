package com.StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameMain {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Swasti");
		list.add("Manya");
		list.add("Aakrti");
		list.add("Aarushi");
		list.add("Srishti");
		
		ArrayList<String> newList=(ArrayList<String>) list.stream().filter((e)->(e.equals("Manya"))).collect(Collectors.toList());
		System.out.println(newList);
	}

}

