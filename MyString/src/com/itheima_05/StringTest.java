package com.itheima_05;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		System.out.println("hello world".toUpperCase());
		String str1 = string.substring(0, 1);
		String str2 = string.substring(1);

		String str3 = str1.toUpperCase() + str2.toLowerCase();

		System.out.println("str3= " + str3);
	}
}
