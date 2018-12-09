package com.itheima_02;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println("s1:" + s1);
		System.out.println("s1:" + s1);
		System.out.println("s1==s2:" + (s1 == s2));
		System.out.println("--------------------");

		String s3 = "hello";
		System.out.println("s1==s3:" + (s1 == s3));
		System.out.println("s2==s3:" + (s3 == s2));

	}
}
