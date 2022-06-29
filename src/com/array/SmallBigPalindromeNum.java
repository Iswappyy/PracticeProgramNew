package com.array;

import java.util.Arrays;

public class SmallBigPalindromeNum {
	public static void main(String[] args) {
		String s = "Mom said racecar is on radar";
		
		s= s.toLowerCase();
		

		String[] str = s.split(" ");
		System.out.println(Arrays.toString(str));
		
		String[] str2 = new String[str.length];
		
		StringBuffer s3 = null;
		
		for(int i=0;i<str.length;i++) {
			s3 = new StringBuffer(str[i]);
			s3.reverse();
			
			String s5 = new String(s3);
			str[i] = s5;
		}
		
		System.out.println(Arrays.toString(str));
}
}