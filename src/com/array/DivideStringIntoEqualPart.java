package com.array;

public class DivideStringIntoEqualPart {
	public static void main(String[] args) {
		int n = 3;
		String s = "MyNameIsSwapnil";
		int len = s.length();
		int part=len/n;
		for(int i=0;i<len;i=i+part)
		{
			String s1=s.substring(i,i+part);
			System.out.println(s1);
		}
		
		
		}
	}


