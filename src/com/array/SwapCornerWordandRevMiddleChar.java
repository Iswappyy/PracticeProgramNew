package com.array;

public class SwapCornerWordandRevMiddleChar {
	public static void main(String[] args) {
		String s1 = "Pro wings java and developer";
		System.out.println(s1);

		String[] str = s1.split(" ");

		String str1 = "";
		for (int i = 4; i >= 0; i--) {
			char[] ch1 = str[1].toCharArray();

			str1 = str1 + ch1[i];
		}
		//System.out.println(str1);

		String str2 = "";
		for (int i = 3; i >= 0; i--) {
			char[] ch2 = str[2].toCharArray();

			str2 = str2 + ch2[i];
		}
		//System.out.println(str2);

		String str3 = "";
		for (int i = 2; i >= 0; i--) {
			char[] ch3 = str[3].toCharArray();

			str3 = str3 + ch3[i];
		}
		//System.out.println(str3);

		s1 = s1.replace("wings", str1);
		s1 = s1.replace("java", str2);
		s1 = s1.replace("and", str3);

		//System.out.println(s1);

		String[] st = s1.split(" ");

		//System.out.println(st);

		for (int i = 4; i >= 0; i--) {
			System.out.print(st[i] + " ");
		}

	}
}