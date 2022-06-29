package com.array;

import java.util.Arrays;

public class binarySearch {
	public static void main(String[] args) {
		String [] arr = {"Ram","34","Shyam","Swap"};
		int res = Arrays.binarySearch(arr, 0, 4, "Swap");  // first index is inclusive...last index is exclusive..
		String[] res2 = Arrays.copyOf(arr, 5);
		
		System.arraycopy(arr, 0, res2, 0, 4);
		
		
		 
		System.out.println(Arrays.toString(res2));
		
		System.out.println(res);
		
	}

}
