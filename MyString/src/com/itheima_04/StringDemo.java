package com.itheima_04;

public class StringDemo {
	public static void main(String[] args) {
		String string = "helloworld";

		System.out.println(string.length());
		System.out.println("----------");

		System.out.println(string.charAt(0));
		System.out.println(string.charAt(1));
		System.out.println("----------");

		System.out.println(string.indexOf("l"));
		System.out.println(string.indexOf("owo"));
		System.out.println("----------");

		System.out.println(string.substring(0));
		System.out.println(string.substring(5));
		System.out.println("----------");

		System.out.println(string.substring(3, 8));
		System.out.println("----------");
	}
}
