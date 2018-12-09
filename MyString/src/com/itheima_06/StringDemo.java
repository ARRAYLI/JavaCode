package com.itheima_06;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "helloworld";
		String str2 = "helloworld ";
		String str3 = " hello world ";

		System.out.println("------" + str1 + "------");
		System.out.println("------" + str1.trim() + "------");
		System.out.println("------" + str2 + "------");
		System.out.println("------" + str2.trim() + "------");
		System.out.println("------" + str3 + "------");
		System.out.println("------" + str3.trim() + "------");
		System.out.println("-----------------");

		String str4 = "aa,bb,cc";
		String[] strArray = str4.split(",");
		for (int x = 0; x < strArray.length; x++) {
			System.out.println(strArray[x]);
		}
	}
}
