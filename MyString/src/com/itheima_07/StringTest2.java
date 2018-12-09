package com.itheima_07;

import java.util.Scanner;

public class StringTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String string = scanner.nextLine();

		String result = reverse(string);

		System.out.println("result =" + result);
	}

	public static String reverse(String str) {
		/*
		 * String ss = ""; for (int x = str.length() - 1; x >= 0; x--) { ss +=
		 * str.charAt(x); } return ss;
		 */

		char[] chs = str.toCharArray();

		for (int start = 0, end = str.length() - 1; start <= end; start++, end--) {
			char ch = chs[start];
			chs[start] = chs[end];
			chs[end] = ch;
		}

		String string = new String(chs);
		return string;

	}
}
