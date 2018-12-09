package com.itheima;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();
		System.out.println("sb:" + sBuilder);

		System.out.println("sb.capcaity:" + sBuilder.capacity());
		System.out.println("sb.length:" + sBuilder.length());
	}
}
