package com.itheima_03;

import java.util.Scanner;

public class StringBuilderTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String string = scanner.nextLine();

		String reString = MyReverse(string);
		System.out.println("result:" + reString);
	}

	public static String MyReverse(String string) {
		StringBuilder sBuilder = new StringBuilder(string);
		sBuilder.reverse();

		String reString = sBuilder.toString();

		return reString;

	}
}
