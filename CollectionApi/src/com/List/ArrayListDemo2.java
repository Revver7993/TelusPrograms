package com.List;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Abhi");
	list.add("Akarsh");
	list.add("Saurabh");
	list.add("Rohit");
	list.add("Rohan");
	list.add(9, "Manish");	
	System.out.println(list);

}
}
