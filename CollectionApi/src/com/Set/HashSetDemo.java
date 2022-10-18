package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hset=new HashSet<>();
		hset.add("Manish");
		hset.add("Lalu");
		hset.add("Lalu");
		
		System.out.println(hset);
		
		Set<String> hset1=new LinkedHashSet<>();
		hset1.add("Manish");
		hset1.add("Lalu");
		hset1.add("Lalu");
		
		System.out.println(hset1);

	}

}
