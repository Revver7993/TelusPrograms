package com.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> tree= new TreeMap<>();
		tree.put(2, "Manish");
		tree.put(1, "Lalu");
		
		System.out.println(tree);
		

	}

}
