package com.array;

public class duplicateArray {
	public static void main(String[] args) {
	
	int arr[] = new int[]{ 2,3,4,6,4,6,1,2,5,7,8};
	duplicateDemo(arr);
    
}
	
public static int[] duplicateDemo(int[] arr) {
	int j = 0 ;
	int count = 0;
	int temp[] = {};
	for(int i =0 ;i<arr.length ; i++)
	if(arr[i] == arr[j+1]) {
		
		count++;
	}
	System.out.println(count);
	return temp;
}
	
}

