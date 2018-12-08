package com.itcastheima_01;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int ret = max(num1, num2);
		System.out.println("max = " + ret);

	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
