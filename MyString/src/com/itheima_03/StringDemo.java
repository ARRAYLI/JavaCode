package com.itheima_03;

/*
 * �Ƚ��ַ����������Ƿ���ͬ
 */
public class StringDemo {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "Hello";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("--------------");

		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println("--------------");

		System.out.println(str1.startsWith("hell"));

	}
}
