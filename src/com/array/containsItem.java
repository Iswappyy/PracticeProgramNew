package com.array;

public class containsItem {
	public static void main(String[] args) {
		
	
	
	int [] arr = {100,204,120,340,124,435};
	System.out.println("the num contain in array list: "+ contain(arr,204));
	System.out.println("the num contain in array list: "+ contain(arr,200));
	
	
}

public static boolean contain (int[] arr ,int num) {
	for(int n : arr) {
		if(n == num) {
			return true;
		}
	}
			return false;
		
	
}
}