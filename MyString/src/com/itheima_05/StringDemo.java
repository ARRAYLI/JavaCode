package com.itheima_05;

public class StringDemo {
	public static void main(String[] args) {
		String str = "abcde";

		char[] chs = str.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.err.println("------------");
		System.out.println("hello world".toUpperCase());
		System.out.println("hello world".toLowerCase());
	}
}
