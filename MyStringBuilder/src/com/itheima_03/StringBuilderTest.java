package com.itheima_03;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("hello").append("world");

		String string = sBuilder.toString();
		System.out.println(string);

		String string2 = "helloworld";

		StringBuilder sBuilder2 = new StringBuilder(string2);
		System.out.println(sBuilder2);
	}
}
