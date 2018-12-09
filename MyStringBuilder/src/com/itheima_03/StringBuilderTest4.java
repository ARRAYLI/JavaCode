package com.itheima_03;

import java.util.Scanner;

public class StringBuilderTest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");

		String string = scanner.nextLine();

		boolean b = isSymmetry(string);
		System.out.println("b:" + b);

	}

	public static boolean isSymmetry(String s) {
		StringBuilder sBuilder = new StringBuilder(s);
		sBuilder.reverse();

		String result = sBuilder.toString();
		return result.equals(s);
	}
}
