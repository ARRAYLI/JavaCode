package com.itcastheima_01;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		boolean ret = compare(num1, num2);
		System.out.println("ret = " + ret);

	}

	public static boolean compare(int a, int b) {
		return a == b;
	}
}
