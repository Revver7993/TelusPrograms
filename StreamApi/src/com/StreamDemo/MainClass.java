package com.StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(3);
		list.add(29);
		
		//Predicate<Integer> predicate=(e)->(e<20);
		
		//List<Integer> newList = list.stream().filter(predicate).collect(Collectors.toList());
		//System.out.println(newList);
		
		List<Integer> newList = list.stream().filter((e)->(e<20)).collect(Collectors.toList());
		System.out.println(newList);

	}

}
