package com.demo1;

public class ArrayMul {

	public static void main(String[] args) {
		int arr1[][]= {{2,4,6},{1,2,3},{5,6,7}};
		int arr2[][]= {{3,4,5},{7,1,4},{9,3,5}};
		int mult[][]=new int[3][3];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
					mult[i][j]=(arr1[i][j]*arr2[i][j]);
					System.out.print(mult[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
