package com.itheima_02;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();

		/*
		 * StringBuilder sBuilder2 = sBuilder.append("hello");
		 * 
		 * System.out.println("sb:" + sBuilder); System.out.println("sb2:" +
		 * sBuilder2); System.out.println(sBuilder == sBuilder2);
		 */
		/*
		 * sBuilder.append("hello"); sBuilder.append("world");
		 * sBuilder.append(true); sBuilder.append(100);
		 * 
		 * System.out.println(sBuilder);
		 */
		sBuilder.append("hello").append(true).append(110);
		System.out.println(sBuilder);

		sBuilder.reverse();
		System.out.println("sb:" + sBuilder);
	}
}
