package com.loop;

public class LoopDemons {

	public static void main(String[] args) {
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		do {
//			System.out.println(i);
//		} while(i>0);
//		int i=0;
//		int arr[]= {1,4,3,2,4,5};
//		for(int j=0; j<arr.length; j++) {
//			System.out.println(arr[j]);
		int i=0;
		int arr[]= {1,3,4,2,4,5};
		for(int j:arr) {
			System.out.println(j);
		}
	}
}

