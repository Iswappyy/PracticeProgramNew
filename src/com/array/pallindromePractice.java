package com.array;

public class pallindromePractice {
	public static void main(String[] args) {
		
	
	int num = 787;
	int temp = num;
	int rem = 0;
	int rev = 0;

	while(temp != 0) {
		rem = temp % 10;
		rev = rev * 10 + rem;
		
		temp = temp/10;
		
	}
	System.out.println(rev);
	if(num == rev) {
		System.out.println("num is pallindrome ..");
	}
	else
	{
		System.out.println("num is not is pallindrome ..");		
	}
}
}